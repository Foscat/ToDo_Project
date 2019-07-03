package com.wolfpack.ToDoList.controllerTests;

import com.wolfpack.ToDoList.Controller.MainController;
import com.wolfpack.ToDoList.Model.TodoList;
import com.wolfpack.ToDoList.Repository.TodoRepository;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

public class ControllerTest {

	@Mock
    Model model;
    
    MockMvc mockMvc;

	@Mock
	TodoRepository todoRepo;
	
	MainController mainController;

	@Before
	public void setUp() throws Exception {

		MockitoAnnotations.initMocks(this);

		mainController = new MainController();
		
	}


	@Test
	public void testMvc() throws Exception {
        

        MockMvc mockMvc =  MockMvcBuilders.standaloneSetup(mainController).build();
        
		mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(view().name("index"));
		
	}
    
    @Test
	public void testMvc2() throws Exception {
        

		MockMvc mockMvc =  MockMvcBuilders.standaloneSetup(mainController).build();

		mockMvc.perform(get("/make")).andExpect(status().isOk()).andExpect(view().name("makeTodo"));
		
	}

}
