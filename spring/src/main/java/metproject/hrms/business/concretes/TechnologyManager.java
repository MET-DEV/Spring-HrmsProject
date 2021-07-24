package metproject.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import metproject.hrms.business.abstracts.EmployeeService;
import metproject.hrms.business.abstracts.TechnologyService;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.core.utilities.result.SuccessResult;
import metproject.hrms.dataAccess.abstracts.TechnologyDao;
import metproject.hrms.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService{
	private TechnologyDao technologyDao;
	private EmployeeService employeeService;
	
	@Autowired
	public TechnologyManager(TechnologyDao technologyDao,EmployeeService employeeService) {
		super();
		this.technologyDao = technologyDao;
		this.employeeService=employeeService;
	}

	@Override
	public Result add(Technology technology,int employeeId) {
		technology.setEmployee(employeeService.getById(employeeId).getData());
		technologyDao.save(technology);
		return new SuccessResult();
	}

	@Override
	public Result delete(Technology technology) {
		technologyDao.delete(technology);
		return new SuccessResult();
	}
}	
