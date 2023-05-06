package com.example.noteca.domain.usecases

import com.example.noteca.domain.repository.NoteRepository

class GetAllNotesUseCase(private val noteRepository: NoteRepository) {
    fun getAllNotes() = noteRepository.getAllNotes()

}