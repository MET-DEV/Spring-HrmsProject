package metproject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import metproject.hrms.entities.concretes.Technology;

public interface TechnologyDao extends JpaRepository<Technology, Integer>{

}
