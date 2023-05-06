package com.example.noteca.data.local

import androidx.room.Database
import com.example.noteca.data.models.NoteEntity

@Database(entities = [NoteEntity::class], version = 1)
abstract class AppDatabase {
    abstract fun noteDao(): NoteDao
}