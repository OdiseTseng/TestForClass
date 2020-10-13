package com.example.testmainactivity.db.local;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DcardDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(List<DcardEntity> dcardList);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(DcardEntity dcardEntity);

    @Query("select * from dcard limit 100")
    List<DcardEntity> getAll();

//    @Query("select * from dcard where star > :starLevel limit 100")
//    List<DcardEntity> getHigher(String starLevel);
}
