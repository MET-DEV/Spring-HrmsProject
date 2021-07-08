package metproject.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import metproject.hrms.business.abstracts.CvHeaderService;
import metproject.hrms.business.abstracts.EmployeeService;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.core.utilities.result.SuccessResult;
import metproject.hrms.dataAccess.abstracts.CvHeaderDao;
import metproject.hrms.entities.concretes.CvHeader;

@Service
public class CvHeaderManager implements CvHeaderService {
	
	private CvHeaderDao cvHeaderDao;
	private EmployeeService employeeService;
	@Autowired
	public CvHeaderManager(CvHeaderDao cvHeaderDao,EmployeeService employeeService) {
		super();
		this.cvHeaderDao = cvHeaderDao;
		this.employeeService=employeeService;
	}

	@Override
	public Result add(CvHeader cvHeader,int employeeId) {
		cvHeader.setEmployee(employeeService.getById(employeeId).getData());
		cvHeaderDao.save(cvHeader);
		return new SuccessResult();
	}

}
