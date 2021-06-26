package metproject.hrms.entities.concretes;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employees_cv")
public class EmployeeCv {
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Id
	@Column(name="employee_id")
	private int employeeId;
	
	@OneToMany(mappedBy = "employeeCv")

	private List<Language> languages;
	
	
	@OneToMany(mappedBy = "employeeCv")

	private List<Technology> technologies;
	
	
	@OneToMany(mappedBy = "employeeCv")

	private List<Education> educations;
	
	
	@OneToMany(mappedBy = "employeeCv")

	private List<Experience> Experiences;
	
	
	

	
	
	
	
	
	
	

}
