package UI;
import java.util.Scanner;
import java.util.StringTokenizer;
import Borrow.Indivisual;


public class BorrowPage {
	public static void Borrow() {
		System.out.println("---------------다음 중 하나를 선택하세요-----------");
		System.out.println("|                                          |");
		System.out.println("|  0.뒤로가기      1.개인              2.단체   |");
		System.out.println("|                                          |");
		System.out.println("--------------------------------------------");
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		switch (N) {
		case 0: EndPage.SystemOff();
			break;
		case 1: setPerson();
			break;
		case 2: setGroup();
			break;
		}
		sc.close();
	}
	
//	Grade
//	Age
//	PhoneNumber
//	Name
//	TemperaturePriorty
	
	public static void setPerson() {
		Indivisual person = new Indivisual();
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------학년을 입력하세요-----------");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		int grade = sc.nextInt();
		person.setGrade(grade);
	}
	
	public static void setGroup() {
		
	}
}
