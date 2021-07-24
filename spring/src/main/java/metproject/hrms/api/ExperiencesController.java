package metproject.hrms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import metproject.hrms.business.abstracts.ExperienceService;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.entities.concretes.Experience;

@RestController
@CrossOrigin
@RequestMapping("/api/experience")
public class ExperiencesController {
	private ExperienceService experienceService;
	
	@Autowired
	public ExperiencesController(ExperienceService experienceService) {
		super();
		this.experienceService = experienceService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Experience experience,@RequestParam int employeeId) {
		return experienceService.add(experience,employeeId);
	}
	@PostMapping("/delete")
	public Result add(@RequestBody Experience experience) {
		return experienceService.delete(experience);
	}
	
}
