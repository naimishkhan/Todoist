package com.example.todoist;

//add database entities

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {MainData.class},version = 1,exportSchema = false)

public abstract class RoomDB extends RoomDatabase {
    //create Database instance

    private static RoomDB database;

    //define db name

    public  synchronized static RoomDB getInstance(Context context){
        if(database ==null){
            //when db is null
            //initialize dab
            String DATABASE_NAME = "database";
            database = Room.databaseBuilder(context.getApplicationContext(),RoomDB.class, DATABASE_NAME)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }

        //return db
        return database;
    }

    //create Dao

    public abstract MainDao mainDao();

}
