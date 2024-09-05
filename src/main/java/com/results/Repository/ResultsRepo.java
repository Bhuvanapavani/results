package com.results.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.results.model.Results;

@Repository
public interface ResultsRepo extends JpaRepository<Results,String>{

	public Results findByHallticketno(String hallticketno);
 

}
