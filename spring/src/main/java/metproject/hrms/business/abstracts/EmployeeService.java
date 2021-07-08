package metproject.hrms.business.abstracts;

import java.util.List;

import metproject.hrms.core.utilities.result.DataResult;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.entities.concretes.Employee;


public interface EmployeeService {
	DataResult<List<Employee>> getAll();
	Result add(Employee employee);
	DataResult<Employee> emailFilter(String email);
	DataResult<Employee> getById(int id);
}
