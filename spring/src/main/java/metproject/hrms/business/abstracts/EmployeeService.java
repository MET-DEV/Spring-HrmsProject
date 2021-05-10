package metproject.hrms.business.abstracts;

import java.util.List;

import metproject.hrms.entities.concretes.Employee;

public interface EmployeeService {
	List<Employee> getAll();
}
