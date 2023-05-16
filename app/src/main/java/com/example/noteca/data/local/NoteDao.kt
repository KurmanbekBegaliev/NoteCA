package com.example.noteca.data.local

import androidx.room.*
import com.example.noteca.data.models.NoteEntity

@Dao
interface NoteDao {

    @Delete
    suspend fun delete(noteEntity: NoteEntity)

    @Insert
    suspend fun create(noteEntity: NoteEntity)

    @Update
    suspend fun update(noteEntity: NoteEntity)

    @Query("SELECT * FROM note_entity")
    suspend fun getAllNote(): List<NoteEntity>
}