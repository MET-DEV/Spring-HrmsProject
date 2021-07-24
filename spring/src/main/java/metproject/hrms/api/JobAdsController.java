package metproject.hrms.api;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import metproject.hrms.business.abstracts.JobAdService;
import metproject.hrms.core.utilities.result.DataResult;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.entities.concretes.AdFilter;
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
	@GetMapping("/getAllByPage")
	public DataResult<List<JobAd>> getAllByPage(int pageNo,int pageSize){
		return jobAdService.getAll( pageNo, pageSize);
	}
	@GetMapping("/getbytrue")
	public DataResult<List<JobAd>> getByTrue(){
		return jobAdService.getTrueAd();
	}
	@GetMapping("/getbyfalse")
	public DataResult<List<JobAd>> getByFalse(){
		return jobAdService.getFalseAd();
	}
	
	
	@PostMapping("/getbyfilter")
	public DataResult<List<JobAd>> getByfilter(@RequestParam("pageNo") int pageNo,@RequestParam("pageSize") int pageSize,@RequestBody AdFilter filter){
		return jobAdService.getByFilter(pageNo, pageSize, filter);
	}
	@GetMapping("/getbyemployerid")
	public DataResult<List<JobAd>> getByEmployerId(@RequestParam int employerId){
		return jobAdService.getByEmployerId(employerId);
	}
	@GetMapping("/getbyid")
	public DataResult<JobAd> getById(@RequestParam int id){
		return jobAdService.getById(id);
		
	}
	@PostMapping("/add")
	public Result add(@RequestBody JobAd jobAdd) {
		return jobAdService.jobAdSave(jobAdd);
	}
	@PostMapping("/update")
	public Result update(@RequestBody JobAd jobAdd) {
		return jobAdService.update(jobAdd);
	}
	@PostMapping("/delete")
	public Result delete(@RequestBody JobAd jobAdd) {
		return jobAdService.delete(jobAdd);
	}

	
}
