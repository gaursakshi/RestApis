package com.springrest.springrest.services;
import java.util.*;

import com.springrest.springrest.entities.Courses;

public interface CourseService {
	

	public List<Courses> getCourses();
	public Courses getCourse(long id);
	public Courses addCourse(Courses course);
	public Courses updateCourse(Courses course);
	public void deleteCourse(long parseLong);

}
