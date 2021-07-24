package metproject.hrms.business.abstracts;


import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.entities.concretes.Language;

public interface LanguageService {
	Result add(Language language,int employeeId);
	Result delete(Language language);
}
