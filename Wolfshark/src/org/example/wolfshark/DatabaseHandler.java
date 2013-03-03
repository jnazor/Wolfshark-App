package org.example.wolfshark;
 
import java.util.ArrayList;
import java.util.List;
 
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
 
public class DatabaseHandler extends SQLiteOpenHelper {
 
    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;
 
    // Database Room
    private static final String DATABASE_NAME = "pathsDB";
 
    // Table names
    private static final String TABLE_FAV = "Favorites";
    private static final String TABLE_ROOM = "Room";
    private static final String TABLE_BLDG = "Buidling";
 
    // Favorites table column names
    private static final String KEY_ID = "id";
    private static final String KEY_ROOM = "room";
    private static final String KEY_BUILD = "building";
    
    // Room table column names
    private static final String KEY_NUM = "roomNum";
    private static final String KEY_BLDG = "bldgName"; // Also used for Building table, as primary key
    private static final String KEY_ROOMX = "roomX";
    private static final String KEY_ROOMY = "roomY";
    private static final String KEY_IMAGE = "floorImage";
    
    // Building table column names
    private static final String KEY_BLDGX = "bldgX";
    private static final String KEY_BLDGY = "bldgY";
 
    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
 
    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
    	// Query to create Favorites table
        String CREATE_FAVORITES_TABLE = "CREATE TABLE " + TABLE_FAV + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_ROOM + " TEXT,"
                + KEY_BUILD + " TEXT " + ")";
        db.execSQL(CREATE_FAVORITES_TABLE);
        
        // Query to create Room table with compound primary key
        String CREATE_ROOM_TABLE = "CREATE TABLE " + TABLE_ROOM + "("
        		+ KEY_NUM + " INTEGER," + KEY_BLDG + " TEXT,"
        		+ KEY_ROOMX + " INTEGER, " + KEY_ROOMY + " INTEGER, "
        		+ KEY_IMAGE + " TEXT, " + "PRIMARY KEY (" + KEY_NUM + ", " + KEY_BLDG + "))";
        db.execSQL(CREATE_ROOM_TABLE);
        
