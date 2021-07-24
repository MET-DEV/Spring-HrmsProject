package metproject.hrms.entities.concretes;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdFilter {
	private int cityId;
	private int jobPositionId;
	private int workTypeId;
}
