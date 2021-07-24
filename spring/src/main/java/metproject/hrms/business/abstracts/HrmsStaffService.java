package metproject.hrms.business.abstracts;

import java.util.List;

import metproject.hrms.core.utilities.result.DataResult;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.entities.concretes.HrmsStaff;

public interface HrmsStaffService {
	DataResult<List<HrmsStaff>> getAll();
	Result add(HrmsStaff hrmsStaff);
	Result update(HrmsStaff hrmsStaff);
	DataResult<HrmsStaff> getById(int id);
	

}
