package UI;
import java.util.Scanner;
public class SelectPage {
	public static void Select() { // ��ȸ ���
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------��ȸ�� ���� �����ϼ���-------------");
		System.out.println("|                                          |");
		System.out.println("|0.�ڷΰ���      1.���         2.����     3.����|");
		System.out.println("|                                          |");
		System.out.println("--------------------------------------------");
		int N = sc.nextInt();
		System.out.println();
		
		switch (N) {
		case 0: MainPage.FirstStep();
			break;
		case 1: selectPlace();
			break;
		case 2: selectRoom();
			break;
		case 3: selectObject();
			break;
		}
		sc.close();
	}
	public static void selectPlace()
	{
		
	}
	
	public static void selectRoom()
	{
		System.out.println("---------------��ȸ�� ���� �����ϼ���-------------");
		System.out.println("|                                          |");
		System.out.println("|  0.�ڷΰ���     1. ����        2.�ư��(��������)|");
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
		System.out.println();
	}
	
	public static void loadRoom()
	{
		
	}
	
	public static void selectObject()
	{
		
	}
}