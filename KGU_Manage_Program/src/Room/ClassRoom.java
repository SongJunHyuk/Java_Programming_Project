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

	
	
	
	public void insertRoom() {
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
			scanner.close();
			String confirm = scanner.nextLine();
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
	
}