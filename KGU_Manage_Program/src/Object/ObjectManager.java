package Object;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ObjectManager {

	private int ballCount = 5;
	private int airpumpCount = 5;
	private int tableCount = 5;
	private int tentCount = 5;

	private ArrayList<Ball> balllist = new ArrayList<Ball>();
	private ArrayList<AirPump> airpumplist = new ArrayList<AirPump>();
	private ArrayList<Table> tablelist = new ArrayList<Table>();
	private ArrayList<Tent> tentlist = new ArrayList<Tent>();

	public static ObjectManager objectmanager = new ObjectManager();

	public static ObjectManager getInstance() {
		return objectmanager;
	}

	ObjectManager() {
	}

	public void showObject() {
		System.out.println("�� ���� ���� : " + ballCount);
		System.out.println("�������� ���� ���� : " + airpumpCount);
		System.out.println("���̺� ���� ���� : " + tableCount);
		System.out.println("��Ʈ ���� ���� : " + tentCount);
	}

	public void BorrowObject() {
		System.out.println("-------------�뿩�� ������ �����ϼ���-------------");
		System.out.println("|                                          |");
		System.out.println("|        0. �ڷΰ���                          |");
		System.out.println("|        1. ��                              |");
		System.out.println("|        2. ��������                          |");
		System.out.println("|        3. ���̺�                           |");
		System.out.println("|        4. ��Ʈ                            |");
		System.out.println("|                                          |");
		System.out.println("-------------------------------------------");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println("-------------�뿩�� ������ �����ϼ���-------------");
		System.out.println("|                                          |");
		System.out.println("|        �뿩�� ������ �Է��ϼ���.                 |");
		System.out.println("|                                          |");
		System.out.println("-------------------------------------------");
		
		int count = sc.nextInt();
		
		System.out.println("-------------������ ������ �Է��ϼ���.-------------");
		System.out.println("|                                          |");
		System.out.println("|   �̸�, �г�, ����, ��ȭ��ȣ�� �Է����ּ���          |");
		System.out.println("|                                          |");
		System.out.println("|   ex)ȫ�浿 2 21 01012345678               |");
		System.out.println("|                                          |");
		System.out.println("--------------------------------------------");
		
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		
		String Name = st.nextToken();
		int Grade = Integer.parseInt(st.nextToken());
		int Age = Integer.parseInt(st.nextToken());
		String PhoneNumber = st.nextToken();
		
		
		
		switch(N) {
		case 0 : 
			break;
		case 1 :
			break;
		case 2 :
			break;
		case 3 :
			break;
		case 4 :
			break;
	}

	public boolean check() {

	}

	public void deleteObject() {

	}
}