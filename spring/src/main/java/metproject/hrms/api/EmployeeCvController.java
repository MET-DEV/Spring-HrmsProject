package metproject.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import metproject.hrms.business.abstracts.EmployeeCvService;
import metproject.hrms.core.utilities.result.DataResult;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.entities.concretes.EmployeeCv;

@CrossOrigin
@RequestMapping("/api/cv")
@RestController
public class EmployeeCvController {
	private EmployeeCvService cvService;

	@Autowired
	public EmployeeCvController(EmployeeCvService cvService) {
		super();
		this.cvService = cvService;
	}
	@GetMapping("/getAll")
	public DataResult<List<EmployeeCv>> getAll(){
		return cvService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody EmployeeCv employeeCv){
		return cvService.add(employeeCv);
	}
}
