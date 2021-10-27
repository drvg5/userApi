package com.practice.user.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class UserRepo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@JsonProperty("user-name")
	private String userName;

	@JsonProperty("user-access-level")
	private String userAccessLevel;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAccessLevel() {
		return userAccessLevel;
	}

	public void setUserAccessLevel(String userAccessLevel) {
		this.userAccessLevel = userAccessLevel;
	}

}
