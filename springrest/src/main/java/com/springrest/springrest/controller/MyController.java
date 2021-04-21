package com.springrest.springrest.controller;



import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.services.CourseService;
import com.springrest.springrest.entities.Courses;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
@RestController
//main controller 
public class MyController {
	
	//loose coupling //dependecy injection
	@Autowired  
	//object of interface
	private CourseService obj;
	
	
	//getter method when home is called
	@GetMapping("/home")
	public String home()
	{
		
		return " this is Home page";
	}
	
	
	//get courses
	@GetMapping("/courses")
	public List<Courses>getCourses() 
	{
		//call the service layer 
		return this.obj.getCourses();
		
	}

	@GetMapping("/courses/{id}")
	public Courses getCourse(@PathVariable String  id)
	{
		
		return this.obj.getCourse(Long.parseLong(id));
	}
	
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses course)
	{
		return this.obj.addCourse(course);
		
	}
	
	//update the course using PUT request
	@PutMapping("/courses")
	public Courses updateCourse(@RequestBody Courses course)
	{
		return this.obj.updateCourse(course);
	}
	
	//delete the course based on id
	//whenever we send a string in delete request it may generate error becuase it is not converting to long format
	@DeleteMapping("/courses/{id}")
	public ResponseEntity<HttpStatus>deleteCourse(@PathVariable String id)
	{
		try
		{
			this.obj.deleteCourse(Long.parseLong(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	
	

}
