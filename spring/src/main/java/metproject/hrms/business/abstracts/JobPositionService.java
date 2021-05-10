package metproject.hrms.business.abstracts;

import java.util.List;

import metproject.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
}
