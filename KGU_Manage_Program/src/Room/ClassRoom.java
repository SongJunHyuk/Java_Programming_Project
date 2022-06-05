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
         
         System.out.println(" ������ ȣ���� �Է��Ͻÿ� (ex 8304) : ");
         room.setroomNum(scanner.nextInt());
         
         System.out.println(" ������ �л� ������ �Է��Ͻÿ� : ");
         room.setMaxStudent(scanner.nextInt());
         
         System.out.println(" ������, ����, ��ǳ���� ������ ���� �Է��Ͻÿ� : ");
         room.setAirconditionCount(scanner.nextInt());
         room.setHeaterCount(scanner.nextInt());
         room.setFanCount(scanner.nextInt());
         
         System.out.println("��ǻ���� ����, �������� �ƴ��� true/false ���� �Է��Ͻÿ� ");
         room.setHavingComputer(scanner.nextBoolean());
         room.setIsUnderground(scanner.nextBoolean());
         
         System.out.println("classroom�� ����Ͻðڽ��ϱ�? ��� �� ����(y) ��� �� ����(n) �Ϲ� ����(�ƹ� Ű) :");
         
         String confirm = scanner.nextLine();
         scanner.close();
         room.isUsed = false;
         
         if(confirm == "y") {
            roomList.add(room);
            System.out.println("����� �Ϸ�Ǿ����ϴ�.");
            break;
         }
         else if(confirm == "n") {
            System.out.println("����� ������ ȣ���� �Է��Ͻÿ� : ");
         }
         else {
            System.out.println("�� �л� �ο� ���� ��� �Դϱ�?");
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
         System.out.println("����� ������ ȣ���� �Է��Ͻÿ� : ");
         ClassRoom classRoom = new ClassRoom();         
         Scanner scanner = new Scanner(System.in);
         int classRoomNum = scanner.nextInt();
  
			if(roomList.contains(classRoomNum)) {
			    
			    if(classRoom.getIsUsed() == false) {
			       
			       System.out.println("�� �л� �ο� ���� ��� �Դϱ�?");
			       
			       classRoom.setStudentNum(scanner.nextInt());
			       
			          if(classRoom.getStudentNum() >= classRoom.maxStudent) {
			             
			             System.out.println("�л��� ������ ���� ������ �ʰ��Ͽ����ϴ�.");
			             
			          } else {
			             
			             System.out.println("�뿩�Ͽ����ϴ�.");
			             classRoom.setIsUsed(true);   
			             break;
			          
			          }
			    
			    } else {
			       
			       System.out.println("�ش� ������ �̹� ����Ǿ��ֽ��ϴ�.");
			       
			    }
			    
			 } else {
			    
			    System.out.println("�ش� ������ �������� �ʽ��ϴ�."); 
			    
			 }
         scanner.close();
         
      }while(true);
   }
   
   @SuppressWarnings("unlikely-arg-type")
   public void returnClassRoom() {
      do {
         ClassRoom classRoom = new ClassRoom();
         System.out.println("�ݳ��� ������ ȣ���� �Է��Ͻÿ� : ( '0' �Է½� ��� ) ");
         @SuppressWarnings("resource")
         Scanner scanner = new Scanner(System.in);
         int classRoomNum = scanner.nextInt();
         if(classRoomNum == 0) {
            break;
         }else {
            if(roomList.contains(classRoomNum)) {
               if(classRoom.getIsUsed() == true) {
                  classRoom.setIsUsed(false);
                  System.out.println("�ݳ��� �Ϸ��Ͽ����ϴ�.");
                  break;
               }
               else {
                  System.out.println("�ش� ������ �̹� �ݳ��Ǿ��ֽ��ϴ�.");
               }
            }else {
               System.out.println(" �ش� ������ �������� �ʽ��ϴ�. ");
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