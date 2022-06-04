package Room;

import java.util.Scanner;
import java.util.Vector;

class Scheduler extends ClassRoom {
	private static final int PRIORITY_AM = 1;		// Finish lecture as soon as possible
	private static final int PRIORITY_PM = 2;		// Start lecture as soon as possible
	private static final int PRIORITY_FREETIME = 3;	// Without rest as much as possible
	
	private char timeTable[][];
	private int candidateList[];
	
	private Vector<Subject> subjectList;
	public Scanner scanner;
	
	Scheduler() {
		timeTable = new char[9][7];
		subjectList = new Vector<Subject>();
		scanner = new Scanner(System.in);
	}
	
	public void showSubject() {
		System.out.println("Subject List\n");

		for (Subject subject: subjectList) {
			System.out.println("Name: " + subject.name);
			System.out.print("Time: ");
			for (int i = 0; i < subject.dupTime; i++) {
				if (i != 0) {
					System.out.print(" / ");
				}
				printTimeList(subject.timeList[i], subject.timeList[i].length);
			}
			System.out.println("\n");
		}
	}
	
	public boolean addSubject() {
		Subject subject = new Subject();

		if (subjectList.size() >= 10) {
			System.out.println("The maximum number of subject that can be input is 10");
			return false;
		}

		System.out.println("Input subject name");
		System.out.print(">> ");
		subject.name = scanner.next();

		System.out.println("Input number of \'" + subject.name + "\' subject duplication times (Maximum 3 times)");
		System.out.print(">> ");
		subject.dupTime = scanner.nextInt();

		if (subject.dupTime < 1 || subject.dupTime > 3) {
			System.out.println("[ERROR] Wrong input, Cancel to input new subject");
			return false;
		}

		for (int i = 0; i < subject.dupTime; i++) {
			System.out.println("Input \'" + subject.name + "\' subject time with refer as below example (" + (i + 1) + " / " + subject.dupTime + ")");
			System.out.println("Sun: A, Mon: B, Tue: C, Wen: D, Thu: E, FRi: F, Sat: G");
			System.out.println("If you want to add \'Mon 1, Mon 2, Wen 1\' and \'Tue 3, Thu 3, Thu 4\' times");
			System.out.println("Please input B1B2D1(Enter) and C3E3E4(Enter)");
			System.out.print(">> ");
			subject.timeList[i] = scanner.next().toCharArray();

			int size = subject.timeList[i].length;
			if (size % 2 != 0) {
				System.out.println("[ERROR] Wrong input, Cancel to input new subject");
				return false;
			}
			for (int j = 0; j < size; j++) {
				// Check input alphabet or number is correct
				if ((j % 2 == 0 && ((subject.timeList[i][j] < 'a' || subject.timeList[i][j] > 'g')
					&& (subject.timeList[i][j] < 'A' || subject.timeList[i][j] > 'G')))
					|| (j % 2 == 1 && (subject.timeList[i][j] < '1' || subject.timeList[i][j] > '9'))) {
					System.out.println("[ERROR] Wrong input, Cancel to input new subject");
					return false;
				}
			}
		}

		System.out.println("Input new subject information\n");
		System.out.println("Name: " + subject.name);
		System.out.print("Time: ");
		for (int i = 0; i < subject.dupTime; i++) {
			if (i != 0) {
				System.out.print(" / ");
			}
			printTimeList(subject.timeList[i], subject.timeList[i].length);
		}

		subjectList.add(subject);

		return true;
	}
	
	public boolean removeSubject() {
		showSubject();

		String name;
		System.out.println("Please input subject name for remove");
		System.out.print(">> ");
		name = scanner.next();

		for (Subject subject: subjectList) {
			if (name.equals(subject.name)) {
				subjectList.remove(subject);
				System.out.println("Remove \'" + name + "\' subject, Newest subjectList as below\n");
				showSubject();
				return true;
			}
		}

		System.out.println("[ERROR] Couldn't find \'" + name + "\' subject\n");
		return false;
	}
	
