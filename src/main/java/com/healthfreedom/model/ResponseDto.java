package com.healthfreedom.model;

public class ResponseDto {

	private String responseCode;
	private String responseDescription;
	private TParticipant tParticipant;
	private MParticipant mParticipant;
	
	public TParticipant gettParticipant() {
		return tParticipant;
	}
	public void settParticipant(TParticipant tParticipant) {
		this.tParticipant = tParticipant;
	}
	public MParticipant getmParticipant() {
		return mParticipant;
	}
	public void setmParticipant(MParticipant mParticipant) {
		this.mParticipant = mParticipant;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseDescription() {
		return responseDescription;
	}
	public void setResponseDescription(String responseDescription) {
		this.responseDescription = responseDescription;
	}
}
