package UI;

import java.util.Scanner;

import Object.ObjectManager;
import Place.BasketBallCourt;
import Place.Playground;
import Room.ClassRoom;
import Room.MeetingRoom;

public class BorrowPage {
	public static void Borrow() {
		System.out.println("----------------�뿩 ����� �����ϼ���--------------");
		System.out.println("|                                            |");
		System.out.println("| 0.�ڷΰ���     1.����      2.���      3.��      |");
		System.out.println("|                                            |");
		System.out.println("----------------------------------------------");
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		switch (N) {
		case 0:
			MainPage.FirstStep();
			break;
		case 1:
			ObjectManager.getInstance().SelectObject();
			MainPage.FirstStep();
			break;
		case 2:
			SelectPlace();
			break;
		case 3:
			SelectClassRoom();
			break;
		}
	}

	public static void SelectPlace() {
		System.out.println("----------------�뿩 ��Ҹ� �����ϼ���-------------");
		System.out.println("|                                            |");
		System.out.println("|  0.�ڷΰ���       1.�౸��          2.����      |");
		System.out.println("|                                            |");
		System.out.println("----------------------------------------------");
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		switch (N) {
		case 0:
			Borrow();
			break;
		case 1:
			Playground.getInstance().selectTimetable();
			MainPage.FirstStep();
			break;
		case 2:
			BasketBallCourt.getInstance().selectTimetable();
			MainPage.FirstStep();
			break;
		}
	}

	public static void SelectClassRoom() {
		System.out.println("----------------�뿩�� ���� �����ϼ���--------------");
		System.out.println("|                                            |");
		System.out.println("|     0.�ڷΰ���      1.����      2.ȸ�ǽ�         |");
		System.out.println("|                                            |");
		System.out.println("----------------------------------------------");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		switch (n) {
		case 0:
			Borrow();
			break;
		case 1:
			SelectEachClassRoom();
			MainPage.FirstStep();
			break;
		case 2:
			SelectEachMeetingRoom();
			MainPage.FirstStep();
			break;
		}
	}

	public static void SelectEachClassRoom() {
		System.out.println("----------------�뿩 ������ �����ϼ���--------------");
		System.out.println("|                                            |");
		System.out.println("|     0.�ڷΰ���                                |");
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
			Borrow();
			break;
		case 1:
			ClassRoom.getInstance001().selectTimetable();
			MainPage.FirstStep();
			break;
		case 2:
			ClassRoom.getInstance002().selectTimetable();
			MainPage.FirstStep();
			break;
		case 3:
			ClassRoom.getInstance101().selectTimetable();
			MainPage.FirstStep();
			break;
		case 4:
			ClassRoom.getInstance102().selectTimetable();
			MainPage.FirstStep();
			break;
		case 5:
			ClassRoom.getInstance201().selectTimetable();
			MainPage.FirstStep();
			break;
		case 6:
			ClassRoom.getInstance202().selectTimetable();
			MainPage.FirstStep();
			break;
		case 7:
			ClassRoom.getInstance301().selectTimetable();
			MainPage.FirstStep();
			break;
		case 8:
			ClassRoom.getInstance302().selectTimetable();
			MainPage.FirstStep();
			break;
		case 9:
			ClassRoom.getInstance401().selectTimetable();
			MainPage.FirstStep();
			break;
		}
	}

	public static void SelectEachMeetingRoom() {
		System.out.println("---------------�뿩 ȸ�ǽ��� �����ϼ���-------------");
		System.out.println("|                                            |");
		System.out.println("|     0.�ڷΰ���                                |");
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
			Borrow();
			break;
		case 1:
			MeetingRoom.getInstanceKAS().selectTimetable();
			MainPage.FirstStep();
			break;
		case 2:
			MeetingRoom.getInstanceKAB().selectTimetable();
			MainPage.FirstStep();
			break;
		case 3:
			MeetingRoom.getInstanceLMR().selectTimetable();
			MainPage.FirstStep();
			break;
		case 4:
			MeetingRoom.getInstanceEMR().selectTimetable();
			MainPage.FirstStep();
			break;
		case 5:
			MeetingRoom.getInstanceLiMR().selectTimetable();
			MainPage.FirstStep();
			break;
		}
	}
}