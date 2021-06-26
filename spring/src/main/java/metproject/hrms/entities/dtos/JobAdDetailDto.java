package metproject.hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobAdDetailDto {
	private int id;
	private String cityName;
	private String positionName;
	private double sallaryMax;
	private double sallaryMin;
	private String employerName;
	private String employerId;
	private String jobTitle;
	
}
