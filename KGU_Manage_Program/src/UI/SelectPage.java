package UI;
import java.util.Scanner;
public class SelectPage {
	public static void Select() { // 조회 기능
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------조회할 것을 선택하세요-------------");
		System.out.println("0.뒤로가기      1.장소         2.교실       3.물건");
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