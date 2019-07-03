package com.wolfpack.ToDoList.repoTests;

import static org.junit.Assert.assertNotNull;


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
    public void entry() {

        TodoList todoList = new TodoList();
        todoList.setTitle("title");
        todoList.setAuthor("Author");
        todoList.setBody("Body");
        todoRepository.save(todoList);

        assertNotNull(todoRepository.findAll());
        
    }

    @Test
    public void entryById() {

        TodoList todoList = new TodoList();
        todoList.setId(1L);
        todoList.setTitle("title");
        todoList.setAuthor("Author");
        todoList.setBody("Body");
        todoRepository.save(todoList);

        assertNotNull(todoRepository.findById(1L));
        
    }
}