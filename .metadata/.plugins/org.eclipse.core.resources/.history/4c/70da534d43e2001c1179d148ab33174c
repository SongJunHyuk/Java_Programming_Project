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
		if (obQuantity == obQuantityLeft){
				System.out.println("Cannot increase quantity above the stated quantity");
				return;
		}
		this.obQuantityLeft += obQuantityLeft;
	}
	void decreaseobQuantityLeft(int obQuantityLeft) {
		if (obQuantityLeft == 0){
				System.out.println("Cannot decrease quantity below the stated quantity");
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
 
//    public boolean isbAvailable() {
//        return bAvailable;
//    }
 
//    public void setbAvailable(boolean bAvailable) {
//        this.bAvailable = bAvailable;
//    }
 
}

//
//class Ball extends Object_Overlapping{
//	int size;
//	String name;
//}
//
//class AirPump extends Object_Overlapping{
//	
//}
//
//class Table extends Object_Overlapping{
//	int size;
//}
//
//class Tent extends Object_Overlapping{
//	int size;
//	String color;
//}
//
//class TwoWayRadio extends Object_Overlapping{
//	
//}
//
//class LCar extends Object_Overlapping{
//	
//}
//
//class Battery extends Object_Overlapping{
//	int capacity;
//}
//
//class ChargingCable extends Object_Overlapping{
//	String cableType;
//}
//
//class HairIron extends Object_Overlapping{
//	
//}
//
//class HairDryer extends Object_Overlapping{
//	
//}
//
//class Helmet extends Object_Overlapping{
//	int size;
//}

