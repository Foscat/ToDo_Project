package com.wolfpack.ToDoList.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TodoList {
	
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String author;
    private String body;
    
    private boolean compleated;

    public TodoList(){

    }

    public TodoList(String title, String author, String body, boolean compleated){
        this.title = title;
        this.author = author;
		this.body = body;
		this.compleated = compleated;
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
	

	public boolean isCompleated() {
		return compleated;
	}

	public void setCompleated(boolean compleated) {
		this.compleated = compleated;
	}

	@Override
	public String toString() {
		return "TodoList [id=" + id + ", title=" + title + ", author=" + author + ", body=" + body + "]";
	}

}
