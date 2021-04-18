package com.healthfreedom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthfreedom.model.Messages;

public interface MessageRepository extends JpaRepository<Messages, Integer>{

}
