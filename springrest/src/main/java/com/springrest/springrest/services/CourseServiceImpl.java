package com.springrest.springrest.services;
import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Courses;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {
	
	//depency inject //making object of the interface
	@Autowired
	private CourseDao courseDao;
	
	//List<Courses>list;
	public CourseServiceImpl()
	{
//		list=new ArrayList<>();
//		//adding item in arraylist
//		list.add(new Courses(145,"ignited minds","APJ book"));
//
//		list.add(new Courses(147,"one night in call centre","Chetan bhagat"));
//		list.add(new Courses(149,"half gf","Chetan bhagat"));
	}

	
	public List<Courses>getCourses()
	{
		//return list;
		return courseDao.findAll();
		
		//this was for the previous list
		//return list;
	}
	
	
	public Courses getCourse(long id)
	{
	//Courses ans=null;
//		for(Courses c:list)
//		{
//			if(c.getId()==id)
//			{
//				ans=c;
//				break;
//			}
//		}
	//	return ans;
	
	
	
		
		return courseDao.getOne(id);
	}
	
	public Courses addCourse(Courses course)
	{
//		list.add(course);
	//	return course;
		
		courseDao.save(course);
		return course;
	}
	
	public Courses updateCourse(Courses course)
	{
		//searching in the list for which course to update
//		list.forEach(e->{
//			if(e.getId()==course.getId())
//			{
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		//return course;
		
		courseDao.save(course);
		return course;
		
	}
	
	public void deleteCourse(long parseLong)
	{
//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
		//finding the entity 
		Courses one=courseDao.getOne(parseLong);
		courseDao.delete(one);
	}


	
	
	
	
	

}
