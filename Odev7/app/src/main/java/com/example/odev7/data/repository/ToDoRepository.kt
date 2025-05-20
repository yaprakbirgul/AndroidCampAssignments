package com.example.odev7.data.repository

import com.example.odev7.data.db.ToDoDao
import com.example.odev7.data.model.ToDo

class ToDoRepository(private val toDoDao: ToDoDao) {
    val allToDos = toDoDao.getAllToDos()

    suspend fun insertToDo(toDo: ToDo) {
        toDoDao.insertToDo(toDo)
    }

    suspend fun deleteToDo(toDo: ToDo) {
        toDoDao.deleteToDo(toDo)
    }
}
