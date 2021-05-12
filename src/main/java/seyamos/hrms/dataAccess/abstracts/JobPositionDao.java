package seyamos.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import seyamos.hrms.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer>{

}
