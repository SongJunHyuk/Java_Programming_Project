package Borrow;

import java.util.ArrayList;

public class Borrower {

	private String Name;
	private String TemperaturePriorty;
	
	public Borrower()
	{
		BorrowManager manager = new BorrowManager();
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public String getName() {
		return this.Name;
	}
	
	public void setTemperaturePriorty(String TemperaturePriorty) {
		this.TemperaturePriorty = TemperaturePriorty;
	}
	
	public String getTemperaturePriorty() {
		return this.TemperaturePriorty;
	}
}