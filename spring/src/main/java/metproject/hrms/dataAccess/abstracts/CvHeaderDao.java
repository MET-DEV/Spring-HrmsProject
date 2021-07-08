package metproject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import metproject.hrms.entities.concretes.CvHeader;

public interface CvHeaderDao extends JpaRepository<CvHeader, Integer>{

}
