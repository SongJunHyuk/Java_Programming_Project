package UI;
import java.util.Scanner;
import Place.BasketBallCourt;
import Place.Playground;
import Room.ClassRoom;


public class BorrowPage {
	public static void Borrow() {
		System.out.println("----------------대여 대상을 선택하세요--------------");
		System.out.println("|                                            |");
		System.out.println("| 0.뒤로가기     1.물건      2.장소      3.방    |");
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
		case 3: SelectClassRoom();
			break;
		}
	}
	
	public static void SelectPlace() {
		System.out.println("----------------대여 장소를 선택하세요-------------");
		System.out.println("|                                            |");
		System.out.println("|  0.뒤로가기       1.축구장          2.농구장     |");
		System.out.println("|                                            |");
		System.out.println("----------------------------------------------");
		Scanner sc = new Scanner(System.in);
	
		int N = sc.nextInt();
		sc.close();
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
	
	public static void SelectClassRoom() {
		System.out.println("----------------대여 교실을 선택하세요-------------");
		System.out.println("|                                            |");
		System.out.println("|     0.뒤로가기                  1.교실        |");
		System.out.println("|                                            |");
		System.out.println("----------------------------------------------");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		switch(n) {
		case 0: Borrow();
			break;
		case 1: ClassRoom.reservationClassRoom();
			MainPage.FirstStep();
			break;
		}
		
	}
	
//	Grade
//	Age
//	PhoneNumber
//	Name
//	TemperaturePriorty
}
