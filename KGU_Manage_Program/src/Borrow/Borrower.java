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
		//�߰� : ClassRoom �ݳ� 
	}
	
	public void rentMeetingRoom(int MeetingRoom_Num)
	{
		this.BorrowingPlaces.add(MeetingRoom_Num);
	}
	
	public void returnMeetingRoomRoom(int MeetingRoom_Num)
	{
		this.BorrowingPlaces.remove(BorrowingPlaces.indexOf(MeetingRoom_Num));
		//�߰� : MeetingRoom �ݳ� 
	}
	
	public void borrowObject(int Object_Num)
	{
		this.BorrowingThings.add(Object_Num);
	}
	
	public void returnObject(int Object_Num)
	{
		this.BorrowingThings.remove(BorrowingThings.indexOf(Object_Num));
		//�߰� : Object �ݳ� 
	}

}