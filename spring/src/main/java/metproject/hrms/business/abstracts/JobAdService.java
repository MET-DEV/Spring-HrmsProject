package metproject.hrms.business.abstracts;

import java.util.List;

import metproject.hrms.core.utilities.result.DataResult;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.entities.concretes.JobAd;

public interface JobAdService {
	DataResult<List<JobAd>> getAll();
	DataResult<List<JobAd>> getByEmployerId(int employerId);
	DataResult<JobAd> getById(int id);
	Result jobAdSave(JobAd jobAd);
	DataResult<List<JobAd>> getTrueAd();
	DataResult<List<JobAd>> getFalseAd();
	Result delete(JobAd jobAdd);
	Result update(JobAd jobAdd);
	

}
