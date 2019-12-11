package sms.controller;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sms.model.Course;
import sms.model.Student;
import sms.model.StudentGrade;
import sms.model.StudentService;

@Controller
@RequestMapping("/students")
public class studentController {
	
	
	@Autowired
	private StudentService studentService ;
	
	@GetMapping("/grades")
	public String grades(Model model) {
	Student student	=studentService.getStudentName(1);//SESSION ID
	ArrayList<StudentGrade> sg = studentService.getStudentName(student);
	//System.out.println(sg.getStudent().getStudentName());
		model.addAttribute("studentgrade", sg);
		model.addAttribute("student", student);
		return "grades";

	}

	@GetMapping("/availableCourses")
	public String availableCourses(Model model) {
		ArrayList<Course> availableCourse = studentService.listcourse();
		model.addAttribute("course", availableCourse);
		return "availableCourses";

	}

	@GetMapping("/enrolledCourses")
	public String enrolledCourses() {
		return "enrolledCourses";

	}

}
