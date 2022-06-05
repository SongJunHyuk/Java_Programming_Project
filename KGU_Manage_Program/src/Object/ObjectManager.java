package Object;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

import Borrow.Group;

public class ObjectManager {

	private int ballCount = 5;
	private int airpumpCount = 5;
	private int tableCount = 5;
	private int tentCount = 5;

	private ArrayList<Ball> balllist = new ArrayList<Ball>();
	private ArrayList<AirPump> airpumplist = new ArrayList<AirPump>();
	private ArrayList<Table> tablelist = new ArrayList<Table>();
	private ArrayList<Tent> tentlist = new ArrayList<Tent>();

	Scanner sc = new Scanner(System.in);

	public static ObjectManager objectmanager = new ObjectManager();

	public static ObjectManager getInstance() {
		return objectmanager;
	}

	public void showObject() {
		System.out.println("���� �� ���� : " + ballCount);
		System.out.println("���� �������� ���� : " + airpumpCount);
		System.out.println("���� ���̺� ���� : " + tableCount);
		System.out.println("���� ��Ʈ ���� : " + tentCount);
	}

	public void SelectObject() {
		System.out.println("-------------�뿩�� ������ �����ϼ���-------------");
		System.out.println("|                                          |");
		System.out.println("|        1. ��                              |");
		System.out.println("|        2. ��������                          |");
		System.out.println("|        3. ���̺�                           |");
		System.out.println("|        4. ��Ʈ                            |");
		System.out.println("|                                          |");
		System.out.println("-------------------------------------------");
		int N = sc.nextInt();

		System.out.println("---------------�뿩������ ������---------------");
		System.out.println("|                                          |");
		System.out.println("|        �뿩�� ������ �Է��ϼ���.                 |");
		System.out.println("|                                          |");
		System.out.println("-------------------------------------------");

		int count = sc.nextInt();

		switch (N) {
		case 1:
			if (checkBallCount(count))
				break;
			else {
				System.out.println("��û�ϴ� ���� ���� ���� ������ �����մϴ�.");
				System.out.println("�ٽ� �Է����ּ���");
				SelectObject();
				break;
			}
		case 2:
			if (checkAirpumpCount(count))
				break;
			else {
				System.out.println("��û�ϴ� ���� ���� ���� ������ �����մϴ�.");
				System.out.println("�ٽ� �Է����ּ���");
				SelectObject();
				break;
			}
		case 3:
			if (checkTableCount(count))
				break;
			else {
				System.out.println("��û�ϴ� ���� ���� ���� ������ �����մϴ�.");
				System.out.println("�ٽ� �Է����ּ���");
				SelectObject();
				break;
			}
		case 4:
			if (checkTentCount(count))
				break;
			else {
				System.out.println("��û�ϴ� ���� ���� ���� ������ �����մϴ�.");
				System.out.println("�ٽ� �Է����ּ���");
				SelectObject();
				break;
			}
		}

		System.out.println("-------------������ ������ �Է��ϼ���.-------------");
		System.out.println("|                                          |");
		System.out.println("|             �̸��� �Է����ּ���                |");
		System.out.println("|                                          |");
		System.out.println("|         ex)  ȫ�浿                        |");
		System.out.println("|                                          |");
		System.out.println("--------------------------------------------");


		String Name = sc.next();
		
		System.out.println("-------------������ ������ �Է��ϼ���.-------------");
		System.out.println("|                                          |");
		System.out.println("|             ��ȭ��ȣ�� �Է����ּ���             |");
		System.out.println("|                                          |");
		System.out.println("|         ex)     01012345678              |");
		System.out.println("|                                          |");
		System.out.println("--------------------------------------------");
		
		String PhoneNumber = sc.next();

		switch (N) {
		case 1:
			enrollBall(PhoneNumber, count);
			break;
		case 2:
			enrollAirpump(PhoneNumber, count);
			break;
		case 3:
			enrollTable(PhoneNumber, count);
			break;
		case 4:
			enrollTent(PhoneNumber, count);
			break;
		}
		System.out.println("------����� �Ϸ�Ǿ����ϴ�.------");
		return;
	}

	public boolean checkBallCount(int count) {
		if (ballCount >= count)
			return true;
		else
			return false;
	}

	public boolean checkAirpumpCount(int count) {
		if (airpumpCount >= count)
			return true;
		else
			return false;
	}

	public boolean checkTableCount(int count) {
		if (tableCount >= count)
			return true;
		else
			return false;
	}

	public boolean checkTentCount(int count) {
		if (tentCount >= count)
			return true;
		else
			return false;
	}

	public void enrollBall(String PhoneNumber, int count) {
		balllist.add(new Ball(count, PhoneNumber));
		ballCount -= count;
	}

	public void enrollAirpump(String PhoneNumber, int count) {
		airpumplist.add(new AirPump(count, PhoneNumber));
		airpumpCount -= count;
	}

