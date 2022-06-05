package Object;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ObjectManager {

	private int ballCount = 5;
	private int airpumpCount = 5;
	private int tableCount = 5;
	private int tentCount = 5;

	private ArrayList<Ball> balllist = new ArrayList<Ball>();
	private ArrayList<AirPump> airpumplist = new ArrayList<AirPump>();
	private ArrayList<Table> tablelist = new ArrayList<Table>();
	private ArrayList<Tent> tentlist = new ArrayList<Tent>();

	public static ObjectManager objectmanager = new ObjectManager();

	public static ObjectManager getInstance() {
		return objectmanager;
	}

	ObjectManager() {
	}

	public void showObject() {
		System.out.println("공 남은 수량 : " + ballCount);
		System.out.println("에어펌프 남은 수량 : " + airpumpCount);
		System.out.println("테이블 남은 수량 : " + tableCount);
		System.out.println("텐트 남은 수량 : " + tentCount);
	}

	public void BorrowObject() {
		System.out.println("-------------대여할 물건을 선택하세요-------------");
		System.out.println("|                                          |");
		System.out.println("|        0. 뒤로가기                          |");
		System.out.println("|        1. 공                              |");
		System.out.println("|        2. 에어펌프                          |");
		System.out.println("|        3. 테이블                           |");
		System.out.println("|        4. 텐트                            |");
		System.out.println("|                                          |");
		System.out.println("-------------------------------------------");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println("-------------대여할 물건을 선택하세요-------------");
		System.out.println("|                                          |");
		System.out.println("|        대여할 개수를 입력하세요.                 |");
		System.out.println("|                                          |");
		System.out.println("-------------------------------------------");
		
		int count = sc.nextInt();
		
		System.out.println("-------------본인의 정보를 입력하세요.-------------");
		System.out.println("|                                          |");
		System.out.println("|   이름, 학년, 나이, 전화번호를 입력해주세요          |");
		System.out.println("|                                          |");
		System.out.println("|   ex)홍길동 2 21 01012345678               |");
		System.out.println("|                                          |");
		System.out.println("--------------------------------------------");
		
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		String Name = st.nextToken();
		int Grade = Integer.parseInt(st.nextToken());
		int Age = Integer.parseInt(st.nextToken());
		String PhoneNumber = st.nextToken();
		
		
		
		switch(N) {
		case 0 : 
			break;
		case 1 :
			break;
		case 2 :
			break;
		case 3 :
			break;
		case 4 :
			break;
	}

	public boolean check() {

	}

	public void deleteObject() {

	}
}