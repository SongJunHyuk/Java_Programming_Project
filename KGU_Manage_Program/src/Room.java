package RoomPackage;

public class Room{
	int maxStudent;
	int airconditionCount;
	int heaterCount;
	int fanCount;
	
	public Room() {} 
	
	public Room(int maxStudent, int airconditionalCount, int heaterCount, int fanCount) {
		super();
		this.maxStudent = maxStudent;
		this.airconditionCount = airconditionalCount;
		this.heaterCount = heaterCount;
		this.fanCount = fanCount;
	}
	
	public int getMaxStudent() {
		return maxStudent;
	}
	
	public void setMaxStudent(int maxStudent) {
		this.maxStudent = maxStudent;
	}
		public int getAirconditionCount() {
		return airconditionCount;
	}
	
	public void setAirconditionCount(int airconditionCount) {
		this.airconditionCount = airconditionCount;
	}
	
	public int getHeaterCount() {
		return heaterCount;
	}
	
	public void setHeaterCount(int heaterCount) {
		this.heaterCount = heaterCount;
	}
	
	public int getFanCount() {
		return fanCount;
	}
	
	public void setFanCount(int fanCount) {
		this.fanCount = fanCount;
	}
	
	public void setAvaialble(boolean havingComputer){
		
		System.out.println("available");
	
	}
	
	public void setUnavailable(boolean havingComputer) {
		
		System.out.println("unavailable");
		
	}
	
	public String temperatureCondition(int ac, int hc, int fc) {
		
		int score = 0;
		
		if(ac>=1)
			score += 60;
		
		if(hc==1) 
			score += 10;
		
		else if(hc>=2)
			score += 20;
		
		if(fc>=4)
			score += 10;
		
		if(score>=80) {
			return "Suitable";
			// or "에어컨은 " + ac + "개 이고.... 
		}
		else {
			return "Unsuitable";
		}
		
	}
}