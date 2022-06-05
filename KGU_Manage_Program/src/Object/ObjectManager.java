package Object;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

import Borrow.Group;

public class ObjectManager {

	private int ballCount = 5;
	private int airpumpCount = 5;
	private int tableCount = 5;
	private int tentCount = 5;

	private ArrayList<Ball> balllist = new ArrayList<Ball>();
	private ArrayList<AirPump> airpumplist = new ArrayList<AirPump>();
	private ArrayList<Table> tablelist = new ArrayList<Table>();
	private ArrayList<Tent> tentlist = new ArrayList<Tent>();

	Scanner sc = new Scanner(System.in);

	public static ObjectManager objectmanager = new ObjectManager();

	public static ObjectManager getInstance() {
		return objectmanager;
	}

	public void showObject() {
		System.out.println("남은 공 개수 : " + ballCount);
		System.out.println("남은 에어펌프 개수 : " + airpumpCount);
		System.out.println("남은 테이블 개수 : " + tableCount);
		System.out.println("남은 텐트 개수 : " + tentCount);
	}

	public void SelectObject() {
		System.out.println("-------------대여할 물건을 선택하세요-------------");
		System.out.println("|                                          |");
		System.out.println("|        1. 공                              |");
		System.out.println("|        2. 에어펌프                          |");
		System.out.println("|        3. 테이블                           |");
		System.out.println("|        4. 텐트                            |");
		System.out.println("|                                          |");
		System.out.println("-------------------------------------------");
		int N = sc.nextInt();

		System.out.println("---------------대여개수를 고르세요---------------");
		System.out.println("|                                          |");
		System.out.println("|        대여할 개수를 입력하세요.                 |");
		System.out.println("|                                          |");
		System.out.println("-------------------------------------------");

		int count = sc.nextInt();

		switch (N) {
		case 1:
			if (checkBallCount(count))
				break;
			else {
				System.out.println("요청하는 개수 보다 남은 개수가 부족합니다.");
				System.out.println("다시 입력해주세요");
				SelectObject();
				break;
			}
		case 2:
			if (checkAirpumpCount(count))
				break;
			else {
				System.out.println("요청하는 개수 보다 남은 개수가 부족합니다.");
				System.out.println("다시 입력해주세요");
				SelectObject();
				break;
			}
		case 3:
			if (checkTableCount(count))
				break;
			else {
				System.out.println("요청하는 개수 보다 남은 개수가 부족합니다.");
				System.out.println("다시 입력해주세요");
				SelectObject();
				break;
			}
		case 4:
			if (checkTentCount(count))
				break;
			else {
				System.out.println("요청하는 개수 보다 남은 개수가 부족합니다.");
				System.out.println("다시 입력해주세요");
				SelectObject();
				break;
			}
		}

		System.out.println("-------------본인의 정보를 입력하세요.-------------");
		System.out.println("|                                          |");
		System.out.println("|             이름을 입력해주세요                |");
		System.out.println("|                                          |");
		System.out.println("|         ex)  홍길동                        |");
		System.out.println("|                                          |");
		System.out.println("--------------------------------------------");


		String Name = sc.next();
		
		System.out.println("-------------본인의 정보를 입력하세요.-------------");
		System.out.println("|                                          |");
		System.out.println("|             전화번호를 입력해주세요             |");
		System.out.println("|                                          |");
		System.out.println("|         ex)     01012345678              |");
		System.out.println("|                                          |");
		System.out.println("--------------------------------------------");
		
		String PhoneNumber = sc.next();

		switch (N) {
		case 1:
			enrollBall(PhoneNumber, count);
			break;
		case 2:
			enrollAirpump(PhoneNumber, count);
			break;
		case 3:
			enrollTable(PhoneNumber, count);
			break;
		case 4:
			enrollTent(PhoneNumber, count);
			break;
		}
		System.out.println("------등록이 완료되었습니다.------");
		return;
	}

	public boolean checkBallCount(int count) {
		if (ballCount >= count)
			return true;
		else
			return false;
	}

	public boolean checkAirpumpCount(int count) {
		if (airpumpCount >= count)
			return true;
		else
			return false;
	}

	public boolean checkTableCount(int count) {
		if (tableCount >= count)
			return true;
		else
			return false;
	}

	public boolean checkTentCount(int count) {
		if (tentCount >= count)
			return true;
		else
			return false;
	}

	public void enrollBall(String PhoneNumber, int count) {
		balllist.add(new Ball(count, PhoneNumber));
		ballCount -= count;
	}

