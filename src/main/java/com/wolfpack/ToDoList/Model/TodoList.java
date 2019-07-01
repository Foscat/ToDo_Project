package com.wolfpack.ToDoList.Model;

import javax.persistence.Entity;

@Entity
public class TodoList {

    private Long id;
    private String title;
    private String author;
    private String body;

    public TodoList(){

    }

    public TodoList(String title, String author, String body){
        this.title = title;
        this.author = author;
        this.body = body;
    }

}
