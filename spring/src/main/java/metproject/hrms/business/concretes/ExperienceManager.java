package metproject.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import metproject.hrms.business.abstracts.EmployeeService;
import metproject.hrms.business.abstracts.ExperienceService;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.core.utilities.result.SuccessResult;
import metproject.hrms.dataAccess.abstracts.ExperienceDao;
import metproject.hrms.entities.concretes.Experience;

@Service
public class ExperienceManager implements ExperienceService {
	private ExperienceDao experienceDao;
	private EmployeeService employeeService;
	
	
	@Autowired
	public ExperienceManager(ExperienceDao experienceDao,EmployeeService employeeService) {
		super();
		this.experienceDao = experienceDao;
		this.employeeService=employeeService;
	}



	@Override
	public Result add(Experience experience,int employeeId) {
		experience.setEmployee(employeeService.getById(employeeId).getData());
		experienceDao.save(experience);
		return new SuccessResult();
	}

}
