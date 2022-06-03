
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
            
            System.out.println("장소 입력");
            meetingRoom.setMeetingRoomName(scan.nextLine());//여기까지
            System.out.println("수량 입력");
            meetingRoom.setobQuantity(scan.nextInt());
            meetingRoom.setobAvailable(true);
 
            // 입력 사항 맞는지 확인
            System.out.println("장소 : " + meetingRoom.getMeetingRoomName());
            System.out.println("수량 : " + object.getobQuantity());
            System.out.println("대여가능 : " + object.isobAvailable());
            
            System.out.println("입력하신 사항이 모두 맞습니까? 예(Y) 아니오(N)");
            String confirm = scan.nextLine();
            sc.close();
            if (confirm.equalsIgnoreCase("y")||confirm.equalsIgnoreCase("Y")) {
                objectList.add(meetingRoom);
                System.out.println("======입력 완료=====");
                break;
            } else if (confirm.equalsIgnoreCase("n")||confirm.equalsIgnoreCase("N")) {
                System.out.println("물품 정보를 새로 입력하세요.");
            } else {
                System.out.println("잘못 누르셨습니다. 초기 메뉴로 이동합니다");
                break; // 초기메뉴로 이동
            } 
        }
    }


	/*
	 *
	 *int[][]timeTable
	 *
	 */
	
}
