package metproject.hrms.api;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import metproject.hrms.business.abstracts.EmployerService;
import metproject.hrms.core.utilities.result.DataResult;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.entities.concretes.Employer;

@CrossOrigin
@RestController
@RequestMapping("/api/employers")
public class EmployersController {
	private EmployerService employersService;

	public EmployersController(EmployerService employersService) {
		super();
		this.employersService = employersService;
	}
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		return this.employersService.getAll();
	}
	
	@GetMapping("/getbyid")
	public DataResult<Employer> getById(@RequestParam int id){
		return this.employersService.getById(id);
	}
	@PostMapping("/add")
	public Result add(@RequestBody Employer employer) {
		return this.employersService.add(employer);
	}
}
