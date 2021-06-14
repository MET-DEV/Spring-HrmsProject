package metproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import metproject.hrms.business.abstracts.CityService;
import metproject.hrms.core.utilities.result.DataResult;
import metproject.hrms.core.utilities.result.SuccessDataResult;
import metproject.hrms.dataAccess.abstracts.CityDao;
import metproject.hrms.entities.concretes.City;

@Service
public class CityManager implements CityService {

	private CityDao cityDao;
	
	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}
	@Override
	public DataResult<List<City>> getAll() {
		
		return new SuccessDataResult<List<City>>(cityDao.findAll(),"Şehirler Getirildi");
	}

}
