package UI;
import java.util.Scanner;

public class MainPage {

	public static void FirstStep() {  // 맨처음 페이지
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------실행할 기능을 선택하세요-------------");
		System.out.println("|                                          |");
		System.out.println("| 0.종료      1. 조회      2.대여      3.반납   |");
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
