package Object;

import java.util.ArrayList;

public class Object {
    private boolean obAvailable;
    private ArrayList<Object> objectList = new ArrayList<Object>();
    private int obQuantityLeft;
    private static int obQuantity;
 
    public Object() {
 
    }
 
    public boolean isobAvailable() {
        return obAvailable;
    }
 
    public void setobAvailable(boolean obAvailable) {
        this.obAvailable = obAvailable;
    }
    
    public void setobQuantity(int obQuantity) {
        this.obQuantity = obQuantity;
    }
    
    public int getobQuantity() {
    	return obQuantity;
    }
    
    public void setobQuantityLeft(int obQuantityLeft) {
        this.obQuantityLeft = obQuantityLeft;
    }
    
    public int getobQuantityLeft() {
    	return obQuantityLeft;
    }

	void increaseobQuantityLeft(int obQuantityLeft) {
		if (obQuantity + obQuantityLeft > obQuantityLeft){
				System.out.println("Cannot increase quantity above the stated quantity");
				return;
		}
		this.obQuantityLeft += obQuantityLeft;
	}
	void decreaseobQuantityLeft(int obQuantityLeft) {
		if (obQuantity - obQuantityLeft < 0){
				System.out.println("Cannot decrease quantity below zero");
				return;
		}
		this.obQuantityLeft -= obQuantityLeft;
	}
    
}   


class Books extends Object{
    private String bNo;
    private String bTitle;
    private String bAuthor;
    private String bGenre;
    private ArrayList<Books> bookList = new ArrayList<Books>();
 
    public Books() {
 
    }
 
    public String getbNo() {
        return bNo;
    }
 
    public void setbNo(String bNo) {
        this.bNo = bNo;
    }
 
    public String getbTitle() {
        return bTitle;
    }
 
    public void setbTitle(String bTitle) {
        this.bTitle = bTitle;
    }
 
    public String getbAuthor() {
        return bAuthor;
    }
 
    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }
 
    public String getbGenre() {
        return bGenre;
    }
 
    public void setbGenre(String bGenre) {
        this.bGenre = bGenre;
    }
 
}


class Ball extends Object{
	private static String type;
	
	public String getBallType() {
		return type;
	}
	
	public void setBallType(String type) {
		this.type = type;
	}
}

class AirPump extends Object{
	
}

class Table extends Object{
	private static int tableLength;
	private static int tableWidth;
	
	public int getTableLength() {
		return tableLength;
	}
	
	public int getTableWidth() {
		return tableWidth;
	}
	
	public void setTableLength(int tableLength) {
		this.tableLength = tableLength;
	}
	
	public void setTableWidth(int tableWidth) {
		this.tableWidth = tableWidth;
	}
}

class Tent extends Object{
	private static int size;
	private String color;
	
	public String getTentColor() {
		return color;
	}
	
	public void setTentColor(String color) {
		this.color = color;
	}
}

class TwoWayRadio extends Object{
	
}

class LCar extends Object{
	
}

class Battery extends Object{
	private static int capacity;
	private int capacityLeft;
	private boolean batteryAvailable;
	
	public boolean batteryCharged() {
		return batteryAvailable;
	}
	
	public void setbatteryCharged(boolean batteryAvailable) {
		this.batteryAvailable = batteryAvailable;
	}
	
	public int getBatteryCapacity() {
		return capacity;
	}
	
	public void setBatteryCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public int getBatteryCapacityLeft() {
		return capacityLeft;
	}
	
	public void setBatteryCapacityLeft(int capacityLeft) {
		if (capacityLeft < 0 || capacityLeft > 100) {
			System.out.println("Battery capacity left has to be between 0 and 100");
			return;
		}
		this.capacityLeft = capacityLeft;
	}
}

class ChargingCable extends Object{
	String cableType;
	
	public String getCableType() {
		return cableType;
	}
	
	public void setCableType(String cableType) {
		this.cableType = cableType;
	}
}

class HairIron extends Object{
	
}

class HairDryer extends Object{
	
}

class Helmet extends Object{
	private static int size;
	
	public int getHelmetSize() {
		return size;
	}
	
}