	public void enrollAirpump(String PhoneNumber, int count) {
		airpumplist.add(new AirPump(count, PhoneNumber));
		airpumpCount -= count;
	}

	public void enrollTable(String PhoneNumber, int count) {
		tablelist.add(new Table(count, PhoneNumber));
		tableCount -= count;
	}

	public void enrollTent(String PhoneNumber, int count) {
		tentlist.add(new Tent(count, PhoneNumber));
		tentCount -= count;
	}

	public void deleteObject() {
		System.out.println("-------------반납할 물건을 선택하세요-------------");
		System.out.println("|                                          |");
		System.out.println("|        0. 뒤로가기                          |");
		System.out.println("|        1. 공                              |");
		System.out.println("|        2. 에어펌프                          |");
		System.out.println("|        3. 테이블                           |");
		System.out.println("|        4. 텐트                            |");
		System.out.println("|                                          |");
		System.out.println("-------------------------------------------");

		int N = sc.nextInt();

		System.out.println("---------------반납개수를 고르세요---------------");
		System.out.println("|                                          |");
		System.out.println("|        반납할 개수를 입력하세요.                 |");
		System.out.println("|                                          |");
		System.out.println("-------------------------------------------");

		int count = sc.nextInt();

		System.out.println("-------------본인의 정보를 입력하세요.-------------");
		System.out.println("|                                          |");
		System.out.println("|             이름을 입력해주세요                |");
		System.out.println("|                                          |");
		System.out.println("|         ex)  홍길동                        |");
		System.out.println("|                                          |");
		System.out.println("--------------------------------------------");


		String Name = sc.next();
		
		System.out.println("-------------본인의 정보를 입력하세요.-------------");
		System.out.println("|                                          |");
		System.out.println("|             전화번호를 입력해주세요             |");
		System.out.println("|                                          |");
		System.out.println("|         ex)     01012345678              |");
		System.out.println("|                                          |");
		System.out.println("--------------------------------------------");
		
		String PhoneNumber = sc.next();

		switch (N) {
		case 1:
			DeleteBall(PhoneNumber, count);
			break;
		case 2:
			DeleteAirpump(PhoneNumber, count);
			break;
		case 3:
			DeleteTable(PhoneNumber, count);
			break;
		case 4:
			DeleteTent(PhoneNumber, count);
			break;
		}

	}

	public void DeleteBall(String PhoneNumber, int count) {
		Iterator<Ball> iter = balllist.iterator();
		boolean check = false;
		while (iter.hasNext()) {
			Ball ball = iter.next();
			if (ball.getNumber().equals(PhoneNumber)) {
				if (ball.getQuantity() == count) {

					iter.remove();
					check = true;
					ballCount += count;
					break;
				}
			}
		}
		if (check == false)
			System.out.println("---잘못된 정보를 입력하셨습니다.---");
		else
			System.out.println("------반납이 완료 되었습니다.------");
	}

	public void DeleteAirpump(String PhoneNumber, int count) {
		Iterator<AirPump> iter = airpumplist.iterator();
		boolean check = false;
		while (iter.hasNext()) {
			AirPump airpump = iter.next();
			if (airpump.getNumber().equals(PhoneNumber)) {
				if (airpump.getQuantity() == count) {

					iter.remove();
					check = true;
					airpumpCount += count;
					break;
				}
			}
		}
		if (check == false)
			System.out.println("---잘못된 정보를 입력하셨습니다.---");
		else
			System.out.println("------반납이 완료 되었습니다.------");
	}

	public void DeleteTable(String PhoneNumber, int count) {
		Iterator<Table> iter = tablelist.iterator();
		boolean check = false;
		while (iter.hasNext()) {
			Table table = iter.next();
			if (table.getNumber().equals(PhoneNumber)) {
				if (table.getQuantity() == count) {
					iter.remove();
					check = true;
					tableCount += count;
					break;
				}

			}
		}
		if (check == false)
			System.out.println("잘못된 정보를 입력하셨습니다.");
		else
			System.out.println("------반납이 완료 되었습니다.------");
	}

	public void DeleteTent(String PhoneNumber, int count) {
		Iterator<Tent> iter = tentlist.iterator();
		boolean check = false;
		while (iter.hasNext()) {
			Tent tent = iter.next();
			if (tent.getNumber().equals(PhoneNumber)) {
				if (tent.getQuantity() == count) {
					iter.remove();
					check = true;
					tentCount += count;
					break;
				}
			}
		}
		if (check == false)
			System.out.println("잘못된 정보를 입력하셨습니다.");
		else
			System.out.println("------반납이 완료 되었습니다.------");
	}
}