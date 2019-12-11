package sms.model;



import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentGradeRepository extends JpaRepository <StudentGrade, Integer> {

	public StudentGrade findByStudent(Student student);

}

