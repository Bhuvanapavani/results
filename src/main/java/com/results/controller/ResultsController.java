package com.results.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.results.Repository.ResultsRepo;
import com.results.model.Results;

@RestController
@RequestMapping("/results")

public class ResultsController {
	@Autowired
	private ResultsRepo repo;
	@PostMapping("/store")
	public Results add(@RequestBody Results model)
	{
		Results save=repo.save(model);
		return save;
		
	}
	
	@GetMapping("/getresult/{hallticketno}")
	
	public Results getresults(@PathVariable String hallticketno)
	{
		Results save=repo.findByHallticketno(hallticketno);
		return save;
	}
	}
	


