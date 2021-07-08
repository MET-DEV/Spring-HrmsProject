package metproject.hrms.business.abstracts;

import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.entities.concretes.CvHeader;

public interface CvHeaderService {
	Result add(CvHeader cvHeader,int employeeId);
}
