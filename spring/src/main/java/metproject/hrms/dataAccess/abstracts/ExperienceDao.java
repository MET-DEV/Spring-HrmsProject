package metproject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import metproject.hrms.entities.concretes.Experience;

public interface ExperienceDao extends JpaRepository<Experience, Integer>{

}
