package metproject.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import metproject.hrms.business.abstracts.EducationService;
import metproject.hrms.business.abstracts.EmployeeService;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.core.utilities.result.SuccessResult;
import metproject.hrms.dataAccess.abstracts.EducationDao;
import metproject.hrms.entities.concretes.Education;

@Service
public class EducationManager implements EducationService{
	
	private EducationDao educationDao;
	private EmployeeService employeeService;
	
	@Autowired
	public EducationManager(EducationDao educationDao,EmployeeService employeeService) {
		super();
		this.educationDao = educationDao;
		this.employeeService=employeeService;
	}

	@Override
	public Result add(Education education,int employeeId) {
		education.setEmployee(employeeService.getById(employeeId).getData());
		educationDao.save(education);
		return new SuccessResult();
	}

	@Override
	public Result delete(Education education) {
		educationDao.delete(education);
		return new SuccessResult();
	}

}
