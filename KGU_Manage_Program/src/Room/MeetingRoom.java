
package Room;


 import java.util.ArrayList;
 import java.util.Scanner;

public class MeetingRoom extends Room{

    private ArrayList<Object> objectList = new ArrayList<Object>();


	String meetingRoomName;
	boolean presentationAvailable;

	public MeetingRoom() {}


	public MeetingRoom(String MeetingRoomName,boolean PresentationAvailable) {
		this.meetingRoomName = MeetingRoomName;
		this.presentationAvailable = PresentationAvailable;
	}

	public boolean getPresentationAvailable() {return presentationAvailable;}

	public void setPresentationAvailable(boolean presentationAvailable) {this.presentationAvailable = presentationAvailable;}

	public String getMeetingRoomName() {return meetingRoomName;}

	public void setMeetingRoomName(String meetingRoomName) {this.meetingRoomName = meetingRoomName;}
	
	public void insertMeetingRoom() {
        while (true) {
            MeetingRoom meetingRoom = new MeetingRoom();
            Scanner scan = new Scanner(System.in);
            
            System.out.println("��� �Է�");
            meetingRoom.setMeetingRoomName(scan.nextLine());//�������
            System.out.println("���� �Է�");
            meetingRoom.setobQuantity(scan.nextInt());
            meetingRoom.setobAvailable(true);
 
            // �Է� ���� �´��� Ȯ��
            System.out.println("��� : " + meetingRoom.getMeetingRoomName());
            System.out.println("���� : " + object.getobQuantity());
            System.out.println("�뿩���� : " + object.isobAvailable());
            
            System.out.println("�Է��Ͻ� ������ ��� �½��ϱ�? ��(Y) �ƴϿ�(N)");
            String confirm = scan.nextLine();
            sc.close();
            if (confirm.equalsIgnoreCase("y")||confirm.equalsIgnoreCase("Y")) {
                objectList.add(meetingRoom);
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


	/*
	 *
	 *int[][]timeTable
	 *
	 */
	
}
