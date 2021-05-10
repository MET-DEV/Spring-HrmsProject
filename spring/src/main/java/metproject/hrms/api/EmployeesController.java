package metproject.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import metproject.hrms.business.abstracts.EmployeeService;
import metproject.hrms.entities.concretes.Employee;

@RestController
@RequestMapping("/api/employeess")
public class EmployeesController {
	private EmployeeService employeeService;
	//deneme123
	@Autowired
	public EmployeesController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	@GetMapping("/getall")
	public List<Employee> getAll(){
		return this.employeeService.getAll();
	}
}
