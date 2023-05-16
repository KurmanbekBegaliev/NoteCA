package com.example.noteca.domain.usecases

import com.example.noteca.domain.repository.NoteRepository
import javax.inject.Inject

class GetAllNotesUseCase @Inject constructor(private val noteRepository: NoteRepository) {
    fun getAllNotes() = noteRepository.getAllNotes()

}