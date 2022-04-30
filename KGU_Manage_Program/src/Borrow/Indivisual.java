package Borrow;

import java.util.ArrayList;

public class Indivisual extends Borrower {
	private int Grade;
	private int Age;
	private String PhoneNumber;
	
	public void setGrade(int Grade) {
		this.Grade = Grade;
	}
	
	public int getGrade() {
		return this.Grade;
	}
	
	public void setAge(int Age) {
		this.Age = Age;
	}
	
	public int getAge() {
		return this.Age;
	}
	
	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}
	
	public String getPhoneNumber() {
		return this.PhoneNumber;
	}
}
