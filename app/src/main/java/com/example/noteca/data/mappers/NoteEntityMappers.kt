package com.example.noteca.data.mappers

import com.example.noteca.data.models.NoteEntity
import com.example.noteca.domain.models.Note

fun Note.toNoteEntity(): NoteEntity {
    return NoteEntity(
        id, title, description, createdAt
    )
}

fun NoteEntity.toNote(): Note {
    return Note(
        id, title, description, createdAt
    )
}