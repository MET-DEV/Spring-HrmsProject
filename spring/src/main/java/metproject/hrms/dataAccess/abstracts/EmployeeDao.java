package metproject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import metproject.hrms.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee,Integer>{
	
	Employee getByEmail(String email);
	Employee getById(int id);
	
}
