package metproject.hrms.business.abstracts;

import java.util.List;

import metproject.hrms.core.utilities.result.DataResult;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.entities.concretes.Contact;

public interface ContactService {
	Result add(Contact contact,int employeeId);
	DataResult<List<Contact>> getContact();
}
