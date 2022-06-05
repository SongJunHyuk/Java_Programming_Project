import Data.Dataset;
import Place.Place;
import Place.Playground;
import UI.MainPage;

/*
class Room {
  int MaxStudent; // 방이 수용 가능한 최대 인원수
  
  public Room() {  }
  
  public void SetMaxStudent(int MaxStudent) {
	  	this.MaxStudent = MaxStudent;
	  }

  public void SetAvailbble() {
    return ;
  }
  public void SetUnavailbble() {
	return ;
  }
}

//-------------↑Room↑-------------------

class MeetingRoom extends Room{
	
	String MeetingRoomName;
	
	boolean PresentationAvailable;
	
	public MeetingRoom(String MeetingRoomName) {
		this.MeetingRoomName = MeetingRoomName;
	}
	
	public void ShowMax() {
		System.out.println("강의실 최대 인원수 : " + MaxStudent);
	}
	
	public void ShowRoomName() {
		System.out.println("강의실 번호 : " + MeetingRoomName);
	}
	
}*/
/*
		MeetingRoom R = new MeetingRoom("8002A");
		R.SetMaxStudent(50);
		R.ShowRoomName(); R.ShowMax();
	}*/

public class Start {

	public static void main(String[] args) {
		Dataset.insert_Data();
		MainPage.FirstStep();
	}
}