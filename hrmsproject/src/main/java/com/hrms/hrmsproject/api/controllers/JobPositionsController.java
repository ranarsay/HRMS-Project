package com.hrms.hrmsproject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.hrmsproject.business.abstracts.JobPositionService;
import com.hrms.hrmsproject.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionsController {
	
	private JobPositionService jobPositionService;
	
    @Autowired
	public JobPositionsController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
    
    @PostMapping("/add")
	public void add(JobPosition jobPosition){
		this.jobPositionService.add(jobPosition);
	}
	
	@PostMapping("/update")
	public void update(JobPosition jobPosition){
		this.jobPositionService.update(jobPosition);
	}
	
	@PostMapping("/delete")
	public void delete(int id){
		this.jobPositionService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public JobPosition getById(int id){
		return this.jobPositionService.getById(id);
	}

	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		return this.jobPositionService.getAll();
		
	}
}
