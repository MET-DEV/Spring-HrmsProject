package metproject.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import metproject.hrms.business.abstracts.EmployeeService;
import metproject.hrms.business.abstracts.LanguageService;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.core.utilities.result.SuccessResult;
import metproject.hrms.dataAccess.abstracts.LanguageDao;
import metproject.hrms.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService {
	private LanguageDao languageDao;
	private EmployeeService employeeService;
	
	@Autowired
	public LanguageManager(LanguageDao languageDao,EmployeeService employeeService) {
		super();
		this.languageDao = languageDao;
		this.employeeService=employeeService;
	}

	@Override
	public Result add(Language language,int employeeId) {
		language.setEmployee(employeeService.getById(employeeId).getData());
		languageDao.save(language);
		return new SuccessResult();
	}

}
