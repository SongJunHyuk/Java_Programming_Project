package UI;
import java.util.Scanner;
public class SelectPage {
	public static void Select() { // ��ȸ ���
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------��ȸ�� ���� �����ϼ���-------------");
		System.out.println("0.�ڷΰ���      1.���         2.����       3.����");
		System.out.println("--------------------------------------------");
		int N = sc.nextInt();
		System.out.println();
		
		switch (N) {
		case 0: MainPage.FirstStep();
			break;
		case 1: 
			break;
		case 2: ;
			break;
		case 3: System.out.println();;
			break;
	}
		sc.close();
	}
}