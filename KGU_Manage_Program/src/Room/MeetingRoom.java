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
	
	public void insertMeetingRoom() { //회의실 입력(생성)
        while (true) {
            MeetingRoom meetingRoom = new MeetingRoom();
            Scanner scan = new Scanner(System.in);
            
            System.out.println("회의실 이름을 입력해주세요 : ");
            meetingRoom.setMeetingRoomName(scan.nextLine());

            System.out.println("이용 가능한 최대인원을 입력해주세요");
            meetingRoom.setMaxStudent(scan.nextInt());
            
            System.out.println("회의실에 있는 에어컨 히터 선풍기의 갯수를 하나씩 입력해주세요");
            meetingRoom.setAirconditionCount(scan.nextInt());
            meetingRoom.setHeaterCount(scan.nextInt());
            meetingRoom.setFanCount(scan.nextInt());
            
            System.out.println("회의실에 빔프로젝터는 있습니까? (1. 예 / 2. 아니오)");
            if(scan.nextInt()==1) { meetingRoom.setPresentationAvailable(true);}
            else if(scan.nextInt()==2) { meetingRoom.setPresentationAvailable(false);}
            else {System.out.println("잘못 누르셨습니다. 초기 메뉴로 이동합니다"); break;} // 초기메뉴로 이동
 
            // 입력 사항 맞는지 확인
            System.out.println("회의실 : " + meetingRoom.getMeetingRoomName());
            System.out.println("최대수용인원 : " + meetingRoom.getMaxStudent()+" 명");//ㅇㅇ
            System.out.println("에어컨 갯수 : " + meetingRoom.getMeetingRoomName()+" 개");
            System.out.println("히터 갯수 : " + meetingRoom.getMeetingRoomName()+" 개");
            System.out.println("선풍기 갯수 : " + meetingRoom.getMeetingRoomName()+" 개");
            if(getPresentationAvailable()==true) { System.out.println("빔프로젝터 여부 : 있음");}
            else if(getPresentationAvailable()==false) { System.out.println("빔프로젝터 여부 : 없음");}
            
            System.out.println("입력하신 사항이 모두 맞습니까? 예(Y) 아니오(N)");
            String confirm = scan.nextLine();
            scan.close();
            if (confirm.equalsIgnoreCase("y")||confirm.equalsIgnoreCase("Y")) {
            	meetingRoomList.add(meetingRoom);
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
	
	/*public void lookupMeetingRoom() { //회의실 조회?
		for(int i=0;i<meetingRoomList.size();i++) {
			System.out.println(meetingRoomList.get(i));
		}
	}*/
    
    public void reservationMeetingRoom() { //회의실 예약

			MeetingRoom meetingRoom = new MeetingRoom();
			System.out.println("사용할 회의실 이름을 입력해주세요 : ");
			Scanner scan = new Scanner(System.in);
			String meetingRoomName = scan.nextLine();
			
			if(meetingRoomList.contains(meetingRoomName)) {
				if(meetingRoom.isUsed == false) {//어디 isUsed가 바뀌는거지? 리스트에 있는걸바꿔야하는게 아닌가 괜찮나?
					System.out.println("사용할 인원 수는 몇 명 입니까?");
					meetingRoom.setStudentNum(scan.nextInt());
						if(meetingRoom.getStudentNum() >= meetingRoom.maxStudent) {//사람이 너무 많을 때
							System.out.println("사용할 인원이 반의 정원을 초과하였습니다.");
						}
						else {//대여되었을때
							System.out.println("대여하였습니다.");
							meetingRoom.isUsed = true;						
						}
				}
				else {//회의실이 이미 예약되어있을 때
					System.out.println("해당 교실은 이미 예약되어있습니다.");
				}
			}else {//입력한 이름의 회의실이 없을 때
				System.out.println("해당 교실은 존재하지 않습니다."); 
			}
			scan.close();
	}

/*public void cancelMeetingRoom() { //회의실 예약 취소

		MeetingRoom meetingRoom = new MeetingRoom();
		System.out.println("취소할 회의실 이름을 적어주세요 : ");
		Scanner scan = new Scanner(System.in);
		String meetingRoomName = scan.nextLine();
		
		if(meetingRoomList.contains(meetingRoomName)) {
			if(meetingRoom.isUsed == false) {
				System.out.println("예약되어있는 회의실이 아닙니다.");}
			else {
				if (meetingRoomName==)//어떻게 해야하지
				System.out.println("예약이 취소되었습니다.");}
		}else {
			System.out.println("같은 이름을 가진 회의실이 없습니다."); 
		}
		scan.close();
	}*/
}