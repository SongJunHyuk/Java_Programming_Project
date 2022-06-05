package UI;
import java.util.Scanner;

import Place.BasketBallCourt;
import Place.Playground;
import Room.ClassRoom;
import Room.MeetingRoom;

public class SelectPage {
   public static void Select() { // 조회 기능
      Scanner sc = new Scanner(System.in);
      System.out.println("---------------조회할 것을 선택하세요-------------");
      System.out.println("|                                          |");
      System.out.println("| 0.뒤로가기     1.물건      2.장소      3.방   |");
      System.out.println("|                                          |");
      System.out.println("--------------------------------------------");
      int N = sc.nextInt();
      System.out.println();
      
      switch (N) {
      case 0: MainPage.FirstStep();
         break;
      case 1: selectObject();
         break;
      case 2:  selectPlace();
         break;
      case 3: selectRoom();
         break;
      }
      sc.close();
   }
   
   public static void selectPlace()
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("--------------조회할 장소를 선택하세요------------");
      System.out.println("|                                          |");
      System.out.println("|0.뒤로가기     1.농구장          2.축구장       |");
      System.out.println("|                                          |");
      System.out.println("--------------------------------------------");
      int N = sc.nextInt();
      System.out.println();
      
      switch(N) {
      case 0: Select();
         break;
      case 1: BasketBallCourt.getInstance().showTimeTable();
         break;
      case 2: Playground.getInstance().showTimeTable();
         MainPage.FirstStep();
         break;
      }
   }
   
   public static void selectRoom()
   {
      System.out.println("---------------조회할 것을 선택하세요-------------");
      System.out.println("|                                          |");
      System.out.println("|  0.뒤로가기     1. 교실        2.회의실       |");
      System.out.println("|                                          |");
      System.out.println("--------------------------------------------");
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      switch (N) {
      case 0: Select();
         break;
      case 1: loadclassRoom();
         break;
      case 2: loadMeetingRoom();
         break;
      }
      sc.close();
   }
   
   public static void loadclassRoom()
   {
         System.out.println("----------------조회 교실을 선택하세요--------------");
         System.out.println("|                                            |");
         System.out.println("|     0.뒤로가기                               |");
         System.out.println("|     1.ClassRoom001                         |");
         System.out.println("|     2.ClassRoom002                         |");
         System.out.println("|     3.ClassRoom101                         |");
         System.out.println("|     4.ClassRoom102                         |");
         System.out.println("|     5.ClassRoom201                         |");
         System.out.println("|     6.ClassRoom202                         |");
         System.out.println("|     7.ClassRoom301                         |");
         System.out.println("|     8.ClassRoom302                         |");
         System.out.println("|     9.ClassRoom401                         |");
         System.out.println("|                                            |");
         System.out.println("----------------------------------------------");
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      
         switch(N) {
         case 0: selectRoom();
            break;
         case 1: ClassRoom.getInstance001().showTimeTable();
            MainPage.FirstStep();
            break;
         case 2: ClassRoom.getInstance002().showTimeTable();
         MainPage.FirstStep();
         break;
         case 3: ClassRoom.getInstance101().showTimeTable();
         MainPage.FirstStep();
         break;
         case 4: ClassRoom.getInstance102().showTimeTable();
         MainPage.FirstStep();
         break;
         case 5: ClassRoom.getInstance201().showTimeTable();
         MainPage.FirstStep();
         break;
         case 6: ClassRoom.getInstance202().showTimeTable();
         MainPage.FirstStep();
         break;
         case 7: ClassRoom.getInstance301().showTimeTable();
         MainPage.FirstStep();
         break;
         case 8: ClassRoom.getInstance302().showTimeTable();
         MainPage.FirstStep();
         break;
         case 9: ClassRoom.getInstance401().showTimeTable();
         MainPage.FirstStep();
         break;
         }
   }
   
   public static void loadMeetingRoom()
   {
         System.out.println("---------------조회 회의실을 선택하세요-------------");
         System.out.println("|                                            |");
         System.out.println("|     0.뒤로가기                               |");
         System.out.println("|     1.KAgroSmallMeetingRoom                |");
         System.out.println("|     2.KAgroBigMeetingRoom                  |");
         System.out.println("|     3.LibraryMeetingRoom                   |");
         System.out.println("|     4.EngineeringMeetingRoom               |");
         System.out.println("|     5.LiberalMeetingRoom                   |");
         System.out.println("|                                            |");
         System.out.println("----------------------------------------------");
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      switch (N) {
         case 0: selectRoom();
            break;
         case 1: MeetingRoom.getInstanceKAS().showTimeTable();
            MainPage.FirstStep();
            break;
         case 2: MeetingRoom.getInstanceKAB().showTimeTable();
         MainPage.FirstStep();
         break;
         case 3: MeetingRoom.getInstanceLMR().showTimeTable();
         MainPage.FirstStep();
         break;
         case 4: MeetingRoom.getInstanceEMR().showTimeTable();
         MainPage.FirstStep();
         break;
         case 5: MeetingRoom.getInstanceLiMR().showTimeTable();
         MainPage.FirstStep();
         break;
         }
   }
   
   public static void selectObject()
   {
      
   }
}