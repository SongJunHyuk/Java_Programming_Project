package Borrow;

import java.util.ArrayList;

public class Borrower {

	private String Name;
	private String TemperaturePriorty;
	ArrayList BorrowingThings = new ArrayList();
	ArrayList BorrowingPlaces = new ArrayList();
	
	public void rentClassRoom(int ClassRoom_Num)
	{
		this.BorrowingPlaces.add(ClassRoom_Num);
	}
	
	public void returnClassRoom(int ClassRoom_Num)
	{
		this.BorrowingPlaces.remove(BorrowingPlaces.indexOf(ClassRoom_Num));
		//Ãß°¡ : ClassRoom ¹Ý³³ 
	}
	
	public void rentMeetingRoom(int MeetingRoom_Num)
	{
		this.BorrowingPlaces.add(MeetingRoom_Num);
	}
	
	public void returnMeetingRoomRoom(int MeetingRoom_Num)
	{
		this.BorrowingPlaces.remove(BorrowingPlaces.indexOf(MeetingRoom_Num));
		//Ãß°¡ : MeetingRoom ¹Ý³³ 
	}
	
	public void borrowObject(int Object_Num)
	{
		this.BorrowingThings.add(Object_Num);
	}
	
	public void returnObject(int Object_Num)
	{
		this.BorrowingThings.remove(BorrowingThings.indexOf(Object_Num));
		//Ãß°¡ : Object ¹Ý³³ 
	}

}