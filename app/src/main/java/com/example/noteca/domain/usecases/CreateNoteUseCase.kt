package com.example.noteca.domain.usecases

import com.example.noteca.domain.models.Note
import com.example.noteca.domain.repository.NoteRepository

class CreateNoteUseCase(private val  noteRepository: NoteRepository) {
    fun createNote(note: Note) = noteRepository.createNote(note)
}