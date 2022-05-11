package RoomPackage;

public class ClassRoom extends Room{
	
	boolean havingComputer;
	boolean isUnderground;
	
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
	
	
	int[][] timeTable = new int[9][7];
	for(int i = 0;i<=timeTable.length;i++) {
		
	}
	

}
