package seyamos.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import seyamos.hrms.business.abstracts.JobPositionService;
import seyamos.hrms.dataAccess.abstracts.JobPositionDao;
import seyamos.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{	
	
	private JobPositionDao JobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.JobPositionDao = jobPositionDao;
	}


	@Override
	public List<JobPosition> getAll() {
		return JobPositionDao.findAll();		
	}
	
	

}
