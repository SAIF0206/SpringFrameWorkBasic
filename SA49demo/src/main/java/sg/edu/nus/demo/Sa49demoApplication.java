package sg.edu.nus.demo;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Sa49demoApplication {
	private static final Logger log = LoggerFactory.getLogger(Sa49demoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Sa49demoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(EmployeeRepository repository) {
		return (args) -> {
			log.info("hello");
			// List<Employee> elist = (ArrayList<Employee>)repository.findAll();

			for (Employee currentEmployee : repository.findAll()) {
				log.info(currentEmployee.toString());
			}
			log.info("Update Record");
			repository.save(new Employee(4, "kai", 15000.0, "ISS"));
			for (Employee currentEmployee : repository.findAll()) {
				log.info(currentEmployee.toString());
			}
			
			log.info("Find by Attributes");
			for (Employee ce : repository.findBySalary(1000.0))
			{
			log.info("Finder"+ce.toString());	
			}
		};
		

	}
}
