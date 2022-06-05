package Object;

public class Table extends Object {
	private int quantity;
	private String Number;

	Table(int quantity, String num) {
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