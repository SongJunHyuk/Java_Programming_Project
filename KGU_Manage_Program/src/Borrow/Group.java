package Borrow;

import java.util.ArrayList;

public class Group extends Borrower {
	private int NumOfPeople;
	private String RepresentativeName;
	
	ArrayList BorrowingPlace = new ArrayList();
	
	public void BorrowPlace(int Place_Num)
	{
		this.BorrowingPlace.add(Place_Num);
	}
	
	public void returnPlace(int Place_Num)
	{
		this.BorrowingPlace.remove(BorrowingPlace.indexOf(Place_Num));
		//Ãß°¡ : Place ¹Ý³³
	}
}