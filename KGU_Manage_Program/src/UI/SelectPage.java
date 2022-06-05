package UI;
import java.util.Scanner;

import Place.BasketBallCourt;
import Place.Playground;
import Room.ClassRoom;

public class SelectPage {
	public static void Select() { // ��ȸ ���
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------��ȸ�� ���� �����ϼ���-------------");
		System.out.println("|                                          |");
		System.out.println("| 0.�ڷΰ���     1.����      2.���      3.��   |");
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
		System.out.println("--------------��ȸ�� ��Ҹ� �����ϼ���------------");
		System.out.println("|                                          |");
		System.out.println("|0.�ڷΰ���     1.����          2.�౸��       |");
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
		System.out.println("---------------��ȸ�� ���� �����ϼ���-------------");
		System.out.println("|                                          |");
		System.out.println("|  0.�ڷΰ���     1. ����        2.��(��������)   |");
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
		System.out.println("���� ������ ����Ʈ ");
		ClassRoom.showClassRoom();
	}
	
	public static void loadRoom()
	{
		
	}
	
	public static void selectObject()
	{
		
	}
}