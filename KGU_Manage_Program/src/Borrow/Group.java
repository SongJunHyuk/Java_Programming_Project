package Borrow;

public class Group extends Borrower {
	private int NumOfPeople;
	private String RepresentativeName;
	
	public void setNumOfPeople (int NumOfPeople) {
		this.NumOfPeople = NumOfPeople;
	}
	
	public int getNumOfPeople () {
		return this.NumOfPeople;
	}
	
	public void setRepresentativeName(String RepresentativeName) {
		this.RepresentativeName = RepresentativeName;
	}
	
	public String getRepresentativeName() {
		return this.RepresentativeName;
	}
}