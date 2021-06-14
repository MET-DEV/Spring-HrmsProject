package metproject.hrms.business.concretes;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import metproject.hrms.business.abstracts.ImageService;
import metproject.hrms.core.utilities.result.DataResult;
import metproject.hrms.core.utilities.result.Result;
import metproject.hrms.core.utilities.result.SuccessResult;
import metproject.hrms.dataAccess.abstracts.ImageDao;
import metproject.hrms.entities.concretes.Image;

@Service
public class ImageManager implements ImageService {
	
	private ImageDao imageDao;
	
	@Autowired
	public ImageManager(ImageDao imageDao) {
		super();
		this.imageDao = imageDao;
	}

	@Override
	public Result add() throws IOException {
		Image image=new Image();
		Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "imageforcamp",
				"api_key", "741265881326438",
				"api_secret", "wAIjrfg9u3HzWwQbbZPIVa_CB7M"));
		File file = new File("D:\\Background\\493174181e79be8a4809asdsafasfd243a68cf8e5.jpg");
		Map uploadResult = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
		String link=uploadResult.get("url").toString();
		image.setEmployeeId(1);
		image.setImageLink(link);
		
		return new SuccessResult();
	}

}
