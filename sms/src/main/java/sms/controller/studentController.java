package sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sms.model.StudentGradeRepository;
import sms.model.StudentRepository;

@Controller
@RequestMapping("/students")
public class studentController {
	@Autowired
	private StudentRepository studentRepo;
	
@Autowired
	private StudentGradeRepository studentGradeRepo;
	
	@GetMapping("/grades")
	public String grades () {
		return "grades";
		
	}
	@GetMapping("/availableCourses")
	public String availableCourses () {
		return "availableCourses";
		
	}
	@GetMapping("/enrolledCourses")
	public String enrolledCourses () {
		return "enrolledCourses";
		
	}
	
		

}
