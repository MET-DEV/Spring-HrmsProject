package metproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import metproject.hrms.business.abstracts.HrmsStaffService;
import metproject.hrms.core.utilities.result.DataResult;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.core.utilities.result.SuccessDataResult;
import metproject.hrms.core.utilities.result.SuccessResult;
import metproject.hrms.dataAccess.abstracts.HrmsStaffDao;
import metproject.hrms.entities.concretes.HrmsStaff;

@Service
public class HrmsStaffManager implements HrmsStaffService{
	private HrmsStaffDao staffDao;
	
	@Autowired
	public HrmsStaffManager(HrmsStaffDao staffDao) {
		super();
		this.staffDao = staffDao;
	}

	@Override
	public DataResult<List<HrmsStaff>> getAll() {
		
		return new SuccessDataResult<List<HrmsStaff>>(staffDao.findAll());
	}

	@Override
	public Result add(HrmsStaff hrmsStaff) {
		staffDao.save(hrmsStaff);
		return new SuccessResult();
	}

	@Override
	public Result update(HrmsStaff hrmsStaff) {
		staffDao.save(hrmsStaff);
		return new SuccessResult();
	}

	@Override
	public DataResult<HrmsStaff> getById(int id) {
		
		return new SuccessDataResult<HrmsStaff>(staffDao.getById(id));
	}
	
	
}
