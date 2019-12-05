package sg.edu.nus.demo;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository  extends CrudRepository<Employee, Integer>{
	
	ArrayList<Employee> findByName();
	ArrayList<Employee> findBySalary(Double salary);
	ArrayList<Employee> findByDepartment();
}
