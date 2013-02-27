package org.example.wolfshark; 
 
public class Room {
 
    //private variables
    int roomNum;
    String bldgName;
    int roomX;
    int roomY;
    String floorImage;
 
    // Empty constructor
    public Room(){
 
    }
    
    // constructor
    public Room(int roomNum, String bldgName, int roomX, int roomY, String floorImage){
        this.roomNum = roomNum;
        this.bldgName = bldgName;
        this.roomX = roomX;
        this.roomY = roomY;
        this.floorImage = floorImage;
    }
 
    // constructor
    public Room(int roomX, int roomY, String floorImage){
        this.roomX = roomX;
        this.roomY = roomY;
        this.floorImage = floorImage;
    }
    
    // getting roomNum
    public int getroomNum(){
        return this.roomNum;
    }
 
    // setting roomNum
    public void setroomNum(int roomNum){
        this.roomNum = roomNum;
    }
 
    // getting bldgName
    public String getbldgName(){
        return this.bldgName;
    }
 
    // setting bldgName
    public void setbldgName(String bldgName){
        this.bldgName = bldgName;
    }
 
    // getting roomX
    public int getroomX(){
        return this.roomX;
    }
 
    // setting roomX
    public void setroomX(int roomX){
        this.roomX = roomX;
    }
    
 // getting roomY
    public int getroomY(){
        return this.roomY;
    }
 
    // setting roomY
    public void setroomY(int roomY){
        this.roomY = roomY;
    }
    
    // getting floorImage
    public String getfloorImage(){
        return this.floorImage;
    }
 
    // setting floorImage
    public void setfloorImage(String floorImage){
        this.floorImage = floorImage;
    }
}