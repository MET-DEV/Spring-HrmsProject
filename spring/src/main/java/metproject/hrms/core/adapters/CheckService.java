package metproject.hrms.core.adapters;

import java.rmi.RemoteException;

import metproject.hrms.entities.concretes.Employee;

public interface CheckService {
	boolean checkRealEmployee(Employee employee);
		
	
}
