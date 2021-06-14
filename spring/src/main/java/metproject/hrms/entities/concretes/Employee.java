package metproject.hrms.entities.concretes;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employees")
@Data
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
	
	@OneToMany(targetEntity = Language.class,cascade = CascadeType.ALL)
	@JoinColumn(name="employee_id",referencedColumnName = "employee_id")
	private List<Language> languages;
	
	@OneToMany(targetEntity = Contact.class,cascade = CascadeType.ALL)
	@JoinColumn(name="employee_id",referencedColumnName = "employee_id")
	private List<Contact> contacts;
	
	@OneToMany(targetEntity = Technology.class,cascade = CascadeType.ALL)
	@JoinColumn(name="employee_id",referencedColumnName = "employee_id")
	private List<Technology> technology;
	
	@OneToMany(targetEntity = Experience.class,cascade = CascadeType.ALL)
	@JoinColumn(name="employee_id",referencedColumnName = "employee_id")
	private List<Experience> Experience;
	
	@OneToMany(targetEntity = Education.class,cascade = CascadeType.ALL)
	@JoinColumn(name="employee_id",referencedColumnName = "employee_id")
	private List<Education> Education;
}