	public boolean makeSchedule() {
		int priority;
		int tempList[];
		int score[] = new int[1];	// For call-by-reference
		score[0] = 999999;

		printMessage2();
		priority = scanner.nextInt();
		switch (priority) {
		case PRIORITY_AM:
		case PRIORITY_PM:
		case PRIORITY_FREETIME:
			tempList = new int[subjectList.size()];
			candidateList = new int[subjectList.size()];

			checkSchedule(priority, tempList, 0, score);

			System.out.println();
			if (score[0] != 999999) {
				if (priority == PRIORITY_AM) {
					System.out.println("AM Schedule\n");
				} else if (priority == PRIORITY_PM) {
					System.out.println("PM Schedule\n");
				} else {
					System.out.println("Not Free Time Schedule\n");
				}
				printSchedule();
			} else {
				System.out.println("[ERROR] Couldn't make schedule with input subject information");
			}
			
			break;
		default:
			System.out.println("[ERROR] Wrong input, Cancel to input new subject");
			return false;
		}

		return true;
	}

	private void checkSchedule(int priority, int tempList[], int listPivot, int score[]) {
		Subject subject = subjectList.get(listPivot);
		for (int i = 0; i < subject.dupTime; i++) {
			tempList[listPivot] = i;

			// Last pivot, Check schedule is available and best 
			if (listPivot + 1 == subjectList.size()) {
				checkScore(priority, tempList, score);
			} else {
				checkSchedule(priority, tempList, listPivot + 1, score);
			}
		}
	}

