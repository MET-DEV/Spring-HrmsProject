package metproject.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import metproject.hrms.entities.concretes.JobAd;

public interface JobAdDao extends JpaRepository<JobAd, Integer> {
	
	List<JobAd> getByEmployerId(int employerId);

}
