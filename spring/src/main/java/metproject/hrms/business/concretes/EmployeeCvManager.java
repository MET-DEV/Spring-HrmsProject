package metproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import metproject.hrms.business.abstracts.EmployeeCvService;
import metproject.hrms.core.utilities.result.DataResult;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.core.utilities.result.SuccessDataResult;
import metproject.hrms.core.utilities.result.SuccessResult;
import metproject.hrms.dataAccess.abstracts.EmployeeCvDao;
import metproject.hrms.entities.concretes.Education;
import metproject.hrms.entities.concretes.EmployeeCv;

@Service
public class EmployeeCvManager implements EmployeeCvService {

	private EmployeeCvDao cvDao;
	@Autowired
	public EmployeeCvManager(EmployeeCvDao cvDao) {
		super();
		this.cvDao = cvDao;
	}
	@Override
	public DataResult<List<EmployeeCv>> getAll() {
		
		return new SuccessDataResult<List<EmployeeCv>>(cvDao.findAll(),"getirildi");
	}
	@Override
	public Result add(@RequestBody EmployeeCv employeeCv) {
		
		cvDao.save(employeeCv);
		return new SuccessResult();
	}

}
