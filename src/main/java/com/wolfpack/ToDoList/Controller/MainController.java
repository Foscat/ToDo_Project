package com.wolfpack.ToDoList.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.wolfpack.ToDoList.Repository.TodoRepository;

@Controller
public class MainController {
	
	@Autowired
	public TodoRepository todoRepository;
	
	@GetMapping("/")
	public String getIndexpage() {
		return"index";
	}
	@GetMapping("/")
	public String getMakeTodoPage() {
		return"makeTodo";
	}

	// @PutMapping("/new")
}
