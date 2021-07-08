package metproject.hrms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import metproject.hrms.business.abstracts.CvHeaderService;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.entities.concretes.CvHeader;

@CrossOrigin
@RestController
@RequestMapping("/api/cvheader")
public class CvHeadersController {
	private CvHeaderService cvHeaderService;
	
	@Autowired
	public CvHeadersController(CvHeaderService cvHeaderService) {
		super();
		this.cvHeaderService = cvHeaderService;
	}
	@PostMapping("/add")
	public Result add(@RequestBody CvHeader header,@RequestParam int employeeId) {
		return cvHeaderService.add(header,employeeId);
	}
}
