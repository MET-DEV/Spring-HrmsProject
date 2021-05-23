package metproject.hrms.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import metproject.hrms.business.abstracts.EmployerService;
import metproject.hrms.core.utilities.business.BusinessRules;
import metproject.hrms.core.utilities.result.DataResult;
import metproject.hrms.core.utilities.result.ErrorResult;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.core.utilities.result.SuccessDataResult;
import metproject.hrms.core.utilities.result.SuccessResult;
import metproject.hrms.dataAccess.abstracts.EmployerDao;
import metproject.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	private EmployerDao employerDao;
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}
	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(employerDao.findAll(),"Firmalar listelendi");
	}
	@Override
	public Result add(Employer employer) {
		var result=BusinessRules.isEmptyEmployer(employer);
		if(result.isSuccess()) {
			if (checkAlreadyUser(employer)) {
				return new SuccessResult("Ekleme başarılı");
			}
		}
		return new ErrorResult("Ekleme başarısız.");
	}
	
	private boolean checkAlreadyUser(Employer employer) {
		var employerList=employerDao.findAll();
		
		for (Employer currentlyEmployer : employerList) {
			if (employer.getEmail().equals(currentlyEmployer.getEmail())) {
				return false;
			}
		}
		return true;
	}

}
