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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="languages")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","employees"})
public class Language {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	
	@Column(name="language")
	private String language;
	
	
	@Column(name="language_level")
	private int languageLevel;
	
	
	@ManyToOne()
	@JoinColumn(name = "employee_id")
	@JsonIgnore
	private Employee employee;
	
	

}
