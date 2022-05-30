package UI;
import java.util.Scanner;
import java.util.StringTokenizer;

import Borrow.Indivisual;

public class ReturnPage {
	public static void Return()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------반납할 대상을 선택하세요-------------");
		System.out.println("|                                          |");
		System.out.println("| 0.뒤로가기     1.물건      2.장소      3.방    |");
		System.out.println("|                                          |");
		System.out.println("--------------------------------------------");
		
		int N = sc.nextInt();
		switch (N) {
		case 0: MainPage.FirstStep();
			break;
		case 1: ReturnObject();
			break;
		case 2: ReturnPlace();
			break;
		case 3: SelectReturnRoom();
			break;
		}
		sc.close();
	}
	
	public static void SelectReturnRoom()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------반납할 대상을 선택하세요-------------");
		System.out.println("|                                          |");
		System.out.println("| 0.뒤로가기     1.교실            2.방         |");
		System.out.println("|                                          |");
		System.out.println("--------------------------------------------");
		
		int N = sc.nextInt();
		switch (N) {
		case 0: MainPage.FirstStep();
			break;
		case 1: ReturnObject();
			break;
		case 2: 
			break;
		case 3: selectReturnRoom();
			break;
		
		}
	}
	
	public static void ReturnObject()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------------------------");
		System.out.println("|                                           |");
		System.out.println("|    본인의 이름과 전화번호와 반납할 물건울 입력하세요     |");
		System.out.println("|                                           |");
		System.out.println("|    ex) 홍길동 01012345678    100            |");
		System.out.println("|                                           |");
		System.out.println("--------------------------------------------");
		
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		Indivisual person = new Indivisual();
		person.setName(st.nextToken());
		person.setPhoneNumber(st.nextToken());
		st.nextToken(); // 수정예정
		sc.close();
	}
	
	public static void ReturnPlace()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------------------------");
		System.out.println("|                                           |");
		System.out.println("|    본인의 이름과 반납할 장소의 번호를 입력하세요       |");
		System.out.println("|                                           |");
		System.out.println("--------------------------------------------");
		
		String str = sc.nextLine();
		sc.close();
	}
	
	public static void selectReturnRoom()
	{
		
	}
}
