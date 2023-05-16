package com.example.noteca.di

import com.example.noteca.data.repository.NoteRepositoryImpl
import com.example.noteca.domain.repository.NoteRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun NoteRepository(noteRepositoryImpl: NoteRepositoryImpl) : NoteRepository
}