package metproject.hrms.business.abstracts;

import java.util.List;

import metproject.hrms.core.utilities.result.DataResult;
import metproject.hrms.entities.concretes.JobAd;

public interface JobAdService {
	DataResult<List<JobAd>> getAll();
	DataResult<List<JobAd>> getByEmployerId(int employerId);
	DataResult<JobAd> getById(int id);

}
