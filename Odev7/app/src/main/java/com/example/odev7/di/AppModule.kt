package com.example.odev7.di

import android.content.Context
import androidx.room.Room
import com.example.odev7.data.db.ToDoDataBase
import com.example.odev7.data.repository.ToDoRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideToDoDatabase(@ApplicationContext context: Context): ToDoDataBase {
        return Room.databaseBuilder(
            context,
            ToDoDataBase::class.java,
            "todo_db"
        ).build()
    }

    @Singleton
    @Provides
    fun provideToDoRepository(db: ToDoDataBase): ToDoRepository {
        return ToDoRepository(db.toDoDao())
    }
}
