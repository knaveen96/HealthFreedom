package com.healthfreedom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthfreedom.model.Messages;

@Repository
public interface MessageRepository extends JpaRepository<Messages, Integer>{

}
