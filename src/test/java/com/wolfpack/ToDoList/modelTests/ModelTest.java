package com.wolfpack.ToDoList.modelTests;

import static org.junit.Assert.assertEquals;

import com.wolfpack.ToDoList.Model.TodoList;
import org.junit.Before;
import org.junit.Test;

public class ModelTest {

    TodoList todoList;


    @Before
    public void setUp(){
        todoList = new TodoList();
    }
    
    @Test
    public void getId() throws Exception {
        Long idValue = 4L;

        todoList.setId(idValue);

        assertEquals(idValue, todoList.getId());

    }
    
    @Test
    public void getAuthor() throws Exception {

        String authorValue = "Hey buddy";

         todoList.setAuthor(authorValue);

        assertEquals(authorValue, todoList.getAuthor());
    }

    @Test
    public void getTitle() throws Exception {

        String titleValue = "Hey buddy";

         todoList.setTitle(titleValue);

        assertEquals(titleValue, todoList.getTitle());
    }

    @Test
    public void getBody() throws Exception {

        String bodyValue = "Hey buddy";

         todoList.setBody(bodyValue);

        assertEquals(bodyValue, todoList.getBody());
    }

    @Test
    public void getCompleated() throws Exception {

        boolean compleatedValue = false;

         todoList.setCompleated(compleatedValue);

        assertEquals(compleatedValue, todoList.isCompleated());
    }

}
