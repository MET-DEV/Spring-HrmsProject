package metproject.hrms.business.abstracts;

import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.entities.concretes.Technology;

public interface TechnologyService {
	Result add(Technology technology,int employeeId);
}