	private void checkScore(int priority, int tempList[], int score[]) {
		char tempTable[][] = new char[9][7];

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 9; j++) {
				tempTable[j][i] = 0;
			}
		}

		for (int i = 0; i < subjectList.size(); i++) {
			Subject subject = subjectList.get(i);
			for (int j = 0; j < subject.timeList[tempList[i]].length; j += 2) {
				if (subject.timeList[tempList[i]][j] >= 'a') {
					if (tempTable[subject.timeList[tempList[i]][j + 1] - '1'][subject.timeList[tempList[i]][j] - 'a'] != 0) {
						// Duplicated subjects, Skip check more
						return;
					}
					tempTable[subject.timeList[tempList[i]][j + 1] - '1'][subject.timeList[tempList[i]][j] - 'a'] = (char)((int)'A' + i);
				} else {
					if (tempTable[subject.timeList[tempList[i]][j + 1] - '1'][subject.timeList[tempList[i]][j] - 'A'] != 0) {
						// Duplicated subjects, Skip check more
						return;
					}
					tempTable[subject.timeList[tempList[i]][j + 1] - '1'][subject.timeList[tempList[i]][j] - 'A'] = (char)((int)'A' + i);
				}
			}
		}

		int amScore = 0;
		int pmScore = 0;
		int freeTimeScore = 0;

		for (int i = 0; i < 7; i++) {
			int amChecker = -1;
			boolean pmChecker = true;
			int freeTimeChecker = -1;

			for (int j = 0; j < 9; j++) {
				// Check last subject time
				if (tempTable[j][i] != 0) {
					amChecker = j + 1;
				}
				// Check first subject time
				if (tempTable[j][i] != 0 && pmChecker) {
					pmScore += j;
					pmChecker = false;
				}
				// Check free time between subjects
				if (tempTable[j][i] != 0 && freeTimeChecker == -1) {
					freeTimeChecker = j;
				} else if (tempTable[j][i] != 0 && freeTimeChecker != -1) {
					freeTimeScore += j - freeTimeChecker - 1;
					freeTimeChecker = j;
				}
			}

			if (amChecker != -1) {
				amScore += amChecker;
			}
		}

		int tempScore;
		if (priority == PRIORITY_AM) {
			tempScore = amScore * 10000 + freeTimeScore * 100 + (99 - pmScore);
		} else if (priority == PRIORITY_PM) {
			tempScore = (990000 - (pmScore * 10000)) + freeTimeScore * 100 + amScore;
		} else {
			tempScore = freeTimeScore * 10000 + amScore * 100 + (99 - pmScore);
		}

		if (tempScore < score[0]) {
			score[0] = tempScore;
			for (int i = 0; i < subjectList.size(); i++) {
				candidateList[i] = tempList[i];
			}
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 7; j++) {
					timeTable[i][j] = tempTable[i][j];
				}
			}
		}

	}

	private void printSchedule() {
		System.out.println("|   |Sun|Mon|Tue|Wen|Thu|Fri|Sat|");
		for (int i = 0; i < 9; i++) {
			System.out.print("| " + (i + 1) + " |");
			for (int j = 0; j < 7; j++) {
				if (timeTable[i][j] != 0) {
					System.out.print(" " + timeTable[i][j] + " |");
				} else {
					System.out.print("   |");
				}
			}
			System.out.println();
		}

		for (int i = 0; i < subjectList.size(); i++) {
			Subject subject = subjectList.get(i);
			System.out.println("" + (char)('A' + i) + ": " + subject.name);
		}
	}
	
	public static void printMessage() {
		System.out.println("Please Input operation number");
		System.out.println("1. Show Input Subject");
		System.out.println("2. Add New Subject");
		System.out.println("3. Remove Input Subject");
		System.out.println("4. Make Schedule");
		System.out.println("5. Exit");
		System.out.print(">> ");
	}
	
	public static void printMessage2() {
		System.out.println("Please Input priority type to make scheduler");
		System.out.println("1. AM Schedule");
		System.out.println("2. PM Schedule");
		System.out.println("3. Not Free Time Schedule");
		System.out.println("4. Cancel");
		System.out.print(">> ");
	}
	
	public static void printTimeList(char pTime[], int size) {
		for (int i = 0; i < size; i++) {
			if (i % 2 == 0) {
				if (i != 0) {
					System.out.print(", ");
				}

				if (pTime[i] == 'A' || pTime[i] == 'a') {
					System.out.print("Sun ");
				} else if (pTime[i] == 'B' || pTime[i] == 'b') {
					System.out.print("Mon ");
				} else if (pTime[i] == 'C' || pTime[i] == 'c') {
					System.out.print("Tue ");
				} else if (pTime[i] == 'D' || pTime[i] == 'd') {
					System.out.print("Wen ");
				} else if (pTime[i] == 'E' || pTime[i] == 'e') {
					System.out.print("Thu ");
				} else if (pTime[i] == 'F' || pTime[i] == 'f') {
					System.out.print("Fri ");
				} else if (pTime[i] == 'G' || pTime[i] == 'g') {
					System.out.print("Sat ");
				}
			} else {
				System.out.print(pTime[i] - '1' + 1);
			}
		}
	}
	
	public static void main(String[] args) {
		Scheduler scheduler = new Scheduler();
		int ret;
		
		do {
			printMessage();
			ret = scheduler.scanner.nextInt();
			switch (ret) {
			case 1:
				System.out.println();
				scheduler.showSubject();
				break;
			case 2:
				System.out.println();
				scheduler.addSubject();
				System.out.println("\n");
				break;
			case 3:
				System.out.println();
				scheduler.removeSubject();
				break;
			case 4:
				System.out.println();
				scheduler.makeSchedule();
				System.out.println();
				break;
			case 5:
				System.out.println("Exit Scheduler, Please input any key to finish process");
				scheduler.scanner.close();
				break;
			default:
				System.out.println("[ERROR] Wrong Input, Please Input again");
			}
		} while (ret != 5);
	}
	
	public class Subject {
		String name;
		int dupTime;
		char timeList[][] = new char[3][13];
	}
}
