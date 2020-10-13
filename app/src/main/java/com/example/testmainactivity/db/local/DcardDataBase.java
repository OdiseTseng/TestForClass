package com.example.testmainactivity.db.local;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {DcardEntity.class},
        version = 1, exportSchema = false)
public abstract class DcardDataBase extends RoomDatabase {
    private static final String DB_NAME = "dcard.db";
    private static volatile DcardDataBase instance;

    public static synchronized DcardDataBase getInstance(Context context) {
        if (instance == null) {
            instance = create(context);
        }

        return instance;
    }

    private static DcardDataBase create(final Context context) {
        return Room.databaseBuilder(
                context,
                DcardDataBase.class,
                DB_NAME)
                .build();
    }

    public abstract DcardDao getDcardDao();

}
