package metproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import metproject.hrms.business.abstracts.JobAdService;
import metproject.hrms.core.utilities.result.DataResult;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.core.utilities.result.SuccessDataResult;
import metproject.hrms.core.utilities.result.SuccessResult;
import metproject.hrms.dataAccess.abstracts.JobAdDao;
import metproject.hrms.entities.concretes.AdFilter;
import metproject.hrms.entities.concretes.JobAd;
import net.bytebuddy.asm.Advice.This;

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


	@Override
	public DataResult<List<JobAd>> getAll(int pageNo, int pageSize) {
		
		Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		return new SuccessDataResult<List<JobAd>>(jobAdDao.findAll(pageable).getContent());
	}


	
	@Override
	public Page<JobAd>  getByFilter(int workTypeId, int jobPositionId, int cityId, int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		
		return jobAdDao.getByWorkTypeIdAndJobPositionIdAndCityIdAndStatus_True(workTypeId, jobPositionId, cityId, pageable);
	}


	@Override
	public DataResult<List<JobAd>> getByFilter(int pageNo, int pageSize, AdFilter filter) {
		Pageable pageble=PageRequest.of(pageNo-1,pageSize);
		
		return new SuccessDataResult<List<JobAd>>(this.jobAdDao.getByFilter(filter, pageble).getContent(),this.jobAdDao.getByFilter(filter, pageble).getNumberOfElements()+"");
	}
	
	
	
	
	

}
