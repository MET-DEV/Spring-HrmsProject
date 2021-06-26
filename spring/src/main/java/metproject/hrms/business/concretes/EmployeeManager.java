package metproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import metproject.hrms.business.abstracts.EmployeeService;
import metproject.hrms.core.utilities.business.BusinessRules;
import metproject.hrms.core.utilities.result.DataResult;
import metproject.hrms.core.utilities.result.ErrorResult;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.core.utilities.result.SuccessDataResult;
import metproject.hrms.core.utilities.result.SuccessResult;
import metproject.hrms.dataAccess.abstracts.EmployeeDao;
import metproject.hrms.entities.concretes.Employee;


@Service
public class EmployeeManager implements EmployeeService{
	private EmployeeDao employeeDao;
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		
		return new SuccessDataResult<List<Employee>>(employeeDao.findAll(),"İş arayanlar listelendi");
	}

	@Override
	public Result add(Employee employee) {
		boolean control=checkAlreadyExist(employee);
		if (control) {
			boolean result=BusinessRules.employeeCheckService(employee);
			if (result) {
				employeeDao.save(employee);
				return new SuccessResult("İş arayan kişi eklendi");
			}
		}
		return new ErrorResult("Ekleme başarısız");
		
	}
	
	
	private boolean checkAlreadyExist(Employee employee) {
		List<Employee> result=employeeDao.findAll();
		for (Employee employee2 : result) {
			if(employee2.getEmail().equals(employee.getEmail())) {
				return false;
			}
			if(employee2.getNationaltyId().equals(employee.getNationaltyId())) {
				return false;
			}
		}
		return true;
	}

	@Override
	public DataResult<Employee> emailFilter(String email) {
	
		return new SuccessDataResult<Employee>(employeeDao.getByEmail(email)) ;
	}
	
}