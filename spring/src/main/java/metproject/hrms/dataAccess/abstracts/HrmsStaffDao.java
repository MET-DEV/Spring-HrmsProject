package metproject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import metproject.hrms.entities.concretes.HrmsStaff;

public interface HrmsStaffDao extends JpaRepository<HrmsStaff, Integer> {
	HrmsStaff getById(int id);

}
