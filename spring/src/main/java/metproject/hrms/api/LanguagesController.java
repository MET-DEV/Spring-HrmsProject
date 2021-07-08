package metproject.hrms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import metproject.hrms.business.abstracts.LanguageService;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.entities.concretes.Language;
@CrossOrigin
@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;
	@Autowired
	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	@PostMapping("/add")
	public Result add(@RequestBody Language language,@RequestParam int employeeId) {
		
		return languageService.add(language,employeeId);
	}
	
}
