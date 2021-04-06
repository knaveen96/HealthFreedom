package com.healthfreedom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthfreedom.model.TParticipant;

@Repository
public interface ParticipantRepository extends JpaRepository<TParticipant, String>{

	//@Query(value = "SELECT * FROM t_participant WHERE username = ?0", nativeQuery = true)
	TParticipant findByUsername(String username);

}
