package Room;

public class MeetingRoom extends Room{
	
	String meetingRoomName;
	boolean presentationAvailable;

	public MeetingRoom() {}
	
	public MeetingRoom(String MeetingRoomName,boolean PresentationAvailable) {
		this.meetingRoomName = MeetingRoomName;
		this.presentationAvailable = PresentationAvailable;
	}
	
	public boolean getPresentationAvailable() {
		return presentationAvailable;
	}
	
	public void setPresentationAvailable(boolean presentationAvailable) {
		this.presentationAvailable = presentationAvailable;
	}
	
	public String getMeetingRoomName() {
		return meetingRoomName;
	}
	
	public void setMeetingRoomName(String meetingRoomName) {
		this.meetingRoomName = meetingRoomName;
	}
	
	/*
	 *
	 *int[][]timeTable
	 *
	 */
	
}