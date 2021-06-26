package metproject.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import metproject.hrms.entities.concretes.JobAd;
import metproject.hrms.entities.dtos.JobAdDetailDto;

public interface JobAdDao extends JpaRepository<JobAd, Integer> {
	
	List<JobAd> getByEmployerId(int employerId);
	JobAd getById(int id);
	List<JobAd> getByStatus(boolean status);
	

}
