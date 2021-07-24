package metproject.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import metproject.hrms.entities.concretes.CvHeader;

public interface CvHeaderDao extends JpaRepository<CvHeader, Integer>{
	CvHeader getByEmployeeId(int employeeId);
}
