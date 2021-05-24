package metproject.hrms.core.adapters;

import java.rmi.RemoteException;


import metproject.hrms.entities.concretes.Employee;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter implements CheckService{

	@Override
	public boolean checkRealEmployee(Employee employee)  {
		KPSPublicSoapProxy kpsPublicSoap = new KPSPublicSoapProxy();		 
		
		boolean result=false;
		try {
			result = kpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(employee.getNationaltyId()), employee.getFirstName().toUpperCase(), 
			employee.getLastName().toUpperCase(),employee.getYearOfBirth());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
}
