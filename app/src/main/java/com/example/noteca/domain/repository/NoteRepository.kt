package com.example.noteca.domain.repository

import com.example.noteca.domain.models.Note

interface NoteRepository {

    fun getAllNotes(): List<Note>
    fun deleteNote(note: Note)
    fun createNote(note: Note)
    fun updateNote(note: Note)
}