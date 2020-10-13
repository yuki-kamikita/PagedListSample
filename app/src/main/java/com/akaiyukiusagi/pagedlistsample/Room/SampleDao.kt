package com.akaiyukiusagi.pagedlistsample.Room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface SampleDao {
    @Query("SELECT * from sampleTable")
    fun getAll(): LiveData<List<SampleEntity>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(vararg animals: SampleEntity)
}