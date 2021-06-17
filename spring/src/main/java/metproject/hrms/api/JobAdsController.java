package metproject.hrms.api;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import metproject.hrms.business.abstracts.JobAdService;
import metproject.hrms.core.utilities.result.DataResult;
import metproject.hrms.entities.concretes.JobAd;
@CrossOrigin
@RestController
@RequestMapping("/api/jobad")
public class JobAdsController {
	private JobAdService jobAdService;

	public JobAdsController(JobAdService jobAdService) {
		super();
		this.jobAdService = jobAdService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobAd>> getAll(){
		return jobAdService.getAll();
	}
	@GetMapping("/getbyemployerid")
	public DataResult<List<JobAd>> getByEmployerId(@RequestParam int employerId){
		return jobAdService.getByEmployerId(employerId);
	}
	@GetMapping("/getbyid")
	public DataResult<JobAd> getById(@RequestParam int id){
		return jobAdService.getById(id);
	}

	
}
