package UI;
import java.util.Scanner;
import Place.BasketBallCourt;
import Place.Playground;


public class BorrowPage {
	public static void Borrow() {
		System.out.println("----------------�뿩 ����� �����ϼ���--------------");
		System.out.println("|                                            |");
		System.out.println("| 0.�ڷΰ���     1.����      2.���      3.��    |");
		System.out.println("|                                            |");
		System.out.println("----------------------------------------------");
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		switch (N) {
		case 0: MainPage.FirstStep();
			break;
		case 1:
			break;
		case 2: SelectPlace();
			break;
		case 3:
			break;
		}
	}
	
	public static void SelectPlace() {
		System.out.println("----------------�뿩 ��Ҹ� �����ϼ���-------------");
		System.out.println("|                                            |");
		System.out.println("|  0.�ڷΰ���       1.�౸��          2.����     |");
		System.out.println("|                                            |");
		System.out.println("----------------------------------------------");
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		switch (N) {
		case 0: Borrow();
			break;
		case 1: Playground.getInstance().selectTimetable();
		 	MainPage.FirstStep();
			break;
		case 2: BasketBallCourt.getInstance().selectTimetable();
			break;
		}
		
	}
	
//	Grade
//	Age
//	PhoneNumber
//	Name
//	TemperaturePriorty
}
