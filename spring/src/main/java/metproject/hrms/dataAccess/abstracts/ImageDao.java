package metproject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import metproject.hrms.entities.concretes.Image;

public interface ImageDao extends JpaRepository<Image, Integer>{

}
