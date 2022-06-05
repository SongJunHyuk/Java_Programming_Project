package Place;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
import Borrow.Group;

public class BasketBallCourt extends Place{

	private HashMap<Group, Integer> hashmap = new HashMap<>();
	private boolean timeTable[][] = new boolean[6][7];
	
	Scanner sc = new Scanner(System.in);
	
	public static BasketBallCourt basketballcourt = new BasketBallCourt();
	
	public static BasketBallCourt getInstance() {
        return basketballcourt;
    }
	
	public void showTimeTable()
	{
		int starttime = 10;
		int endtime = 12;
		
		System.out.println("          월  화  수  목  금  토  일");
		for(int i = 0 ; i < 6; i++) {
			System.out.print(starttime + "시~" + endtime + "시");
			for(int j = 0 ; j < 7; j++)
			{
				System.out.print("  ");
				if(timeTable[i][j] == false)
					System.out.print(" ");
				else
					System.out.print("O");
			}
			starttime+=2;
			endtime+=2;
			System.out.println();
		}
	}
	
	public void selectTimetable()
	{
		while(true) {
			System.out.println("등록할 시간을 입력하세요.");
			System.out.println("ex)월 10시~12시");
			
			String enroll = sc.nextLine();
			String start = "";
			String end = "";
			char arr[] = new char[enroll.length()];
			
			for(int i = 0; i<enroll.length(); i++) {
				arr[i] = enroll.charAt(i);
			}
			
			char day = arr[0];
			start += arr[2]; start += arr[3];
			end += arr[6]; end += arr[7];
			
			int starttime = Integer.parseInt(start);
			int endtime = Integer.parseInt(end);
			if(starttime >= endtime) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			
			if(!timeTableCheck(dayToCol(day), startToTable(starttime), endToTable(endtime)))
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			
			else {
				enrollTable(dayToCol(day), startToTable(starttime), endToTable(endtime));
				break;
			}
		}
	}
	
	public void enrollTable(int day, int start, int end) {
		
		int val = ((start+1) *10 + (end+1));
		
		System.out.println("단체의 이름, 단체의 사람 수, 단체의 대표이름을 말하세요");
		System.out.println("ex) 소울음 5 홍길동");
		
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		String name = st.nextToken();
		int num = Integer.parseInt(st.nextToken());
		String representative = st.nextToken();
		hashmap.put(new Group(name, num, representative), val) ;
		
		for(int i = start ; i <= end; i++) {
			timeTable[i][day] = true;
		}
		System.out.println("등록이 완료되었습니다.");
		showTimeTable();
	}

	public void deleteTable() {
		while (true) {
			System.out.println("대표의 이름과 반납할 시간을 입력하세요.");
			System.out.println("ex)홍길동 월 10시~12시");
			String tmp = sc.nextLine();

			int pos = tmp.indexOf(' ');
			String Name = tmp.substring(0, pos);
			tmp = tmp.substring(pos + 1);

			String start = "";
			String end = "";
			
			char arr[] = new char[tmp.length()];

			for (int i = 0; i < tmp.length(); i++) {
				arr[i] = tmp.charAt(i);
			}

			char day = arr[0];
			start += arr[2];
			start += arr[3];
			end += arr[6];
			end += arr[7];
			int starttime = Integer.parseInt(start);
			int endtime = Integer.parseInt(end);
			if (starttime >= endtime) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				continue;
			}
			else {
				Iterator<Group> iter = hashmap.keySet().iterator();
				while(iter.hasNext()) {
					Group group = iter.next();
					if(group.getRepresentativeName().equals(Name))
						iter.remove();
				}
				
				delete(dayToCol(day), startToTable(starttime), endToTable(endtime));
				System.out.println("반납이 완료 되었습니다.");
				showTimeTable();
				break;
			}
			
		}
	}
	
	public void delete(int day, int start, int end) {
		for(int i = start ; i <= end; i++) {
			timeTable[i][day] = false;
		}
	}
	
	public int dayToCol(char day) {
		int col = 0;
		if(day == '월')
			col = 0;
		else if(day == '화')
			col = 1;
		else if(day == '수')
			col = 2;
		else if(day == '목')
			col = 3;
		else if(day == '금')
			col = 4;
		else if(day == '토')
			col = 5;
		else if(day == '일')
			col = 6;
		else
			System.out.println("입력이 잘못 되었습니다.");
		return col;
	}
	
	public int startToTable(int starttime) {
		int st = 0;
		if(starttime == 10)
			st = 0;
		else if(starttime == 12)
			st = 1;
		else if(starttime == 14)
			st = 2;
		else if(starttime == 16)
			st = 3;
		else if(starttime == 18)
			st = 4;
		else if(starttime == 20)
			st = 5;
		return st;
	}
	
	public int endToTable(int endtime)
	{
		int en = 0;
		if(endtime == 12)
			en = 0;
		else if(endtime == 14)
			en = 1;
		else if(endtime == 16)
			en = 2;
		else if(endtime == 18)
			en = 3;
		else if(endtime == 20)
			en = 4;
		else if(endtime == 22)
			en = 5;
		return en;
	}
	
	public boolean timeTableCheck(int col, int rowstart, int rowend)
	{
		for(int i = rowstart ; i <= rowend; i++) {
			if(timeTable[i][col] == true)
				return false;
		}
		return true;
	}
}
