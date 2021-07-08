package metproject.hrms.business.abstracts;

import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.entities.concretes.Education;

public interface EducationService {
	Result add(Education education, int employeeId);
	

}
