package UI;
import java.util.Scanner;
import java.util.StringTokenizer;

import Borrow.Indivisual;

public class ReturnPage {
	public static void Return()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------�ݳ��� ����� �����ϼ���-------------");
		System.out.println("|                                          |");
		System.out.println("| 0.�ڷΰ���     1.����      2.���      3.����  |");
		System.out.println("|                                          |");
		System.out.println("--------------------------------------------");
		
		int N = sc.nextInt();
		switch (N) {
		case 0: MainPage.FirstStep();
			break;
		case 1: ReturnObject();
			break;
		case 2: 
			break;
		case 3: 
			break;
		}
		sc.close();
	}
	
	public static void ReturnObject()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------------------------");
		System.out.println("|                                           |");
		System.out.println("|    ������ �̸��� ��ȭ��ȣ�� �ݳ��� ���ǿ� �Է��ϼ���  |");
		System.out.println("|                                           |");
		System.out.println("|    ex) ȫ�浿 01012345678    100            |");
		System.out.println("|                                           |");
		System.out.println("--------------------------------------------");
		
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		Indivisual person = new Indivisual();
		person.setName(st.nextToken());
		person.setPhoneNumber(st.nextToken());
		st.nextToken();
		sc.close();
	}
	
	public static void ReturnPlace()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------------------------");
		System.out.println("|                                           |");
		System.out.println("|    ������ �̸��� �ݳ��� ����� ��ȣ�� �Է��ϼ���     |");
		System.out.println("|                                           |");
		System.out.println("--------------------------------------------");
		
		String str = sc.nextLine();
		sc.close();
	}
}
