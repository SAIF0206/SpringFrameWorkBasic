package sms.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepo;
	
	public List<Student> listStudent(){
		return (List<Student>)studentRepo.findAll();
	}

	public Student getStudentName(int id) {
		return studentRepo.findById(id).get();
		
	}
	
//	@Autowired
//	private StudentGradeRepository gradeRepo;
	
	@Autowired CourseRepository courseRepo;
	public ArrayList<Course> listcourse(){
		return (ArrayList<Course>) courseRepo.findAll();
	}

	

}
