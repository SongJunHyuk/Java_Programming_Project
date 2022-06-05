package Room;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassRoom extends Room{
   
   boolean havingComputer;
   boolean isUnderground;
   static ArrayList<ClassRoom> roomList = new ArrayList<ClassRoom>();
   int roomNum;
   boolean isUsed;
   
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
         
         System.out.println(" 교실의 호수를 입력하시오 (ex 8304) : ");
         room.setroomNum(scanner.nextInt());
         
         System.out.println(" 교실의 학생 정원을 입력하시오 : ");
         room.setMaxStudent(scanner.nextInt());
         
         System.out.println(" 에어컨, 히터, 선풍기의 개수를 각각 입력하시오 : ");
         room.setAirconditionCount(scanner.nextInt());
         room.setHeaterCount(scanner.nextInt());
         room.setFanCount(scanner.nextInt());
         
         System.out.println("컴퓨터의 유무, 지하인지 아닌지 true/false 각각 입력하시오 ");
         room.setHavingComputer(scanner.nextBoolean());
         room.setIsUnderground(scanner.nextBoolean());
         
         System.out.println("classroom을 등록하시겠습니까? 등록 후 종료(y) 취소 후 재등록(n) 일반 종료(아무 키) :");
         
         String confirm = scanner.nextLine();
         scanner.close();
         room.isUsed = false;
         
         if(confirm == "y") {
            roomList.add(room);
            System.out.println("등록이 완료되었습니다.");
            break;
         }
         else if(confirm == "n") {
            System.out.println("사용할 교실의 호수를 입력하시오 : ");
         }
         else {
            System.out.println("총 학생 인원 수는 몇명 입니까?");
            break;
         }
      }
   
   }
      public void setIsUsed(boolean isUsed) {
         this.isUsed = isUsed;
      }
      
      public boolean getIsUsed() {
         return isUsed;
      }
      
      
   @SuppressWarnings("unlikely-arg-type")
   public static void reservationClassRoom() {
      do {
         System.out.println("사용할 교실의 호수를 입력하시오 : ");
         ClassRoom classRoom = new ClassRoom();         
         Scanner scanner = new Scanner(System.in);
         int classRoomNum = scanner.nextInt();
  
			if(roomList.contains(classRoomNum)) {
			    
			    if(classRoom.getIsUsed() == false) {
			       
			       System.out.println("총 학생 인원 수는 몇명 입니까?");
			       
			       classRoom.setStudentNum(scanner.nextInt());
			       
			          if(classRoom.getStudentNum() >= classRoom.maxStudent) {
			             
			             System.out.println("학생의 정원이 반의 정원을 초과하였습니다.");
			             
			          } else {
			             
			             System.out.println("대여하였습니다.");
			             classRoom.setIsUsed(true);   
			             break;
			          
			          }
			    
			    } else {
			       
			       System.out.println("해당 교실은 이미 예약되어있습니다.");
			       
			    }
			    
			 } else {
			    
			    System.out.println("해당 교실은 존재하지 않습니다."); 
			    
			 }
         scanner.close();
         
      }while(true);
   }
   
   @SuppressWarnings("unlikely-arg-type")
   public void returnClassRoom() {
      do {
         ClassRoom classRoom = new ClassRoom();
         System.out.println("반납할 교실의 호수를 입력하시오 : ( '0' 입력시 취소 ) ");
         @SuppressWarnings("resource")
         Scanner scanner = new Scanner(System.in);
         int classRoomNum = scanner.nextInt();
         if(classRoomNum == 0) {
            break;
         }else {
            if(roomList.contains(classRoomNum)) {
               if(classRoom.getIsUsed() == true) {
                  classRoom.setIsUsed(false);
                  System.out.println("반납을 완료하였습니다.");
                  break;
               }
               else {
                  System.out.println("해당 교실은 이미 반납되어있습니다.");
               }
            }else {
               System.out.println(" 해당 교실은 존재하지 않습니다. ");
            }
         }
      }while(true);
   }
   
   public static void showClassRoom() {
      
      for(int i = 0; i <= roomList.size(); i++) {
         
         System.out.println("  " + roomList.get(i) + "  " + roomList.get(i).getIsUsed());
         
      }
      
   }

}