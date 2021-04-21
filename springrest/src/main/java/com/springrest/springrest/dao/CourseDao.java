package com.springrest.springrest.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Courses;


        

//specify identity which we have to perform
//long is the primary key 
public interface CourseDao extends JpaRepository<Courses,Long>
{
	
	

}
