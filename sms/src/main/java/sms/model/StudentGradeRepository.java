package sms.model;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentGradeRepository extends JpaRepository <StudentGrade, Integer> {

	ArrayList<Student> findByStudent(Student student);

}

