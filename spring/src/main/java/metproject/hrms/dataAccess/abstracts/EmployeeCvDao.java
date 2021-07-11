package metproject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import metproject.hrms.entities.concretes.EmployeeCv;

public interface EmployeeCvDao extends JpaRepository<EmployeeCv, Integer> {
	EmployeeCv getByEmployee_Id(int id);

}
