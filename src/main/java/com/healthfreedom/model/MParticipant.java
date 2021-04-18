package com.healthfreedom.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "m_participant")
public class MParticipant {
	
	@Id
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="name")
	private String name;
	@Column(name="image_code")
	private String imageCode;
	@Column(name="update_date")
	private String updateDate;
	/*
	 * @Column(name="insertion_date") private String insertDate;
	 */
	@Column(name="login_flag")
	private String loginFlag;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_fid", referencedColumnName = "username")
	private List<Messages> messages; 
	
	
	public List<Messages> getMessages() {
		return messages;
	}
	public void setMessages(List<Messages> messages) {
		this.messages = messages;
	}
	public String getLoginFlag() {
		return loginFlag;
	}
	public void setLoginFlag(String loginFlag) {
		this.loginFlag = loginFlag;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImageCode() {
		return imageCode;
	}
	public void setImageCode(String imageCode) {
		this.imageCode = imageCode;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "MParticipant [username=" + username + ", password=" + password + ", name=" + name + ", imageCode="
				+ imageCode + ", updateDate=" + updateDate + "]";
	}

	/*
	 * public String getInsertDate() { return insertDate; } public void
	 * setInsertDate(String insertDate) { this.insertDate = insertDate; }
	 */
	/*
	 * @Override public String toString() { return "MParticipant [username=" +
	 * username + ", password=" + password + ", name=" + name + ", imageCode=" +
	 * imageCode + ", updateDate=" + updateDate + ", insertDate=" + insertDate +
	 * ", getUsername()=" + getUsername() + ", getPassword()=" + getPassword() +
	 * ", getName()=" + getName() + ", getImageCode()=" + getImageCode() +
	 * ", getUpdateDate()=" + getUpdateDate() + ", getInsertDate()=" +
	 * getInsertDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
	 * + ", toString()=" + super.toString() + "]"; }
	 */
	
	
}
