package com.healthfreedom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.healthfreedom.model.TTemp;

@Repository
public interface TempRepo extends JpaRepository<TTemp, Long>{
	
	@Query(value = "select t from TTemp t")
	public List<TTemp> fetchTemp();

}
