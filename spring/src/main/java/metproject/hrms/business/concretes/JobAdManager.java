package metproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import metproject.hrms.business.abstracts.JobAdService;
import metproject.hrms.core.utilities.result.DataResult;
import metproject.hrms.core.utilities.result.SuccessDataResult;
import metproject.hrms.dataAccess.abstracts.JobAdDao;
import metproject.hrms.entities.concretes.JobAd;

@Service
public class JobAdManager implements JobAdService {
	
	private JobAdDao jobAdDao;
	
	@Autowired
	public JobAdManager(JobAdDao jobAdDao) {
		super();
		this.jobAdDao = jobAdDao;
	}


	@Override
	public DataResult<List<JobAd>> getAll() {
		
		return new SuccessDataResult<List<JobAd>>(jobAdDao.findAll(),"ilanlar getirildi");
	}


	@Override
	public DataResult<List<JobAd>> getByEmployerId(int employerId) {

		return new SuccessDataResult<List<JobAd>>(jobAdDao.getByEmployerId(employerId));
	}


	@Override
	public DataResult<JobAd> getById(int id) {
		
		return new SuccessDataResult<JobAd>(jobAdDao.getById(id),"ID ye göre getirildi");
	}

}
