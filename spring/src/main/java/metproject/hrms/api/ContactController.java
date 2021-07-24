package metproject.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import metproject.hrms.business.abstracts.ContactService;
import metproject.hrms.core.utilities.result.DataResult;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.entities.concretes.Contact;

@RequestMapping("/api/contact")
@RestController
@CrossOrigin
public class ContactController {
	private ContactService contactService;
	
	@Autowired
	public ContactController(ContactService contactService) {
		super();
		this.contactService = contactService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Contact>> getAll(){
		return contactService.getContact();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Contact contact,@RequestParam int employeeId) {
		return contactService.add(contact,employeeId);
	}
}
