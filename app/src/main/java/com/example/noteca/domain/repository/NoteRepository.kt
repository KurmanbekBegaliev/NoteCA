package com.example.noteca.domain.repository

import com.example.noteca.domain.utils.ResultStatus
import com.example.noteca.domain.models.Note
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    fun getAllNotes(): Flow<ResultStatus<List<Note>>>
    fun deleteNote(note: Note): Flow<ResultStatus<Unit>>
    fun createNote(note: Note): Flow<ResultStatus<Unit>>
    fun updateNote(note: Note): Flow<ResultStatus<Unit>>
}