package com.hrms.hrmsproject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.hrmsproject.business.abstracts.JobPositionService;
import com.hrms.hrmsproject.dataAccess.abstracts.JobPositionDao;
import com.hrms.hrmsproject.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{

	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	
	@Override
	public void add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		
	}

	@Override
	public void update(JobPosition jobPosition) {
		 this.jobPositionDao.save(jobPosition);
		
	}

	

	@Override
	public JobPosition getById(int id) {
		return this.jobPositionDao.getOne(id);
	}
	
	@Override
	public List<JobPosition> getAll() {
		return this.jobPositionDao.findAll();
			
	}


	@Override
	public void delete(int id) {
		this.jobPositionDao.deleteById(id);
		
	}

}
