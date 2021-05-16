package com.hrms.hrmsproject.business.abstracts;

import java.util.List;


import com.hrms.hrmsproject.entities.concretes.JobPosition;

public interface JobPositionService {
	
	List<JobPosition> getAll();
	void add(JobPosition jobPosition);
	void update(JobPosition jobPosition);
	void delete(int id);
	JobPosition getById(int id);
	

}