        // Query to create Building table
        String CREATE_BLDG_TABLE = "CREATE TABLE " + TABLE_BLDG + "("
        		+ KEY_BLDG + " TEXT, " + KEY_BLDGX + " INTEGER, " 
        		+ KEY_BLDGY + " INTEGER" + ")";
        db.execSQL(CREATE_BLDG_TABLE);
    }
 
    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_FAV);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ROOM);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_BLDG);
 
        // Create tables again
        onCreate(db);
    }
 
    /**
     * All CRUD(Create, Read, Update, Delete) Operations
     */
 
    /**CRUD FOR FAVORITES TABLE**/
    // Adding new favorite
    void addFavorite(Favorite favorite) {
        SQLiteDatabase db = this.getWritableDatabase();
 
        ContentValues values = new ContentValues();
        values.put(KEY_ID, favorite.getID()); // Favorite ID
        values.put(KEY_ROOM, favorite.getRoom()); // Favorite Room
        values.put(KEY_BUILD, favorite.getBuilding()); // Favorite Building
 
        // Inserting Row
        db.insert(TABLE_FAV, null, values);
        db.close(); // Closing database connection
    }
 
    // Getting single favorite
    Favorite getFavorite(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
 
        Cursor cursor = db.query(TABLE_FAV, new String[] { KEY_ID,
                KEY_ROOM, KEY_BUILD }, KEY_ID + "=?",
                new String[] { String.valueOf(id) }, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();
 
        Favorite favorite = new Favorite(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getString(2));
        // return favorite
        return favorite;
    }
 
    // Getting All Favorites
    public List<Favorite> getAllFavorites() {
        List<Favorite> favoriteList = new ArrayList<Favorite>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_FAV;
 
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
 
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Favorite favorite = new Favorite();
                favorite.setID(Integer.parseInt(cursor.getString(0)));
                favorite.setRoom(cursor.getString(1));
                favorite.setBuilding(cursor.getString(2));
                // Adding favorite to list
                favoriteList.add(favorite);
            } while (cursor.moveToNext());
        }
 
        // return favorite list
        return favoriteList;
    }
 
    // Updating single favorite
    public int updateFavorite(Favorite favorite) {
        SQLiteDatabase db = this.getWritableDatabase();
 
        ContentValues values = new ContentValues();
        values.put(KEY_ROOM, favorite.getRoom());
        values.put(KEY_BUILD, favorite.getBuilding());
 
        // updating row
        return db.update(TABLE_FAV, values, KEY_ID + " = ?",
                new String[] { String.valueOf(favorite.getID()) });
    }
 
    // Deleting single favorite
    public void deleteFavorite(Favorite favorite) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_FAV, KEY_ID + " = ?",
                new String[] { String.valueOf(favorite.getID()) });
        db.close();
    }
 
    // Getting favorites Count
    public int getFavoritesCount() {
        String countQuery = "SELECT  * FROM " + TABLE_FAV;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();
 
        // return count
        return cursor.getCount();
    }
    
    
    
    /**CRUD FOR ROOM TABLE**/
    // Adding new room
    void addRoom(Room room) {
        SQLiteDatabase db = this.getWritableDatabase();
 
        ContentValues values = new ContentValues();
        
        values.put(KEY_NUM, room.getroomNum()); // Room room number
        values.put(KEY_BLDG, room.getbldgName()); // Room building name
        values.put(KEY_ROOMX, room.getbldgName()); // Room X-coord
        values.put(KEY_ROOMY, room.getbldgName()); // Room Y-coord
        values.put(KEY_IMAGE, room.getfloorImage()); // Room floor image
 
        // Inserting Row
        db.insert(TABLE_ROOM, null, values);
        db.close(); // Closing database connection
    }
 
 // Getting single room
    public Room getRoom(int roomNum) {
        SQLiteDatabase db = this.getReadableDatabase();
     
        Cursor cursor = db.query(TABLE_ROOM, 
        						new String[] { KEY_NUM, KEY_BLDG, KEY_ROOMX, KEY_ROOMY, KEY_IMAGE }, 
        						KEY_NUM + "=?",
        						new String[] { String.valueOf(roomNum) }, 
        						null, null, null);
        
        // move to the beginning of the list of values
        if (cursor != null)
            cursor.moveToFirst();
     
        // create a new room object from the values collected form the DB
        Room room = new Room(Integer.parseInt(cursor.getString(0)), cursor.getString(1), 
        		Integer.parseInt(cursor.getString(2)), Integer.parseInt(cursor.getString(3)), cursor.getString(4));
        // return room
        return room;
    }
 
    // Getting all rooms
    public List<Room> getAllRooms() {
        List<Room> roomList = new ArrayList<Room>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_ROOM;
 
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
 
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
            	Room room = new Room();
            	room.setroomNum(Integer.parseInt(cursor.getString(0)));
                room.setbldgName(cursor.getString(1));
                room.setroomX(Integer.parseInt(cursor.getString(2)));
                room.setroomY(Integer.parseInt(cursor.getString(3)));
                room.setfloorImage(cursor.getString(4));
                // adding room to list
                roomList.add(room);
            } while (cursor.moveToNext());
        }
 
        // return room list
        return roomList;
    }
 
    // Updating single room
    public int updateRoom(Room room) {
        SQLiteDatabase db = this.getWritableDatabase();
 
        ContentValues values = new ContentValues();
        values.put(KEY_BLDG, room.getbldgName());
        values.put(KEY_ROOMX, room.getroomX());
        values.put(KEY_ROOMY, room.getroomY());
        values.put(KEY_IMAGE, room.getfloorImage());
 
        // updating row
        return db.update(TABLE_ROOM, values, KEY_NUM + " = ?",
                new String[] { String.valueOf(room.getroomNum()) });
    }
 
    // Deleting single room
    public void deleteRoom(Room room) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_ROOM, KEY_ID + " = ?",
                new String[] { String.valueOf(room.getroomNum()) });
        db.close();
    }
 
    // Getting room count
    public int getRoomCount() {
        String countQuery = "SELECT  * FROM " + TABLE_ROOM;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();
 
        // return count
        return cursor.getCount();
    }
    
    
    /**CRUD FOR BUILDING TABLE**/
    // Adding new building
    void addBuilding(Building bldg) {
        SQLiteDatabase db = this.getWritableDatabase();
 
        ContentValues values = new ContentValues();
        
        values.put(KEY_BLDG, bldg.getbldgName()); // Building name
        values.put(KEY_BLDGX, bldg.getbldgX()); // Building X-coord
        values.put(KEY_BLDGY, bldg.getbldgY()); // Building Y-coord
 
        // Inserting building
        db.insert(TABLE_BLDG, null, values);
        db.close(); // Closing database connection
    }
 
 // Getting single building
    public Building getBuilding(String bldgName) {
        SQLiteDatabase db = this.getReadableDatabase();
     
        Cursor cursor = db.query(TABLE_BLDG, new String[] { KEY_BLDG,
                KEY_BLDGX, KEY_BLDGY }, KEY_BLDG + "=?",
                new String[] { String.valueOf(bldgName) }, null, null, null, null);
        
        // move to the beginning of the list of values
        if (cursor != null)
            cursor.moveToFirst();
     
        // create a new building object from the values collected form the DB
        Building bldg = new Building(cursor.getString(0), Integer.parseInt(cursor.getString(1)), 
        		Integer.parseInt(cursor.getString(2)));
        // return building
        return bldg;
    }
 
    // Getting all buildings
    public List<Building> getAllBuildings() {
        List<Building> bldgList = new ArrayList<Building>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_BLDG;
 
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
 
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
            	Building bldg = new Building();
            	bldg.setbldgName(cursor.getString(0));
            	bldg.setbldgX(Integer.parseInt(cursor.getString(1)));
            	bldg.setbldgY(Integer.parseInt(cursor.getString(2)));
                // adding building to list
                bldgList.add(bldg);
            } while (cursor.moveToNext());
        }
 
        // return building list
        return bldgList;
    }
 
    // Updating single building
    public int updateBuilding(Building bldg) {
        SQLiteDatabase db = this.getWritableDatabase();
 
        ContentValues values = new ContentValues();
        values.put(KEY_BLDG, bldg.getbldgName());
        values.put(KEY_BLDGX, bldg.getbldgX());
        values.put(KEY_BLDGY, bldg.getbldgY());
 
        // updating row
        return db.update(TABLE_BLDG, values, KEY_NUM + " = ?",
                new String[] { String.valueOf(bldg.getbldgName()) });
    }
 
    // Deleting single room
    public void deleteBuilding(Building bldg) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_BLDG, KEY_ID + " = ?",
                new String[] { String.valueOf(bldg.getbldgName()) });
        db.close();
    }
 
    // Getting room count
    public int getBuildingCount() {
        String countQuery = "SELECT  * FROM " + TABLE_BLDG;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();
 
        // return count
        return cursor.getCount();
    }
}