package metproject.hrms.business.abstracts;

import java.util.List;

import metproject.hrms.core.utilities.result.DataResult;
import metproject.hrms.entities.concretes.EmployeeCv;

public interface EmployeeCvService {

	DataResult<List<EmployeeCv>> getAll();
}
