package metproject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import metproject.hrms.entities.concretes.Language;

public interface LanguageDao extends JpaRepository<Language, Integer>{

}