	public void enrollTable(String PhoneNumber, int count) {
		tablelist.add(new Table(count, PhoneNumber));
		tableCount -= count;
	}

	public void enrollTent(String PhoneNumber, int count) {
		tentlist.add(new Tent(count, PhoneNumber));
		tentCount -= count;
	}

	public void deleteObject() {
		System.out.println("-------------�ݳ��� ������ �����ϼ���-------------");
		System.out.println("|                                          |");
		System.out.println("|        0. �ڷΰ���                          |");
		System.out.println("|        1. ��                              |");
		System.out.println("|        2. ��������                          |");
		System.out.println("|        3. ���̺�                           |");
		System.out.println("|        4. ��Ʈ                            |");
		System.out.println("|                                          |");
		System.out.println("-------------------------------------------");

		int N = sc.nextInt();

		System.out.println("---------------�ݳ������� ������---------------");
		System.out.println("|                                          |");
		System.out.println("|        �ݳ��� ������ �Է��ϼ���.                 |");
		System.out.println("|                                          |");
		System.out.println("-------------------------------------------");

		int count = sc.nextInt();

		System.out.println("-------------������ ������ �Է��ϼ���.-------------");
		System.out.println("|                                          |");
		System.out.println("|             �̸��� �Է����ּ���                |");
		System.out.println("|                                          |");
		System.out.println("|         ex)  ȫ�浿                        |");
		System.out.println("|                                          |");
		System.out.println("--------------------------------------------");


		String Name = sc.next();
		
		System.out.println("-------------������ ������ �Է��ϼ���.-------------");
		System.out.println("|                                          |");
		System.out.println("|             ��ȭ��ȣ�� �Է����ּ���             |");
		System.out.println("|                                          |");
		System.out.println("|         ex)     01012345678              |");
		System.out.println("|                                          |");
		System.out.println("--------------------------------------------");
		
		String PhoneNumber = sc.next();

		switch (N) {
		case 1:
			DeleteBall(PhoneNumber, count);
			break;
		case 2:
			DeleteAirpump(PhoneNumber, count);
			break;
		case 3:
			DeleteTable(PhoneNumber, count);
			break;
		case 4:
			DeleteTent(PhoneNumber, count);
			break;
		}

	}

	public void DeleteBall(String PhoneNumber, int count) {
		Iterator<Ball> iter = balllist.iterator();
		boolean check = false;
		while (iter.hasNext()) {
			Ball ball = iter.next();
			if (ball.getNumber().equals(PhoneNumber)) {
				if (ball.getQuantity() == count) {

					iter.remove();
					check = true;
					ballCount += count;
					break;
				}
			}
		}
		if (check == false)
			System.out.println("---�߸��� ������ �Է��ϼ̽��ϴ�.---");
		else
			System.out.println("------�ݳ��� �Ϸ� �Ǿ����ϴ�.------");
	}

	public void DeleteAirpump(String PhoneNumber, int count) {
		Iterator<AirPump> iter = airpumplist.iterator();
		boolean check = false;
		while (iter.hasNext()) {
			AirPump airpump = iter.next();
			if (airpump.getNumber().equals(PhoneNumber)) {
				if (airpump.getQuantity() == count) {

					iter.remove();
					check = true;
					airpumpCount += count;
					break;
				}
			}
		}
		if (check == false)
			System.out.println("---�߸��� ������ �Է��ϼ̽��ϴ�.---");
		else
			System.out.println("------�ݳ��� �Ϸ� �Ǿ����ϴ�.------");
	}

	public void DeleteTable(String PhoneNumber, int count) {
		Iterator<Table> iter = tablelist.iterator();
		boolean check = false;
		while (iter.hasNext()) {
			Table table = iter.next();
			if (table.getNumber().equals(PhoneNumber)) {
				if (table.getQuantity() == count) {
					iter.remove();
					check = true;
					tableCount += count;
					break;
				}

			}
		}
		if (check == false)
			System.out.println("�߸��� ������ �Է��ϼ̽��ϴ�.");
		else
			System.out.println("------�ݳ��� �Ϸ� �Ǿ����ϴ�.------");
	}

	public void DeleteTent(String PhoneNumber, int count) {
		Iterator<Tent> iter = tentlist.iterator();
		boolean check = false;
		while (iter.hasNext()) {
			Tent tent = iter.next();
			if (tent.getNumber().equals(PhoneNumber)) {
				if (tent.getQuantity() == count) {
					iter.remove();
					check = true;
					tentCount += count;
					break;
				}
			}
		}
		if (check == false)
			System.out.println("�߸��� ������ �Է��ϼ̽��ϴ�.");
		else
			System.out.println("------�ݳ��� �Ϸ� �Ǿ����ϴ�.------");
	}
}