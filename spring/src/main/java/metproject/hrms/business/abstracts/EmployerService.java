package metproject.hrms.business.abstracts;

import java.util.List;

import metproject.hrms.core.utilities.result.DataResult;
import metproject.hrms.core.utilities.result.Result;

import metproject.hrms.entities.concretes.Employer;

public interface EmployerService {
	DataResult<List<Employer>> getAll();
	Result add(Employer employer);
}
