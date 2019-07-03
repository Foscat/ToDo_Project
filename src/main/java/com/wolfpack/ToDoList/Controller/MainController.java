package com.wolfpack.ToDoList.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.wolfpack.ToDoList.Model.TodoList;
import com.wolfpack.ToDoList.Repository.TodoRepository;

@Controller
public class MainController {
	
	@Autowired
	public TodoRepository todoRepository;
	
//	@Autowired
//	public TodoList todoList;
	
	@GetMapping("/")
	public String getIndexpage(Model model) {
		// Comment line out to make 'mvcTest()' pass for jUnit
		Iterable<TodoList> myList = todoRepository.findAll();
		model.addAttribute("todoList", myList);
		return"index";
	}

	@GetMapping("/make")
	public String getMakeTodoPage(Model model) {
		TodoList todoList = new TodoList();
		model.addAttribute("todoList", todoList);
		return"makeTodo";
	}

	@PostMapping("/makeTodo")
    public String makeTask(TodoList todoList, Model model){
        todoRepository.save(todoList);
        model.addAttribute("Title",todoList.getTitle());
        model.addAttribute("Author",todoList.getAuthor());
        model.addAttribute("Body", todoList.getBody());
        return "changes";
	}
	
	@DeleteMapping("/{id}")
    public String deleteTaskById(@PathVariable Long id, TodoList todoList){
        todoRepository.deleteById(id);
        return "changes";
	}
	
	@GetMapping("/edit/info/{id}")
    public String editForm(@PathVariable Long id, Model model){
       TodoList todoList = todoRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid id: "+ id));
        model.addAttribute("todoList", todoList);
        return "editTodo";
	}
	
	@PutMapping("/edit/info/{id}")
    public String editTask(@PathVariable Long id, TodoList todoList, Model model) {
        TodoList editedTodoList = todoRepository.findById(id).orElse(null);

        editedTodoList.setTitle(todoList.getTitle());
        editedTodoList.setAuthor(todoList.getAuthor());
        editedTodoList.setBody(todoList.getBody());

        todoRepository.save(editedTodoList);

        model.addAttribute("Title", editedTodoList.getTitle());
        model.addAttribute("taskBody", editedTodoList.getAuthor());
        model.addAttribute("Title", editedTodoList.getBody());


        return "changes";
	}
	
	@PutMapping("/edit/compleate/{id}")
	public String editDone(@PathVariable Long id, Model model){	

		TodoList editedTodoList = todoRepository.findById(id).orElse(null);

		System.out.println("Before: " + editedTodoList.isCompleated());

		if(editedTodoList.isCompleated()){
			System.out.println("it was true");
			editedTodoList.setCompleated(false);
		}
		else{
			System.out.println("it was false");
			editedTodoList.setCompleated(true);
		}

		todoRepository.save(editedTodoList);
		
		System.out.println("After: " + editedTodoList.isCompleated());
		model.addAttribute("compleated", editedTodoList.isCompleated());

		return "changes";
	}
}

