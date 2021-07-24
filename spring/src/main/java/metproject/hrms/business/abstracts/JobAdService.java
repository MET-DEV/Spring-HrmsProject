package metproject.hrms.business.abstracts;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import metproject.hrms.core.utilities.result.DataResult;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.entities.concretes.AdFilter;
import metproject.hrms.entities.concretes.JobAd;

public interface JobAdService {
	DataResult<List<JobAd>> getAll();
	DataResult<List<JobAd>> getAll(int pageNo,int pageSize);
	DataResult<List<JobAd>> getByEmployerId(int employerId);
	
	DataResult<JobAd> getById(int id);
	Result jobAdSave(JobAd jobAd);
	DataResult<List<JobAd>> getTrueAd();
	DataResult<List<JobAd>> getFalseAd();
	Result delete(JobAd jobAdd);
	Result update(JobAd jobAdd);
	Page<JobAd>  getByFilter(int workTypeId, int jobPositionId, int cityId, int pageNo, int pageSize);
	DataResult<List<JobAd>> getByFilter(int pageNo,int pageSize,AdFilter filter);
	
	

}
