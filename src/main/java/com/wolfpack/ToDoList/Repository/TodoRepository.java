package com.wolfpack.ToDoList.Repository;

import org.springframework.data.repository.CrudRepository;

import com.wolfpack.ToDoList.Model.TodoList;

public interface TodoRepository extends CrudRepository<TodoList, Long>{

}
