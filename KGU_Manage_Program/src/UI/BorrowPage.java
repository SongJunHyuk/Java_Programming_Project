package UI;
import java.util.Scanner;
import java.util.StringTokenizer;
import Borrow.Indivisual;


public class BorrowPage {
	public static void Borrow() {
		System.out.println("---------------���� �� �ϳ��� �����ϼ���-----------");
		System.out.println("|                                          |");
		System.out.println("|  0.�ڷΰ���      1.����              2.��ü   |");
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
		System.out.println("--------------�г��� �Է��ϼ���-----------");
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
