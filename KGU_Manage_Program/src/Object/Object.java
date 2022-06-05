package Object;

import java.util.ArrayList;
import java.util.Scanner;

public class Object {
    private boolean obAvailable;
    private ArrayList<Object> objectList = new ArrayList<Object>();
    private String obName;
    private int obQuantityLeft;
    private static int obQuantity;
    
    public void setobName(String obName) {
    	this.obName = obName;
    }
    
    public void setobQuantity(int obQuantity) {
        this.obQuantity = obQuantity;
    }
    
    public String getobName() {
    	return obName;
    }
    
    public Object() {
        
    }
    
    public void insertObject() throws InterruptedException {
        while (true) {
            Object object = new Object();
            Scanner sc = new Scanner(System.in);
            
            System.out.println("물품명 입력");
            object.setobName(sc.nextLine());
            System.out.println("수량 입력");
            object.setobQuantity(sc.nextInt());
            object.setobAvailable(true);
 
            // 입력 사항 맞는지 확인
            System.out.println("물품명 : " + object.getobName());
            System.out.println("수량 : " + object.getobQuantity());
            System.out.println("대여가능 : " + object.isobAvailable());
            
            System.out.println("입력하신 사항이 모두 맞습니까? 예(Y) 아니오(N)");
            String confirm = sc.nextLine();
            sc.close();
            if (confirm.equalsIgnoreCase("y")) {
                objectList.add(object);
                System.out.println("======입력 완료=====");
                break;
            } else if (confirm.equalsIgnoreCase("n")) {
                System.out.println("물품 정보를 새로 입력하세요.");
            } else {
                System.out.println("잘못 누르셨습니다. 초기 메뉴로 이동합니다");
                break; // 초기메뉴로 이동
            } 
        }
    }
    
    public void returnObject() {
    	
    }
//    public void initObject() {
//        objectList.add(new Ball("Soccer Ball", 10));
//        objectList.add(new Ball("BasketBall", 10));
//        objectList.add(new Ball("VolleyBall", 10));
//        
//        objectList.add(new AirPump(10));
//        objectList.add(new Table(10));
//        
//        objectList.add(new Tent("White", 5));
//        objectList.add(new Tent("Black", 5));
//        objectList.add(new Tent("Green", 5));
//        
//        objectList.add(new TwoWayRadio(10));
//        
//        objectList.add(new LCar(10));
//        objectList.add(new Battery(10));
//        
//        objectList.add(new ChargingCable("USB A", 10));
//        objectList.add(new ChargingCable("Lightning", 10));
//        objectList.add(new ChargingCable("USB C", 10));
//        
//        objectList.add(new HairIron(10));
//        
//        objectList.add(new HairDryer(10));
//        
//        objectList.add(new Helmet("S", 10));
//        objectList.add(new Helmet("M", 10));
//        objectList.add(new Helmet("L", 10));   
//    }
    
    public boolean isobAvailable() {
        return obAvailable;
    }
 
    public void setobAvailable(boolean obAvailable) {
        this.obAvailable = obAvailable;
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
	private int quantity;
	
	Ball(String type, int quantity){
		this.type = type;
		this.quantity = quantity;
	}
	
	public String getBallType() {
		return type;
	}
	
	public void setBallType(String type) {
		this.type = type;
	}
}

class AirPump extends Object{
	private int quantity;
	
	AirPump(int quantity){
		this.quantity = quantity;
	}
}

class Table extends Object{
	private static int tableLength;
	private static int tableWidth;
	private int quantity;
	
	Table(int quantity){
		this.quantity = quantity;
	}
	
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
	
	private int quantity;
	
	Tent(String color, int quantity){
		this.color = color;
		this.quantity = quantity;
	}
	
	public String getTentColor() {
		return color;
	}
	
	public void setTentColor(String color) {
		this.color = color;
	}
}

class TwoWayRadio extends Object{
	private int quantity;
	
	TwoWayRadio(int quantity){
		this.quantity = quantity;
	}
}

class Battery extends Object{
	private static int capacity;
	private int capacityLeft;
	private boolean batteryAvailable;
	
	private int quantity;
	
	Battery(int quantity){
		this.quantity = quantity;
	}
	
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
	
	private int quantity;
	
	ChargingCable(String cableType, int quantity){
		this.cableType = cableType;
		this.quantity = quantity;
	}
	
	public String getCableType() {
		return cableType;
	}
	
	public void setCableType(String cableType) {
		this.cableType = cableType;
	}
}


