package metproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import metproject.hrms.business.abstracts.ContactService;
import metproject.hrms.business.abstracts.EmployeeService;
import metproject.hrms.core.utilities.result.DataResult;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.core.utilities.result.SuccessDataResult;
import metproject.hrms.core.utilities.result.SuccessResult;
import metproject.hrms.dataAccess.abstracts.ContactDao;
import metproject.hrms.entities.concretes.Contact;

@Service
public class ContactManager implements ContactService {
	private ContactDao contactDao;
	private EmployeeService employeeService;

	@Autowired
	public ContactManager(ContactDao contactDao,EmployeeService employeeService) {
		super();
		this.contactDao = contactDao;
		this.employeeService=employeeService;
	}

	@Override
	public Result add(Contact contact,int employeeId) {
		contact.setEmployee(employeeService.getById(employeeId).getData());
		contactDao.save(contact);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<Contact>> getContact() {
		
		return new SuccessDataResult<List<Contact>>(contactDao.findAll());
	}
}
