package Object;

abstract class Manage_Program{
	
}

public class Object_Overlapping extends Manage_Program{
	private int Quantity;
	void increaseQuantity(int Quantity) {
		this.Quantity += Quantity; 
	}
	void decreaseQuantity(int quantity) {
		this.Quantity -= Quantity;
	}
}

class Books extends Object_Overlapping{
	String Categroy;
	String BookName;
	String Author;
}

class Ball extends Object_Overlapping{
	int size;
	String name;
}

class AirPump extends Object_Overlapping{
	
}

class Table extends Object_Overlapping{
	int size;
}

class Tent extends Object_Overlapping{
	int size;
	String color;
}

class TwoWayRadio extends Object_Overlapping{
	
}

class LCar extends Object_Overlapping{
	
}

class Battery extends Object_Overlapping{
	int capacity;
}

class ChargingCable extends Object_Overlapping{
	String cableType;
}

class HairIron extends Object_Overlapping{
	
}

class HairDryer extends Object_Overlapping{
	
}

class Helmet extends Object_Overlapping{
	int size;
}

