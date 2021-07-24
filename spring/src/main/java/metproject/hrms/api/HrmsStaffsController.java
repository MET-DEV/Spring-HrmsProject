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

import metproject.hrms.business.abstracts.HrmsStaffService;
import metproject.hrms.core.utilities.result.DataResult;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.entities.concretes.HrmsStaff;

@RestController
@CrossOrigin
@RequestMapping("/api/staff")
public class HrmsStaffsController {
	private HrmsStaffService staffService;
	
	@Autowired
	public HrmsStaffsController(HrmsStaffService staffService) {
		super();
		this.staffService = staffService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<HrmsStaff>> getAll(){
		return staffService.getAll();
	}
	@GetMapping("/getbyid")
	public DataResult<HrmsStaff> getById(@RequestParam int id){
		return staffService.getById(id);
	}
	@PostMapping("/add")
	public Result add(@RequestBody HrmsStaff hrmsStaff) {
		return staffService.add(hrmsStaff);
	}
	@PostMapping("/update")
	public Result update(@RequestBody HrmsStaff hrmsStaff) {
		return staffService.update(hrmsStaff);
	}

}
