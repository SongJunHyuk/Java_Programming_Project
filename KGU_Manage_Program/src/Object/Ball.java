package Object;

public class Ball extends Object {
	private int quantity;
	private String Number;

	Ball(int quantity, String num) {
		this.quantity = quantity;
		this.Number = num;
	}

	public void setQuantity(int num) {
		this.quantity = num;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setNumber(String borrowerPhoneNumber) {
		this.Number = borrowerPhoneNumber;
	}

	public String getNumber() {
		return this.Number;
	}
}