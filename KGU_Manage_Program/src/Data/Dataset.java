package Data;
import Room.ClassRoom;
import java.util.ArrayList;
import java.util.HashMap;

public class Dataset {

	//추가사항 : DataStructure
	static ArrayList<Integer> ClassRoomlist = new ArrayList<Integer>(); // 모든 교실을 담는 list
	
	static HashMap<Integer,ClassRoom> ClassRoomHashmap = new HashMap<>(); // 클래스룸 객체에게 번호 할당
	
	public static void insert_Data()
	{
		ClassRoomHashmap.put(103, new ClassRoom(true, false));
		ClassRoom onehundredthree = new ClassRoom(true, false);
		onehundredthree.setMaxStudent(40);
		onehundredthree.setAirconditionCount(2);
		onehundredthree.setHeaterCount(2);
		onehundredthree.setFanCount(4);
		ClassRoomlist.add(103);
	}
	
	public static void delete_Data()
	{
		
	}
	
	public static void LoadData()
	{
		
	}
}
