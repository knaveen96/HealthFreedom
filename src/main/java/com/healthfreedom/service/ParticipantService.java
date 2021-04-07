package com.healthfreedom.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthfreedom.exception.ApiRequestException;
import com.healthfreedom.model.MParticipant;
import com.healthfreedom.model.TParticipant;
import com.healthfreedom.repository.MParticipantRepository;
import com.healthfreedom.repository.ParticipantRepository;
import com.healthfreedom.repository.TempRepo;

@Service
public class ParticipantService {

	@Autowired
	ParticipantRepository pRepo;

	@Autowired
	TempRepo tRepo;

	@Autowired
	MParticipantRepository mRepo;

	public TParticipant fetchParticipantData(String username) throws ApiRequestException {

		TParticipant participantData = pRepo.findByUsername(username);
		System.out.println("Participant Data : " + participantData);
		return participantData;
	}

	public TParticipant insertParticipant(TParticipant participant) throws ApiRequestException{

		TParticipant tp = pRepo.save(participant);
		System.out.println(tp);
		return tp;
	}

	public MParticipant insertParticipantData(MParticipant participantData) throws ApiRequestException{

		MParticipant mp = mRepo.save(participantData);
		System.out.println(mp);
		return mp;
	}

	public void insertImgAndName(String username, String imageCode, String name) {
		
		mRepo.insertNameImage(username,imageCode, name);
		
	}
	
}
