package com.example.noteca.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.noteca.data.models.NoteEntity

@Database(entities = [NoteEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun noteDao(): NoteDao
}