package com.healthfreedom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping("/participantHist")
public class HealthFreedomController {

	@Autowired
	ParticipantService pService;

	// Actual
	// 1-->
	@GetMapping("/fetch/{username}")
	@ResponseBody
	public ResponseDto participantData(@PathVariable("username") String username) {

		ResponseDto response = null;
		if (username != null) {
			try {
				System.out.println("Fetch Req received, Username : " + username);
				response = pService.fetchParticipantData(username);
			} catch (ApiRequestException e) {
				throw new ApiRequestException("ApiException occured : " + e, e);
			} catch (Exception e) {
				System.out.println("Exception occured : " + e);
			}
		}
		return response;
	}

	// 2-->
	@PostMapping(path = "/participant", consumes = "application/json", produces = "application/json")
	@ResponseBody
	public ResponseDto addOrUpdateParticipant(@RequestBody TParticipant participant) {

		TParticipant tPart = null;
		ResponseDto response = null;
		if (participant != null) {
			try {
				System.out.println(participant.toString());
				response = pService.insertParticipant(participant);
			} catch (ApiRequestException e) {
				throw new ApiRequestException("ApiException occured : " + e, e);
			} catch (Exception e) {
				System.out.println("Exception occured : " + e);
			}
		}
		return response;
	}

	// 3-->
	@PostMapping(path = "/participantData", consumes = "application/json", produces = "application/json")
	@ResponseBody
	public ResponseDto addParticipantDetails(@RequestBody MParticipant participantData) {

		MParticipant mPart = null;
		ResponseDto response = null;
		if (participantData != null) {
			try {
				System.out.println(participantData.toString());
				response = pService.insertParticipantData(participantData);
			} catch (ApiRequestException e) {
				throw new ApiRequestException("ApiException occured : " + e, e);
			} catch (Exception e) {
				System.out.println("Exception occured : " + e);
			}
		}
		return response;
	}
	
	
	@GetMapping("/user")
	public String user() {
		return ("<h1>Welcome User</h1>");
	}
	
	

	// 4-->

	/*
	 * @PostMapping(path = "/insertImgName/{username}/{imageCode}/{name}")
	 * 
	 * @ResponseBody public void insertNameImgCode(@PathVariable("username") String
	 * username,
	 * 
	 * @PathVariable("imageCode") String imageCode,
	 * 
	 * @PathVariable("name") String name) {
	 * 
	 * if (username != null) { try { System.out.println("Username is : " + username
	 * + " " + imageCode + " " + name); pService.insertImgAndName(username,
	 * imageCode, name); } catch (ApiRequestException e) { throw new
	 * ApiRequestException("ApiException occured : " + e, e); } catch (Exception e)
	 * { System.out.println("Exception occured : " + e); } } }
	 */

	@CrossOrigin
	@GetMapping("/home")
	public String naveen() {

		System.out.println("Request received from JavaScript");
		return "Hey there !";
	}

}
