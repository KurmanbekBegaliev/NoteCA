package com.example.noteca.di

import android.content.Context
import androidx.room.Room
import com.example.noteca.data.local.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LocalModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context) : AppDatabase = Room.databaseBuilder(
        context,
        AppDatabase::class.java,
        "note_db"
    ).build()

    @Provides
    fun provideNoteDao(appDatabase: AppDatabase) = appDatabase.noteDao()
}
