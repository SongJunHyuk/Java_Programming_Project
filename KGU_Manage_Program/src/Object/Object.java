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
    
    public void showObjectList(){
        while (true) {
        	Scanner sc = new Scanner(System.in);
            for (int i = 0; i < objectList.size(); i++) {
                System.out.println("===============================");
                System.out.println("물품명 : " + objectList.get(i).getobName());
                System.out.println("수량  : " + objectList.get(i).getobQuantity());
                System.out.println("대여가능 : " + objectList.get(i).isobAvailable());
                System.out.println("===============================\n");
 
            } 
            System.out.println("초기 메뉴 이동 : [B]");
            String temp = sc.nextLine();
            sc.close();
            if (temp.equalsIgnoreCase("b") || temp.equalsIgnoreCase("B")) {
                break;
            } else {
                System.out.println("잘못 누르셨습니다. 초기화면으로 이동합니다.");
                break; 
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
    private Boolean bAvailable;
    private ArrayList<Books> bookList = new ArrayList<Books>();
 
    public Books() {
 
    }
    
    public void insertBook() {
        while (true) {
            Books book = new Books();
            Scanner sc = new Scanner(System.in);
            while (true) {
            	int cnt=0;
                System.out.println("도서 번호 입력");
                String temp = sc.nextLine();
                for (int i = 0; i < bookList.size(); i++) {
                    if (temp.equals(bookList.get(i).getbNo())) {
                        cnt++;
                        System.out.println("도서 번호 중복입니다. 다시 입력하세요.");
                        break;
                    }
                }
                if(cnt==0) {
                    book.setbNo(temp);
                    break;
                }
            } 
            System.out.println("책 제목 입력");
            book.setbTitle(sc.nextLine());
            System.out.println("작가 입력");
            book.setbAuthor(sc.nextLine());
            System.out.println("장르 입력");
            book.setbGenre(sc.nextLine());
            book.setbAvailable(true);
 
            System.out.println("도서번호 : " + book.getbNo());
            System.out.println("도서제목 : " + book.getbTitle());
            System.out.println("지 은 이  : " + book.getbAuthor());
            System.out.println("장     르  : " + book.getbGenre());
            System.out.println("대여가능 : " + book.isbAvailable());
 
            System.out.println("입력하신 사항이 모두 맞습니까? 예(Y) 아니오(N)");
            String confirm = sc.nextLine();
            if (confirm.equalsIgnoreCase("y") || confirm.equalsIgnoreCase("Y")) {
                bookList.add(book);
                System.out.println("======입력 완료=====");
                break;
            } else if (confirm.equalsIgnoreCase("n") || confirm.equalsIgnoreCase("N")) {
                System.out.println("도서 정보를 새로 입력하세요.");
            } else {
                System.out.println("잘못 누르셨습니다. 초기 메뉴로 이동합니다");
                break; 
            }
        }  
    }
    
    public void showBookList() {
        while (true) {
            Scanner sc = new Scanner(System.in);
        	System.out.println("보유 도서량:  " + bookList.size());
            for (int i = 0; i < bookList.size(); i++) {
                System.out.println("===============================");
                System.out.println("책 번호 : " + bookList.get(i).getbNo());
                System.out.println("책 제목 : " + bookList.get(i).getbTitle());
                System.out.println("지은이  : " + bookList.get(i).getbAuthor());
                System.out.println("장   르  : " + bookList.get(i).getbGenre());
                System.out.println("대여가능 : " + bookList.get(i).isbAvailable());
                System.out.println("===============================\n");
            } 
            System.out.println("초기 메뉴 이동 : [b] \t 프로그램 종료 : [0]");
            String temp = sc.nextLine();
            sc.close();
            if (temp.equalsIgnoreCase("b")) {
                break;
            } 
            else {
                System.out.println("잘못 누르셨습니다. 초기화면으로 이동합니다.");
                break; 
            } 
        } 
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
    
    public void setbAvailable(Boolean bAvailable) {
    	this.bAvailable = bAvailable;
    }
    public Boolean isbAvailable() {
    	return bAvailable;
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

class LCar extends Object{
	private int quantity;
	
	LCar(int quantity){
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

class HairIron extends Object{
private int quantity;
	
	HairIron(int quantity){
		this.quantity = quantity;
	}
}

class HairDryer extends Object{
	private int quantity;
	
	HairDryer(int quantity){
		this.quantity = quantity;
	}
}

class Helmet extends Object{
	private static String size;
	private int quantity;
	
	Helmet(String size, int quantity){
		this.size = size;
		this.quantity = quantity;
	}
	
	public String getHelmetSize() {
		return size;
	}
}

