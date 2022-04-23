package Borrow;

import java.util.ArrayList;

public class Indivisual extends Borrower {
	private int Grade;
	private int Age;
	private String PhoneNumber;
	
	ArrayList BorrowingBooks = new ArrayList();
	
	void loanBook(int Book_Num)
	{
		this.BorrowingBooks.add(Book_Num);
	}
	
	void returnBook(int Book_Num)
	{
		this.BorrowingBooks.remove(BorrowingBooks.indexOf(Book_Num));
		//Ãß°¡ : Book ¹Ý³³ 
	}
}
