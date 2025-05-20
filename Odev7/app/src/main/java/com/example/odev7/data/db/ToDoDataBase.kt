package com.example.odev7.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.odev7.data.model.ToDo

@Database(entities = [ToDo::class], version = 1)
abstract class ToDoDataBase : RoomDatabase() {
    abstract fun toDoDao(): ToDoDao
}
