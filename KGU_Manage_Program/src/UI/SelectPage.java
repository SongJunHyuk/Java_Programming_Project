package UI;
import java.util.Scanner;

import Place.BasketBallCourt;
import Place.Playground;
import Room.ClassRoom;

public class SelectPage {
	public static void Select() { // 조회 기능
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------조회할 것을 선택하세요-------------");
		System.out.println("|                                          |");
		System.out.println("| 0.뒤로가기     1.물건      2.장소      3.방   |");
		System.out.println("|                                          |");
		System.out.println("--------------------------------------------");
		int N = sc.nextInt();
		System.out.println();
		
		switch (N) {
		case 0: MainPage.FirstStep();
			break;
		case 1: selectObject();
			break;
		case 2:  selectPlace();
			break;
		case 3: selectRoom();
			break;
		}
		sc.close();
	}
	
	public static void selectPlace()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------조회할 장소를 선택하세요------------");
		System.out.println("|                                          |");
		System.out.println("|0.뒤로가기     1.농구장          2.축구장       |");
		System.out.println("|                                          |");
		System.out.println("--------------------------------------------");
		int N = sc.nextInt();
		System.out.println();
		
		switch(N) {
		case 0: Select();
			break;
		case 1: BasketBallCourt.getInstance().showTimeTable();
			break;
		case 2: Playground.getInstance().showTimeTable();
			MainPage.FirstStep();
			break;
		}
	}
	
	public static void selectRoom()
	{
		System.out.println("---------------조회할 것을 선택하세요-------------");
		System.out.println("|                                          |");
		System.out.println("|  0.뒤로가기     1. 교실        2.룸(수정예정)   |");
		System.out.println("|                                          |");
		System.out.println("--------------------------------------------");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		switch (N) {
		case 0: Select();
			break;
		case 1: loadclassRoom();
			break;
		case 2: selectRoom();
			break;
		}
		sc.close();
	}
	
	public static void loadclassRoom()
	{
		System.out.println("현재 교실의 리스트 ");
		ClassRoom.showClassRoom();
	}
	
	public static void loadRoom()
	{
		
	}
	
	public static void selectObject()
	{
		
	}
}