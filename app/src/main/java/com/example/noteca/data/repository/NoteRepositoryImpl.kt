package com.example.noteca.data.repository

import com.example.noteca.data.local.NoteDao
import com.example.noteca.data.mappers.toNote
import com.example.noteca.data.mappers.toNoteEntity
import com.example.noteca.domain.models.Note
import com.example.noteca.domain.repository.NoteRepository

class NoteRepositoryImpl(private val noteDao: NoteDao) : NoteRepository {
    override fun getAllNotes(): List<Note> {
        return noteDao.getAllNote().map { it.toNote() }
    }

    override fun deleteNote(note: Note) {
        noteDao.delete(note.toNoteEntity())
    }

    override fun createNote(note: Note) {
        noteDao.create(note.toNoteEntity())
    }

    override fun updateNote(note: Note) {
        noteDao.update(note.toNoteEntity())
    }
}