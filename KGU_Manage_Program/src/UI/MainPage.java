package UI;
import java.util.Scanner;

public class MainPage {

	public static void FirstStep() {  // ��ó�� ������
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------������ ����� �����ϼ���-------------");
		System.out.println("|                                          |");
		System.out.println("| 0.����      1. ��ȸ      2.�뿩      3.�ݳ�   |");
		System.out.println("|                                          |");
		System.out.println("--------------------------------------------");
		
		int N = sc.nextInt();
		System.out.println();


		
		switch (N) {
			case 0: EndPage.SystemOff();
				break;
			case 1: SelectPage.Select();
				break;
			case 2: BorrowPage.Borrow();
				break;
			case 3: ReturnPage.Return();
				break;
		}
	}
}
