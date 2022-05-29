package UI;
import java.util.Scanner;
public class SelectPage {
	public static void Select() { // 조회 기능
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------조회할 것을 선택하세요-------------");
		System.out.println("|                                          |");
		System.out.println("|0.뒤로가기      1.장소         2.교실     3.물건|");
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
		System.out.println("---------------조회할 것을 선택하세요-------------");
		System.out.println("|                                          |");
		System.out.println("|  0.뒤로가기     1. 교실        2.아고라(수정예정)|");
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