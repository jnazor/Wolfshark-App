package org.example.wolfshark; 
 
public class Building {
 
    //private variables
    String bldgName;
    int bldgX;
    int bldgY;
 
    // Empty constructor
    public Building(){
 
    }
    
    // constructor
    public Building(String bldgName, int bldgX, int bldgY){
        this.bldgName = bldgName;
        this.bldgX = bldgX;
        this.bldgY = bldgY;
    }
 
    // constructor
    public Building(int bldgX, int bldgY){
        this.bldgX = bldgX;
        this.bldgY = bldgY;
    }
    
	// getting bldgName
    public String getbldgName(){
        return this.bldgName;
    }
 
    // setting bldgName
    public void setbldgName(String bldgName){
        this.bldgName = bldgName;
    }
 
    // getting bldgX
    public int getbldgX(){
        return this.bldgX;
    }
 
    // setting bldgX
    public void setbldgX(int bldgX){
        this.bldgX = bldgX;
    }
    
 // getting roomY
    public int getbldgY(){
        return this.bldgY;
    }
 
    // setting roomY
    public void setbldgY(int bldgY){
        this.bldgY = bldgY;
    }
}
