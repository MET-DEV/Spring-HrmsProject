package metproject.hrms.business.abstracts;

import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.entities.concretes.Experience;

public interface ExperienceService {
	Result add(Experience experience,int employeeId);
	Result delete(Experience experience);
}
