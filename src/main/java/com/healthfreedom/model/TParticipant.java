package com.healthfreedom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_participant")
public class TParticipant {

	@Id
	@Column(name="username")
	private String username;
	@Column(name = "start_date")
	private String startDate;
	@Column(name = "last_update")
	private String lastUpdate;
	@Column(name = "last_steps")
	private String lastSteps;
	@Column(name = "last_long")
	private String lastLong;
	@Column(name = "last_lat")
	private String lastLat;
	
	//my walk parameters
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public String getLastSteps() {
		return lastSteps;
	}
	public void setLastSteps(String lastSteps) {
		this.lastSteps = lastSteps;
	}
	public String getLastLong() {
		return lastLong;
	}
	public void setLastLong(String lastLong) {
		this.lastLong = lastLong;
	}
	public String getLastLat() {
		return lastLat;
	}
	public void setLastLat(String lastLat) {
		this.lastLat = lastLat;
	}
	@Override
	public String toString() {
		return "TParticipant [username=" + username + ", startDate=" + startDate + ", lastUpdate=" + lastUpdate
				+ ", lastSteps=" + lastSteps + ", lastLong=" + lastLong + ", lastLat=" + lastLat + "]";
	}
	
	
}
