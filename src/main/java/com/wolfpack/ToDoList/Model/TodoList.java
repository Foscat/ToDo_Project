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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "TodoList [id=" + id + ", title=" + title + ", author=" + author + ", body=" + body + "]";
	}

}
