package com.akaiyukiusagi.pagedlistsample.Room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sampleTable")
class SampleEntity (
    @PrimaryKey(autoGenerate = true) var id: Int,
    @ColumnInfo(name = "text") val text: String
)