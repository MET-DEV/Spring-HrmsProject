package metproject.hrms.entities.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import metproject.hrms.entities.concretes.Contact;
import metproject.hrms.entities.concretes.Education;
import metproject.hrms.entities.concretes.Employee;
import metproject.hrms.entities.concretes.Experience;
import metproject.hrms.entities.concretes.Language;
import metproject.hrms.entities.concretes.Technology;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CvDto {
	
	public Employee employee;
	public List<Education> educations;
	public List<Contact> contacts;
	public List<Experience> experiences;
	public String header;
	public List<Language> languages;
	public List<Technology> technologies;
}
