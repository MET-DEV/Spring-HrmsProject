package metproject.hrms.core.utilities.business;



import metproject.hrms.core.utilities.result.ErrorResult;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.core.utilities.result.SuccessResult;
import metproject.hrms.entities.concretes.Employee;
import metproject.hrms.entities.concretes.Employer;

public class BusinessRules {
	
	
	public static boolean employeeCheckService(Employee employee) {
		
		
			if(employee.getPassword().equals(employee.getRPassword())&&employee.getPassword().length()>=6) {
				return true;
			}
		
		return false;
	}
	
	public static Result isEmptyEmployer(Employer employer) {
		if (employer.getWebSite()==null||employer.getEmail()==null||employer.getName()==null||employer.getPhoneNumber()==null||employer.getPassword()==null) {
			return new ErrorResult("Alanlar boş bırakılmaz.");
		}
		return new SuccessResult();
		
	}
}
