package metproject.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import metproject.hrms.business.abstracts.CityService;
import metproject.hrms.core.utilities.result.DataResult;

import metproject.hrms.entities.concretes.City;

@CrossOrigin
@RestController
@RequestMapping("/api/cities")
public class CitiesController {
	
	private CityService cityService;
	@Autowired
	public CitiesController(CityService cityService) {
		super();
		this.cityService = cityService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<City>> getAll(){
		return cityService.getAll();
	}
	@GetMapping("/getbyid")
	public DataResult<City> getById(@RequestParam int id){
		return cityService.getByCityId(id);
	}
	

}
