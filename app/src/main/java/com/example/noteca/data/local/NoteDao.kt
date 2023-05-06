package com.example.noteca.data.local

import androidx.room.*
import com.example.noteca.data.models.NoteEntity

@Dao
interface NoteDao {

    @Delete
    fun delete(noteEntity: NoteEntity)

    @Insert
    fun create(noteEntity: NoteEntity)

    @Update
    fun update(noteEntity: NoteEntity)

    @Query("SELECT * FROM note_entity")
    fun getAllNote(): List<NoteEntity>
}