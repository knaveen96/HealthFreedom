package com.healthfreedom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.healthfreedom.exception.ApiRequestException;
import com.healthfreedom.model.MParticipant;
import com.healthfreedom.model.ResponseDto;
import com.healthfreedom.model.TParticipant;
import com.healthfreedom.service.ParticipantService;

@RestController
@RequestMapping("/healthfreedom")
public class HealthFreedomController {

	@Autowired
	ParticipantService pService;

	@GetMapping("/fetch/{username}")
	@ResponseBody
	public ResponseDto participantData(@PathVariable("username") String username) {

		ResponseDto response = null;
		if (username != null) {
			try {
				System.out.println("Fetch Req received, Username : " + username);
				response = pService.fetchParticipantData(username);
			} catch (ApiRequestException e) {
				response.setResponseCode("1");
				response.setResponseDescription("Exeption Occured : "+e);
				System.out.println("Exception occured : " + e);
			} catch (NullPointerException e) {
				System.out.println("Null Pointer Exception occured : " + e);
			} catch (Exception e) {
				System.out.println("Exception occured : " + e);
			}
		}
		return response;
	}
	
	@GetMapping("/fetchMessage/{username}")
	@ResponseBody
	public ResponseDto participantMessageData(@PathVariable("username") String username) {

		ResponseDto response = null;
		if (username != null) {
			try {
				System.out.println("Fetch Req received, Username : " + username);
				response = pService.fetchParticipantMessageData(username);
			} catch (ApiRequestException e) {
				response.setResponseCode("1");
				response.setResponseDescription("Exeption Occured : "+e);
				System.out.println("Exception occured : " + e);
			} catch (NullPointerException e) {
				System.out.println("Null Pointer Exception occured : " + e);
			} catch (Exception e) {
				System.out.println("Exception occured : " + e);
			}
		}
		return response;
	}

	@PostMapping(path = "/participant", consumes = "application/json", produces = "application/json")
	@ResponseBody
	public ResponseDto addOrUpdateParticipant(@RequestBody TParticipant participant) {

		ResponseDto response = null;
		if (participant != null) {
			try {
				System.out.println(participant.toString());
				response = pService.insertParticipant(participant);
			} catch (ApiRequestException e) {
				response.setResponseCode("1");
				response.setResponseDescription("Exeption Occured : "+e);
				System.out.println("Exception occured : " + e);
			} catch (NullPointerException e) {
				System.out.println("Null Pointer Exception occured : " + e);
			} catch (Exception e) {
				System.out.println("Exception occured : " + e);
			}
		}
		return response;
	}

	@PostMapping(path = "/participantData", consumes = "application/json", produces = "application/json")
	@ResponseBody
	public ResponseDto addParticipantDetails(@RequestBody MParticipant participantData) {

		ResponseDto response = null;
		if (participantData != null) {
			try {
				System.out.println(participantData.toString());
				response = pService.insertParticipantData(participantData);
			} catch (ApiRequestException e) {
				response.setResponseCode("1");
				response.setResponseDescription("Exeption Occured : "+e);
				System.out.println("Exception occured : " + e);
			} catch (NullPointerException e) {
				System.out.println("Null Pointer Exception occured : " + e);
			} catch (Exception e) {
				System.out.println("Exception occured : " + e);
			}
		}
		return response;
	}
	
	
	@GetMapping("/login")
	public String user() {
		return ("<h1>Login Successful !!</h1>");
	}
	
}
