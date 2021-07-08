package metproject.hrms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import metproject.hrms.business.abstracts.TechnologyService;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.entities.concretes.Technology;

@CrossOrigin
@RequestMapping("/api/tech")
@RestController
public class TechnologiesController {
	private TechnologyService techService;
	
	@Autowired
	public TechnologiesController(TechnologyService techService) {
		super();
		this.techService = techService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Technology technology,@RequestParam int employeeId) {
		return techService.add(technology, employeeId);
	}
}
