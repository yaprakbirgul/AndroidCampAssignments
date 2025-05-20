package com.example.odev7.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.odev7.data.model.ToDo

@Dao
interface ToDoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertToDo(toDo: ToDo)

    @Delete
    suspend fun deleteToDo(toDo: ToDo)

    @Query("SELECT * FROM todo_table ORDER BY id DESC")
    fun getAllToDos(): LiveData<List<ToDo>>
}
