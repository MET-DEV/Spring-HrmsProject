package metproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import metproject.hrms.business.abstracts.JobAdService;
import metproject.hrms.core.utilities.result.DataResult;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.core.utilities.result.SuccessDataResult;
import metproject.hrms.core.utilities.result.SuccessResult;
import metproject.hrms.dataAccess.abstracts.JobAdDao;
import metproject.hrms.entities.concretes.City;
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


	@Override
	public Result jobAdSave(JobAd jobAd) {
		jobAd.setStatus(false);
		jobAdDao.save(jobAd);
		return new SuccessResult("Ekleme yapıldı");
	}


	@Override
	public DataResult<List<JobAd>> getTrueAd() {
		
		return new SuccessDataResult<List<JobAd>>(jobAdDao.getByStatus(true));
	}


	@Override
	public DataResult<List<JobAd>> getFalseAd() {
		
		return new SuccessDataResult<List<JobAd>>(jobAdDao.getByStatus(false));
	}


	@Override
	public Result delete(JobAd jobAdd) {
		jobAdDao.delete(jobAdd);
		return new SuccessResult("Başarı ile silindi");
	}


	@Override
	public Result update(JobAd jobAdd) {
		jobAdd.setStatus(true);
		jobAdDao.save(jobAdd);
		return new SuccessResult();
	}

}
