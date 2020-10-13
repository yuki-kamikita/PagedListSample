package com.akaiyukiusagi.pagedlistsample.Room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [SampleEntity::class], version = 1)
abstract class SampleDatabase : RoomDatabase() {
    abstract fun sampleDao(): SampleDao

    companion object {
        private var instance: SampleDatabase? = null
        @Synchronized
        fun getDatabase(context: Context): SampleDatabase {

            val db = Room.databaseBuilder(
                context.applicationContext,
                SampleDatabase::class.java,
                "sample-database"
            ).build()
            return instance!!
        }
    }

}