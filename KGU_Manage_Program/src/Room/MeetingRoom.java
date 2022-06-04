 package Room;

 import java.util.ArrayList;
 import java.util.Scanner;

public class MeetingRoom extends Room{

    private ArrayList<Object> meetingRoomList = new ArrayList<Object>();
    String meetingRoomName;
	boolean presentationAvailable;
	boolean isUsed=false;
	int studentNum=0;
	

	public MeetingRoom() {}
	

	public MeetingRoom(String meetingRoomName,boolean presentationAvailable) {
		this.meetingRoomName = meetingRoomName;
		this.presentationAvailable = presentationAvailable;
	}

	public boolean getPresentationAvailable() {return presentationAvailable;}

	public void setPresentationAvailable(boolean presentationAvailable) {this.presentationAvailable = presentationAvailable;}

	public String getMeetingRoomName() {return meetingRoomName;}

	public void setMeetingRoomName(String meetingRoomName) {this.meetingRoomName = meetingRoomName;}
	
	public void setStudentNum(int studentNum) {this.studentNum = studentNum;}
	
	public int getStudentNum() {return studentNum;}
	
	//-------------------------------------------------------------------------------------------------
	
	public void insertMeetingRoom() { //ȸ�ǽ� �Է�(����)
        while (true) {
            MeetingRoom meetingRoom = new MeetingRoom();
            Scanner scan = new Scanner(System.in);
            
            System.out.println("ȸ�ǽ� �̸��� �Է����ּ��� : ");
            meetingRoom.setMeetingRoomName(scan.nextLine());

            System.out.println("�̿� ������ �ִ��ο��� �Է����ּ���");
            meetingRoom.setMaxStudent(scan.nextInt());
            
            System.out.println("ȸ�ǽǿ� �ִ� ������ ���� ��ǳ���� ������ �ϳ��� �Է����ּ���");
            meetingRoom.setAirconditionCount(scan.nextInt());
            meetingRoom.setHeaterCount(scan.nextInt());
            meetingRoom.setFanCount(scan.nextInt());
            
            System.out.println("ȸ�ǽǿ� ���������ʹ� �ֽ��ϱ�? (1. �� / 2. �ƴϿ�)");
            if(scan.nextInt()==1) { meetingRoom.setPresentationAvailable(true);}
            else if(scan.nextInt()==2) { meetingRoom.setPresentationAvailable(false);}
            else {System.out.println("�߸� �����̽��ϴ�. �ʱ� �޴��� �̵��մϴ�"); break;} // �ʱ�޴��� �̵�
 
            // �Է� ���� �´��� Ȯ��
            System.out.println("ȸ�ǽ� : " + meetingRoom.getMeetingRoomName());
            System.out.println("�ִ�����ο� : " + meetingRoom.getMaxStudent()+" ��");//����
            System.out.println("������ ���� : " + meetingRoom.getMeetingRoomName()+" ��");
            System.out.println("���� ���� : " + meetingRoom.getMeetingRoomName()+" ��");
            System.out.println("��ǳ�� ���� : " + meetingRoom.getMeetingRoomName()+" ��");
            if(getPresentationAvailable()==true) { System.out.println("���������� ���� : ����");}
            else if(getPresentationAvailable()==false) { System.out.println("���������� ���� : ����");}
            
            System.out.println("�Է��Ͻ� ������ ��� �½��ϱ�? ��(Y) �ƴϿ�(N)");
            String confirm = scan.nextLine();
            scan.close();
            if (confirm.equalsIgnoreCase("y")||confirm.equalsIgnoreCase("Y")) {
            	meetingRoomList.add(meetingRoom);
                System.out.println("======�Է� �Ϸ�=====");
                break;
            } else if (confirm.equalsIgnoreCase("n")||confirm.equalsIgnoreCase("N")) {
                System.out.println("��ǰ ������ ���� �Է��ϼ���.");
            } else {
                System.out.println("�߸� �����̽��ϴ�. �ʱ� �޴��� �̵��մϴ�");
                break; // �ʱ�޴��� �̵�
            } 
        }
    }
	
	/*public void lookupMeetingRoom() { //ȸ�ǽ� ��ȸ?
		for(int i=0;i<meetingRoomList.size();i++) {
			System.out.println(meetingRoomList.get(i));
		}
	}*/
    
    public void reservationMeetingRoom() { //ȸ�ǽ� ����

			MeetingRoom meetingRoom = new MeetingRoom();
			System.out.println("����� ȸ�ǽ� �̸��� �Է����ּ��� : ");
			Scanner scan = new Scanner(System.in);
			String meetingRoomName = scan.nextLine();
			
			if(meetingRoomList.contains(meetingRoomName)) {
				if(meetingRoom.isUsed == false) {//��� isUsed�� �ٲ�°���? ����Ʈ�� �ִ°ɹٲ���ϴ°� �ƴѰ� ������?
					System.out.println("����� �ο� ���� �� �� �Դϱ�?");
					meetingRoom.setStudentNum(scan.nextInt());
						if(meetingRoom.getStudentNum() >= meetingRoom.maxStudent) {//����� �ʹ� ���� ��
							System.out.println("����� �ο��� ���� ������ �ʰ��Ͽ����ϴ�.");
						}
						else {//�뿩�Ǿ�����
							System.out.println("�뿩�Ͽ����ϴ�.");
							meetingRoom.isUsed = true;						
						}
				}
				else {//ȸ�ǽ��� �̹� ����Ǿ����� ��
					System.out.println("�ش� ������ �̹� ����Ǿ��ֽ��ϴ�.");
				}
			}else {//�Է��� �̸��� ȸ�ǽ��� ���� ��
				System.out.println("�ش� ������ �������� �ʽ��ϴ�."); 
			}
			scan.close();
	}

/*public void cancelMeetingRoom() { //ȸ�ǽ� ���� ���

		MeetingRoom meetingRoom = new MeetingRoom();
		System.out.println("����� ȸ�ǽ� �̸��� �����ּ��� : ");
		Scanner scan = new Scanner(System.in);
		String meetingRoomName = scan.nextLine();
		
		if(meetingRoomList.contains(meetingRoomName)) {
			if(meetingRoom.isUsed == false) {
				System.out.println("����Ǿ��ִ� ȸ�ǽ��� �ƴմϴ�.");}
			else {
				if (meetingRoomName==)//��� �ؾ�����
				System.out.println("������ ��ҵǾ����ϴ�.");}
		}else {
			System.out.println("���� �̸��� ���� ȸ�ǽ��� �����ϴ�."); 
		}
		scan.close();
	}*/
}