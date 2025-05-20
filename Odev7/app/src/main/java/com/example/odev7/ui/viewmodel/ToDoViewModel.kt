package com.example.odev7.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.odev7.data.model.ToDo
import com.example.odev7.data.repository.ToDoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ToDoViewModel @Inject constructor(
    private val repository: ToDoRepository
) : ViewModel() {
    val allToDos = repository.allToDos

    fun insertToDo(toDo: ToDo) = viewModelScope.launch {
        repository.insertToDo(toDo)
    }

    fun deleteToDo(toDo: ToDo) = viewModelScope.launch {
        repository.deleteToDo(toDo)
    }
}
