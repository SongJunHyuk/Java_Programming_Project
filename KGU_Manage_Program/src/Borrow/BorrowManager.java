package Borrow;

import java.util.ArrayList;

public class BorrowManager {
	
	private ArrayList<ClassRoom> ClassRoomList;
	private ArrayList<MeetingRoom> MeetingRoomList;
	private ArrayList<Object> ObjectList;
	private ArrayList<Place> PlaceList;
	private ArrayList<Book> BookList;
	
	public BorrowManager()
	{
		ClassRoomList = new ArrayList<ClassRoom>;
		MeetingRoomList = new ArrayList<MeetingRoom>;
		ObjectList = new ArrayList<Object>;
		PlaceList = new ArrayList<Place>;
		BookList = new ArrayList<Book>;
	}
	
	public void rentClassRoom(ClassRoom place)
	{
		this.ClassRoomList.add(place);
	}
	
	public void returnClassRoom(int id)
	{
		for(int i = 0 ; i < this.ClassRoomList.size(); i++)
		{
			ClassRoom place = this.ClassRoomList.get(i);
			if (place.getClassRoomId == id) {
				this.ClassRoomList.remove(i);
				System.out.println("Å¬·¡½º·ë ¹Ý³³");
				return;
			}
		}
		//Ãß°¡ : ClassRoom ¹Ý³³ 
	}
	
	public void rentMeetingRoom(MeetingRoom place)
	{
		this.MeetingRoomList.add(place);
	}
	
	public void returnMeetingRoomRoom(int id)
	{
		for(int i = 0 ; i < this.MeetingRoomList.size(); i++)
		{
			MeetingRoom place = this.MeetingRoomList.get(i);
			if (place.getMeetingRoomId == id) {
				this.MeetingRoomList.remove(i);
				System.out.println("¹ÌÆÃ·ë ¹Ý³³");
				return;
			}
		}
	}
	
	public void borrowObject(Object object)
	{
		this.ObjectList.add(object);
	}
	
	public void returnObject(int id)
	{
		for(int i = 0 ; i < this.ObjectList.size(); i++)
		{
			Object object = this.ObjectList.get(i);
			if (object.getObjectId == id) {
				this.ObjectList.remove(i);
				System.out.println("¹°°Ç ¹Ý³³");
				return;
			}
		}
		//Ãß°¡ : Object ¹Ý³³ 
	}

	void loanBook(Book book)
	{
		this.BookList.add(book);
	}
	
	void returnBook(int id)
	{
		for(int i = 0 ; i < this.BookList.size(); i++)
		{
			Book book = this.BookList.get(i);
			if (book.getBookId == id) {
				this.BookList.remove(i);
				System.out.println("Ã¥ ¹Ý³³");
				return;
			}
		}
		//Ãß°¡ : Book ¹Ý³³ 
	}
	
	public void borrowPlace(Place place)
	{
		this.PlaceList.add(place);
	}
	
	public void returnPlace(int id)
	{
		for(int i = 0 ; i < this.PlaceList.size(); i++)
		{
			Place place = this.PlaceList.get(i);
			if (place.getPlaceId == id) {
				this.PlaceList.remove(i);
				System.out.println("Àå¼Ò ¹Ý³³");
				return;
			}
		}
		//Ãß°¡ : Place ¹Ý³³
	}
}
