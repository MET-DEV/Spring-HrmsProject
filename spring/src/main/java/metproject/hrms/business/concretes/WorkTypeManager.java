package metproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import metproject.hrms.business.abstracts.WorkTypeService;
import metproject.hrms.core.utilities.result.DataResult;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.core.utilities.result.SuccessDataResult;
import metproject.hrms.core.utilities.result.SuccessResult;
import metproject.hrms.dataAccess.abstracts.WorkTypeDao;
import metproject.hrms.entities.concretes.WorkType;

@Service
public class WorkTypeManager implements WorkTypeService {
	private WorkTypeDao workTypeDao;
	

	@Autowired
	public WorkTypeManager(WorkTypeDao workTypeDao) {
		super();
		this.workTypeDao = workTypeDao;
	}

	@Override
	public DataResult<List<WorkType>> getAll() {
		
		return new SuccessDataResult<List<WorkType>>(workTypeDao.findAll());
	}

	@Override
	public Result add(WorkType workType) {
		workTypeDao.save(workType);
		
		return new SuccessResult("Ekleme Başarılı");
	}

}
