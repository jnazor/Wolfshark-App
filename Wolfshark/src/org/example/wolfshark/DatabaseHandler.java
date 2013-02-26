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
    private static final String DATABASE_ROOM = "favoritesManager";
 
    // Favorites table name
    private static final String TABLE_FAVORITES = "favorites";
 
    // Favorites Table Columns names
    private static final String KEY_ID = "id";
    private static final String KEY_ROOM = "room";
    private static final String KEY_BUILD = "building";
 
    public DatabaseHandler(Context context) {
        super(context, DATABASE_ROOM, null, DATABASE_VERSION);
    }
 
    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_FAVORITES_TABLE = "CREATE TABLE " + TABLE_FAVORITES + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_ROOM + " TEXT,"
                + KEY_BUILD + " TEXT" + ")";
        db.execSQL(CREATE_FAVORITES_TABLE);
    }
 
    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_FAVORITES);
 
        // Create tables again
        onCreate(db);
    }
 
    /**
     * All CRUD(Create, Read, Update, Delete) Operations
     */
 
    // Adding new favorite
    void addFavorite(Favorite favorite) {
        SQLiteDatabase db = this.getWritableDatabase();
 
        ContentValues values = new ContentValues();
        values.put(KEY_ROOM, favorite.getRoom()); // Favorite Room
        values.put(KEY_BUILD, favorite.getBuilding()); // Favorite Building
 
        // Inserting Row
        db.insert(TABLE_FAVORITES, null, values);
        db.close(); // Closing database connection
    }
 
    // Getting single favorite
    Favorite getFavorite(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
 
        Cursor cursor = db.query(TABLE_FAVORITES, new String[] { KEY_ID,
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
        String selectQuery = "SELECT  * FROM " + TABLE_FAVORITES;
 
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
        return db.update(TABLE_FAVORITES, values, KEY_ID + " = ?",
                new String[] { String.valueOf(favorite.getID()) });
    }
 
    // Deleting single favorite
    public void deleteFavorite(Favorite favorite) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_FAVORITES, KEY_ID + " = ?",
                new String[] { String.valueOf(favorite.getID()) });
        db.close();
    }
 
    // Getting favorites Count
    public int getFavoritesCount() {
        String countQuery = "SELECT  * FROM " + TABLE_FAVORITES;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();
 
        // return count
        return cursor.getCount();
    }
}