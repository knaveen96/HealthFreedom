package com.healthfreedom.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.healthfreedom.model.MParticipant;

@Repository
public interface MParticipantRepository extends JpaRepository<MParticipant, String> {

	MParticipant findByUsername(String username);

	//@Modifying
	//@Transactional
	//@Query(value = "insert into m_participant (image_code,name) VALUES (:imageCode,:name) where username= :username", nativeQuery = true)
	//@Query(value = "update m_participant mp set mp.image_code=:imageCode, mp.name =:name where mp.username = :username")
	//void insertNameImage(String username, String imageCode, String name);

}
