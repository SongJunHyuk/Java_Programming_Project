package UI;
import java.util.Scanner;
import java.util.StringTokenizer;

import Borrow.Indivisual;
import Place.BasketBallCourt;
import Place.Playground;

public class ReturnPage {
	public static void Return()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------�ݳ��� ����� �����ϼ���-------------");
		System.out.println("|                                          |");
		System.out.println("| 0.�ڷΰ���     1.����      2.���      3.��   |");
		System.out.println("|                                          |");
		System.out.println("--------------------------------------------");
		
		int N = sc.nextInt();
		switch (N) {
		case 0: MainPage.FirstStep();
			break;
		case 1: ReturnObject();
			break;
		case 2: ReturnPlace();
			MainPage.FirstStep();
			break;
		case 3: SelectReturnRoom();
			break;
		}
		sc.close();
	}
	
	public static void ReturnPlace() {
		System.out.println("----------------�ݳ� ��Ҹ� �����ϼ���-------------");
		System.out.println("|                                            |");
		System.out.println("|  0.�ڷΰ���       1.�౸��          2.����     |");
		System.out.println("|                                            |");
		System.out.println("----------------------------------------------");
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		switch (N) {
		case 0: Return();
			break;
		case 1: Playground.getInstance().deleteTable();
		 	MainPage.FirstStep();
			break;
		case 2: BasketBallCourt.getInstance().deleteTable();
			break;
		}
		
	}
	
	
	public static void SelectReturnRoom()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------�ݳ��� ����� �����ϼ���-------------");
		System.out.println("|                                          |");
		System.out.println("| 0.�ڷΰ���     1.����            2.��         |");
		System.out.println("|                                          |");
		System.out.println("--------------------------------------------");
		
		int N = sc.nextInt();
		switch (N) {
		case 0: MainPage.FirstStep();
			break;
		case 1: SelectReturnClassRoom();
			break;
		}
	}
	
	public static void ReturnObject()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------------------------");
		System.out.println("|                                           |");
		System.out.println("|    ������ �̸��� ��ȭ��ȣ�� �ݳ��� ���ǿ� �Է��ϼ��� |");
		System.out.println("|                                           |");
		System.out.println("|    ex) ȫ�浿 01012345678    100            |");
		System.out.println("|                                           |");
		System.out.println("--------------------------------------------");
		
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		Indivisual person = new Indivisual();
		person.setName(st.nextToken());
		person.setPhoneNumber(st.nextToken());
		st.nextToken(); // ��������
	}
	
	public static void SelectReturnClassRoom()	{
		
	}
	

}
