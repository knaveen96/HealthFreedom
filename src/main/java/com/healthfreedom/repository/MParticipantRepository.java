package com.healthfreedom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthfreedom.model.MParticipant;

@Repository
public interface MParticipantRepository extends JpaRepository<MParticipant, String>{

}
