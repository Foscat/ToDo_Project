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
    public void findById() {

        TodoList todoList = new TodoList();
        todoList.setId(1L);
        todoRepository.save(todoList);

        assertNotNull(todoList.getId());
        
    }

    @Test
    public void title() {

        TodoList todoList = new TodoList();
        todoList.setTitle("title");
        todoRepository.save(todoList);

        assertNotNull(todoList.getTitle());
        
    }

    @Test
    public void author() {

        TodoList todoList = new TodoList();
        todoList.setAuthor("Author");
        todoRepository.save(todoList);

        assertNotNull(todoList.getAuthor());
        
    }

    @Test
    public void body() {

        TodoList todoList = new TodoList();
        todoList.setBody("Body");
        todoRepository.save(todoList);

        assertNotNull(todoList.getBody());
        
    }

    @Test
    public void entry() {

        TodoList todoList = new TodoList();
        todoList.setTitle("title");
        todoList.setAuthor("Author");
        todoList.setBody("Body");
        todoRepository.save(todoList);

        assertNotNull(todoRepository.findAll());
        
    }
}