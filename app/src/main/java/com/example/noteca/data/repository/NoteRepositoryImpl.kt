package com.example.noteca.data.repository

import com.example.noteca.data.local.NoteDao
import com.example.noteca.data.mappers.toNote
import com.example.noteca.data.mappers.toNoteEntity
import com.example.noteca.domain.models.Note
import com.example.noteca.domain.repository.NoteRepository
import com.example.noteca.domain.utils.ResultStatus
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.io.IOException
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(private val noteDao: NoteDao) : NoteRepository {
    override fun getAllNotes() = flow {
        emit(ResultStatus.Loading())
        try {
            val data = noteDao.getAllNote().map { it.toNote() }
            emit(ResultStatus.Success(data))
        }catch (e: IOException) {
            emit(ResultStatus.Error(e.localizedMessage ?: "Unknown error"))
        }
    }.flowOn(Dispatchers.IO)

    override fun deleteNote(note: Note) = flow {
        emit(ResultStatus.Loading())
        try {
            val data = noteDao.delete(note.toNoteEntity())
            emit(ResultStatus.Success(data))
        }catch (e: IOException) {
            emit(ResultStatus.Error(e.localizedMessage ?: "Unknown error"))
        }

    }.flowOn(Dispatchers.IO)

    override fun createNote(note: Note) = flow {
        emit(ResultStatus.Loading())
        try {
            val data = noteDao.create(note.toNoteEntity())
            emit(ResultStatus.Success(data))
        }catch (e: IOException) {
            emit(ResultStatus.Error(e.localizedMessage ?: "Unknown error"))
        }

    }.flowOn(Dispatchers.IO)

    override fun updateNote(note: Note) = flow {
        emit(ResultStatus.Loading())
        try {
            val data = noteDao.update(note.toNoteEntity())
            emit(ResultStatus.Success(data))
        }catch (e: IOException) {
            emit(ResultStatus.Error(e.localizedMessage ?: "Unknown error"))
        }

    }.flowOn(Dispatchers.IO)
}