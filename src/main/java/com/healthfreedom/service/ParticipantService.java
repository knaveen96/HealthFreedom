package com.healthfreedom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthfreedom.exception.ApiRequestException;
import com.healthfreedom.model.MParticipant;
import com.healthfreedom.model.ResponseDto;
import com.healthfreedom.model.TParticipant;
import com.healthfreedom.repository.MParticipantRepository;
import com.healthfreedom.repository.ParticipantRepository;
import com.healthfreedom.repository.TempRepo;
import com.healthfreedom.util.SetResponse;

@Service
public class ParticipantService {

	@Autowired
	ParticipantRepository pRepo;

	@Autowired
	TempRepo tRepo;

	@Autowired
	MParticipantRepository mRepo;
	
	public ResponseDto fetchParticipantData(String username) throws ApiRequestException {

		ResponseDto response = null;
		TParticipant participantData = pRepo.findByUsername(username);
		if (participantData != null) {

			response = new ResponseDto();
			response.settParticipant(participantData);
			response.setResponseCode("0");
			response.setResponseDescription("Success");
		}
		System.out.println("Participant Data : " + participantData);
		return response;
	}

	public ResponseDto insertParticipant(TParticipant participant) throws ApiRequestException {

		ResponseDto response = null;
		TParticipant tp = pRepo.save(participant);
		if (tp != null) {

			response = new ResponseDto();
			response.settParticipant(tp);
			response.setResponseCode("0");
			response.setResponseDescription("Success");
		}
		System.out.println(tp);
		return response;
	}

	public ResponseDto insertParticipantData(MParticipant participantData) throws ApiRequestException {

		ResponseDto response = null;
		MParticipant mp = mRepo.save(participantData);
		if(mp != null) {
			response = new ResponseDto();
			response.setmParticipant(mp);
			response.setResponseCode("0");
			response.setResponseDescription("Success");
		}
		System.out.println(mp);
		return response;
	}
	
	
	

	/*
	 * public void insertImgAndName(String username, String imageCode, String name)
	 * {
	 * 
	 * mRepo.insertNameImage(username, imageCode, name);
	 * 
	 * }
	 */

}
