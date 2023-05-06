package com.example.noteca.domain.usecases

import com.example.noteca.domain.models.Note
import com.example.noteca.domain.repository.NoteRepository

class DeleteNoteUseCase(private val noteRepository: NoteRepository) {
    fun deleteNote(note: Note) = noteRepository.deleteNote(note)
}