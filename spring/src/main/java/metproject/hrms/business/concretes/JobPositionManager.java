package metproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import metproject.hrms.business.abstracts.JobPositionService;
import metproject.hrms.core.utilities.result.DataResult;
import metproject.hrms.core.utilities.result.ErrorResult;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.core.utilities.result.SuccessDataResult;
import metproject.hrms.core.utilities.result.SuccessResult;
import metproject.hrms.dataAccess.abstracts.JobPositionDao;

import metproject.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		
		return new SuccessDataResult<List<JobPosition>>(jobPositionDao.findAll(),"Meslek alanları listelendi");
	}

	@Override
	public Result add(JobPosition jobPosition) {
		if (checkAlreadyExistJob(jobPosition)) {
			jobPositionDao.save(jobPosition);
			
			
			
			return new SuccessResult("Ekleme başarılı");
		}
		return new ErrorResult("Ekleme yapılmadı lütfen daha önceden girilmemiş bir meslek kolu seçin");
		
	}
	private boolean checkAlreadyExistJob(JobPosition job) {
		
		List<JobPosition> result=jobPositionDao.findAll();
		for (JobPosition jobPosition : result) {
			if (jobPosition.getName().equals(job.getName())) {
				return false;
			}
		}
		return true;
	}

	@Override
	public DataResult<JobPosition> getById(int id) {
		
		return new SuccessDataResult<JobPosition>(jobPositionDao.getById(id));
	}

	

}
