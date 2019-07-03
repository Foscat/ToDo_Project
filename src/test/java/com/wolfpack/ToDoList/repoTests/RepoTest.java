package com.wolfpack.ToDoList.repoTests;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import com.wolfpack.ToDoList.Model.TodoList;
import com.wolfpack.ToDoList.Repository.TodoRepository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class RepoTest {

    @Autowired
    TodoRepository todoRepository;

    @Test
    public void findById() {

        TodoList todoList = new TodoList();
        todoList.setId(1L);

        Optional<TodoList> thisTodoList = todoRepository.findById(1L);

        assertEquals("1", todoRepository.findById(todoList.getId()));
        
    }

}