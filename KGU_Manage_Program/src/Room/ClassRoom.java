package Room;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassRoom extends Room{
	
	boolean havingComputer;
	boolean isUnderground;
	private ArrayList<Room> roomList = new ArrayList<Room>();
	int roomNum;
	
	public ClassRoom() {}
	
	public ClassRoom(boolean havingComputer, boolean isUnderground) {
		this.havingComputer = havingComputer;
		this.isUnderground = isUnderground;
	}
	
	public boolean getHavingComputer() {
		return havingComputer;
	}
	
	public void setHavingComputer(boolean havingComputer) {
		this.havingComputer = havingComputer;
	}
	
	public boolean getIsUnderground() {
		return isUnderground;
	}
	
	public void setIsUnderground(boolean isUnderground) {
		this.isUnderground = isUnderground;
	}
	
	public void setroomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	
	public int getroomNum() {
		return roomNum;
	}
	
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	
	public int getStudentNum() {
		return studentNum;
	}

	
	
	
	public void insertClassRoom() {
		while(true) {
			ClassRoom room = new ClassRoom();
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("교실의 호수를 입력하시오 (ex 8304) : ");
		    room.setroomNum(scanner.nextInt());
			
			System.out.println("해당 교실의 최대인원을 입력하시오 : ");
			room.setMaxStudent(scanner.nextInt());
			
			System.out.println("해당 교실의 에어컨, 히터, 선풍기의 개수를 각각 입력하시오 : ");
			room.setAirconditionCount(scanner.nextInt());
			room.setHeaterCount(scanner.nextInt());
			room.setFanCount(scanner.nextInt());
			
			System.out.println("해당 교실에 컴퓨터가 있는지, 지하인지 아닌지 각각 true/false로 입력하시오");
			room.setHavingComputer(scanner.nextBoolean());
			room.setIsUnderground(scanner.nextBoolean());
			
			System.out.println("classroom을 등록하시겠습니까? 등록 후 종료(y) 취소 후 재등록(n) 일반 종료(아무 키) : ");
			
			String confirm = scanner.nextLine();
			
			room.isUsed = false;
			
			if(confirm == "y") {
				roomList.add(room);
				System.out.println("등록이 완료되었습니다.");
				break;
			}
			else if(confirm == "n") {
				System.out.println("등록이 취소되었습니다. 재등록 시작");
			}
			else {
				System.out.println("등록 절차 종료");
				break;
			}
		}
	}
	
	public void reservationClassRoom() {
		System.out.println("사용할 교실의 호수를 입력하시오 : ");
		ClassRoom classRoom = new ClassRoom();
		Scanner scanner = new Scanner(System.in);
		int classRoomNum = scanner.nextInt();
		if(roomList.contains(classRoomNum)) {
			if(classRoom.isUsed == false) {
				System.out.println("총 학생 인원 수는 몇명 입니까?");
				classRoom.setStudentNum(scanner.nextInt());
					if(classRoom.getStudentNum() >= classRoom.maxStudent) {
						System.out.println("학생의 정원이 반의 정원을 초과하였습니다.");
					}
					else {
						System.out.println("대여하였습니다.");
						classRoom.isUsed = true;						
					}
			}
			else {
				System.out.println("해당 교실은 이미 예약되어있습니다.");
			}
		}else {
			System.out.println("해당 교실은 존재하지 않습니다."); 
			scanner.close();
		}
	}
}