package metproject.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import metproject.hrms.business.abstracts.WorkTypeService;
import metproject.hrms.core.utilities.result.DataResult;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.entities.concretes.WorkType;

@CrossOrigin
@RestController
@RequestMapping("/api/worktype")
public class WorkTypeController {
	private WorkTypeService workTypeService;

	@Autowired
	public WorkTypeController(WorkTypeService workTypeService) {
		super();
		this.workTypeService = workTypeService;
	}
	@GetMapping("/getall")
	public DataResult<List<WorkType>> getAll(){
		return workTypeService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody WorkType workType) {
		return workTypeService.add(workType);
	}

}
