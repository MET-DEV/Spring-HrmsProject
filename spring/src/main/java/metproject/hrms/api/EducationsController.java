package metproject.hrms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import metproject.hrms.business.abstracts.EducationService;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.entities.concretes.Education;

@CrossOrigin
@RestController
@RequestMapping("/api/education")
public class EducationsController {
	private EducationService eduService;
	
	@Autowired
	public EducationsController(EducationService eduService) {
		super();
		this.eduService = eduService;
	}
	@PostMapping("/add")
	public Result add(@RequestBody Education education,@RequestParam int employeeId) {
		return eduService.add(education, employeeId);
	}
	@PostMapping("/delete")
	public Result delete(@RequestBody Education education) {
		return eduService.delete(education);
	}
	
}
