package metproject.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "experiences")
public class Experience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")	
	private int id;
	
	@Column(name="where")	
	private String where;
	
	@Column(name="description")	
	private String description;
	
	@Column(name="start_year")	
	private int startYear;
	
	@Column(name="completion_year")	
	private int completionYear;
	
	@ManyToOne()
	@JoinColumn(name = "employee_id")
	@JsonIgnore
	private EmployeeCv employeeCv;

}
