package sms.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepo;
	@Autowired
	private StudentGradeRepository studentGardeRepo;
	
	public List<Student> listStudent(){
		return (List<Student>)studentRepo.findAll();
	}

	public Student getStudentName(int id) {
		return studentRepo.findById(id).get();
		
	}
	
	public StudentGrade  getStudentName(Student student) {
		return studentGardeRepo.findByStudent(student);
		
	}
	//@Autowired
	//private StudentGradeRepository gradeRepo;
	
	@Autowired CourseRepository courseRepo;
	public ArrayList<Course> listcourse(){
		return (ArrayList<Course>) courseRepo.findAll();
	}

//	public long queryStudentGrades(int courseID, String Course, int units, String grade) {
//		String query = "SELECT sg.id , sg.course,sg.grade, c.courseName, c.courseUnit" + "From StudentGrade sg and "
//	}

}
