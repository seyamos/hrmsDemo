package seyamos.hrms.business.abstracts;

import java.util.List;

import seyamos.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	
	List<JobPosition> getAll();

}
