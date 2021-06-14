package metproject.hrms.api;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import metproject.hrms.business.abstracts.ImageService;
import metproject.hrms.core.utilities.result.Result;

@RestController
@RequestMapping("/api/images")
public class ImagesController {
	private ImageService imageService;
	
	@Autowired
	public ImagesController(ImageService imageService) {
		super();
		this.imageService = imageService;
	}
	@GetMapping("/add")
	public Result add() throws IOException {
		return imageService.add();
	}

}
