package Borrow;

public class Indivisual extends Borrower {
	private String PhoneNumber;

	public Indivisual(String name, String phoneNumber) {
		this.Name = name;
		this.PhoneNumber = phoneNumber;
	}

	public Indivisual() {
	}

	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}

	public String getPhoneNumber() {
		return this.PhoneNumber;
	}
}
