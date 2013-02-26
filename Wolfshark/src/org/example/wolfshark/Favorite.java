package org.example.wolfshark; 
 
public class Favorite {
 
    //private variables
    int id;
    String room;
    String building;
 
    // Empty constructor
    public Favorite(){
 
    }
    // constructor
    public Favorite(int id, String room, String building){
        this.id = id;
        this.room = room;
        this.building = building;
    }
 
    // constructor
    public Favorite(String room, String building){
        this.room = room;
        this.building = building;
    }
    // getting ID
    public int getID(){
        return this.id;
    }
 
    // setting id
    public void setID(int id){
        this.id = id;
    }
 
    // getting name
    public String getRoom(){
        return this.room;
    }
 
    // setting name
    public void setRoom(String room){
        this.room = room;
    }
 
    // getting phone number
    public String getBuilding(){
        return this.building;
    }
 
    // setting phone number
    public void setBuilding(String building){
        this.building = building;
    }
}