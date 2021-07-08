package metproject.hrms.entities.concretes;




import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employees")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","job_ads"})
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="employee_id")
	private int id;
	
	@Column(name="nationality_id")
	private String nationaltyId;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name = "job_position_id")
	private int jobPositionId;
	
	
	@Column(name="first_name")
	private String firstName;
	
	
	@Column(name="e_mail")
	private String email;
	
	@Column(name="year_of_birth")
	private int yearOfBirth;
	
	@Column(name="password")
	private String password;
	
	private String rPassword;
	
	@OneToMany(mappedBy = "employee")

	private List<Language> languages;
	
	
	@OneToMany(mappedBy = "employee")

	private List<Technology> technologies;
	
	
	@OneToMany(mappedBy = "employee")

	private List<Education> educations;
	
	
	@OneToMany(mappedBy = "employee")
	private List<Experience> Experiences;
	
	@OneToMany(mappedBy = "employee")
	private List<CvHeader> headers; 
	
	
	@OneToMany(mappedBy = "employee")
	@JsonIgnore
	private List<EmployeeCv> employeeCv;
	
	
   
}
