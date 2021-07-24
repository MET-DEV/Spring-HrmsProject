package metproject.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import metproject.hrms.entities.concretes.AdFilter;
import metproject.hrms.entities.concretes.JobAd;

public interface JobAdDao extends JpaRepository<JobAd, Integer> {
	
	List<JobAd> getByEmployerId(int employerId);
	JobAd getById(int id);
	List<JobAd> getByStatus(boolean status);
	List<JobAd> getByStatus_True();
	
	public Page<JobAd> getByWorkTypeIdAndJobPositionIdAndCityIdAndStatus_True(int workTypeId,int jobPositionId,int cityId,Pageable pageable);
	@Query("Select j from metproject.hrms.entities.concretes.JobAd j where"
			+ " ((:#{#filter.cityId}) IS 0 OR j.city.id IN (:#{#filter.cityId}))"
			+ " and ((:#{#filter.workTypeId}) IS 0 OR j.workType.id IN (:#{#filter.workTypeId}))"
			+ " and ((:#{#filter.jobPositionId}) IS 0 OR j.jobPosition.id IN (:#{#filter.jobPositionId}))"
			+ " and j.status=true")
	public Page<JobAd> getByFilter(@Param("filter") AdFilter filter, Pageable pageable);
	

}
