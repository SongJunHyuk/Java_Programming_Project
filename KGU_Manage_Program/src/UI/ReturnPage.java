package UI;

import java.util.Scanner;
import java.util.StringTokenizer;

import Borrow.Indivisual;
import Object.ObjectManager;
import Place.BasketBallCourt;
import Place.Playground;
import Room.ClassRoom;
import Room.MeetingRoom;

public class ReturnPage {
	public static void Return() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------반납할 대상을 선택하세요-------------");
		System.out.println("|                                          |");
		System.out.println("| 0.뒤로가기     1.물건      2.장소      3.방   |");
		System.out.println("|                                          |");
		System.out.println("--------------------------------------------");

		int N = sc.nextInt();
		switch (N) {
		case 0:
			MainPage.FirstStep();
			break;
		case 1:
			ObjectManager.getInstance().deleteObject();
			MainPage.FirstStep();
			break;
		case 2:
			ReturnPlace();
			MainPage.FirstStep();
			break;
		case 3:
			SelectReturnRoom();
			break;
		}
		sc.close();
	}

	public static void ReturnPlace() {
		System.out.println("----------------반납 장소를 선택하세요-------------");
		System.out.println("|                                            |");
		System.out.println("|  0.뒤로가기       1.축구장          2.농구장     |");
		System.out.println("|                                            |");
		System.out.println("----------------------------------------------");
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		switch (N) {
		case 0:
			Return();
			break;
		case 1:
			Playground.getInstance().deleteTable();
			MainPage.FirstStep();
			break;
		case 2:
			BasketBallCourt.getInstance().deleteTable();
			break;
		}

	}

	public static void SelectReturnRoom() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------반납할 대상을 선택하세요-------------");
		System.out.println("|                                          |");
		System.out.println("| 0.뒤로가기         1.교실         2.회의실   |");
		System.out.println("|                                          |");
		System.out.println("--------------------------------------------");

		int N = sc.nextInt();
		switch (N) {
		case 0:
			MainPage.FirstStep();
			break;
		case 1:
			SelectReturnClassRoom();
			break;
		case 2:
			SelectReturnMeetingRoom();
		}
	}

	public static void SelectReturnClassRoom() {
		System.out.println("----------------반납 회의실을 선택하세요-------------");
		System.out.println("|                                            |");
		System.out.println("|     0.뒤로가기                               |");
		System.out.println("|     1.ClassRoom001                         |");
		System.out.println("|     2.ClassRoom002                         |");
		System.out.println("|     3.ClassRoom101                         |");
		System.out.println("|     4.ClassRoom102                         |");
		System.out.println("|     5.ClassRoom201                         |");
		System.out.println("|     6.ClassRoom202                         |");
		System.out.println("|     7.ClassRoom301                         |");
		System.out.println("|     8.ClassRoom302                         |");
		System.out.println("|     9.ClassRoom401                         |");
		System.out.println("|                                            |");
		System.out.println("----------------------------------------------");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		switch (n) {
		case 0:
			Return();
			break;
		case 1:
			ClassRoom.getInstance001().deleteTable();
			MainPage.FirstStep();
			break;
		case 2:
			ClassRoom.getInstance002().deleteTable();
			MainPage.FirstStep();
			break;
		case 3:
			ClassRoom.getInstance101().deleteTable();
			MainPage.FirstStep();
			break;
		case 4:
			ClassRoom.getInstance102().deleteTable();
			MainPage.FirstStep();
			break;
		case 5:
			ClassRoom.getInstance201().deleteTable();
			MainPage.FirstStep();
			break;
		case 6:
			ClassRoom.getInstance202().deleteTable();
			MainPage.FirstStep();
			break;
		case 7:
			ClassRoom.getInstance301().deleteTable();
			MainPage.FirstStep();
			break;
		case 8:
			ClassRoom.getInstance302().deleteTable();
			MainPage.FirstStep();
			break;
		case 9:
			ClassRoom.getInstance401().deleteTable();
			MainPage.FirstStep();
			break;
		}

	}

	public static void SelectReturnMeetingRoom() {
		System.out.println("----------------반납할 교실을 선택하세요-------------");
		System.out.println("|                                            |");
		System.out.println("|     0.뒤로가기                               |");
		System.out.println("|     1.KAgroSmallMeetingRoom                |");
		System.out.println("|     2.KAgroBigMeetingRoom                  |");
		System.out.println("|     3.LibraryMeetingRoom                   |");
		System.out.println("|     4.EngineeringMeetingRoom               |");
		System.out.println("|     5.LiberalMeetingRoom                   |");
		System.out.println("|                                            |");
		System.out.println("----------------------------------------------");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		switch (n) {
		case 0:
			Return();
			break;
		case 1:
			MeetingRoom.getInstanceKAS().deleteTable();
			MainPage.FirstStep();
			break;
		case 2:
			MeetingRoom.getInstanceKAB().deleteTable();
			MainPage.FirstStep();
			break;
		case 3:
			MeetingRoom.getInstanceLMR().deleteTable();
			MainPage.FirstStep();
			break;
		case 4:
			MeetingRoom.getInstanceEMR().deleteTable();
			MainPage.FirstStep();
			break;
		case 5:
			MeetingRoom.getInstanceLiMR().deleteTable();
			MainPage.FirstStep();
			break;
		}
	}
}