package com.Vinith.SpringBoot.LearnSpringBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	
	@RequestMapping("/Course")
    public List<Course> retrieveAllCourses()
    {
    	
    	return Arrays.asList(
    			
    			new Course(1,"Aws","vinith"),
    			new Course(2,"Azure","vinith"),
    			new Course(2,"Devops","vinith")
    			
    			);			
    }

}
