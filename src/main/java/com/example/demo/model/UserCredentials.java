package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class UserCredentials {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String primaryEmail;

	private String secondaryEmail;

	@ApiModelProperty(hidden = true)
	private Boolean primaryEmailVerified = false;

	private boolean secondaryEmailVerified = false;

	private String userSecretPwd;

	private String userSecretJson;

	@CreationTimestamp
	private Date createdOn;

	@UpdateTimestamp
	private Date updatedOn;

	@OneToOne
	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrimaryEmail() {
		return primaryEmail;
	}

	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}

	public String getSecondaryEmail() {
		return secondaryEmail;
	}

	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}

	public Boolean getPrimaryEmailVerified() {
		return primaryEmailVerified;
	}

	public void setPrimaryEmailVerified(Boolean primaryEmailVerified) {
		this.primaryEmailVerified = primaryEmailVerified;
	}

	public boolean isSecondaryEmailVerified() {
		return secondaryEmailVerified;
	}

	public void setSecondaryEmailVerified(boolean secondaryEmailVerified) {
		this.secondaryEmailVerified = secondaryEmailVerified;
	}

	public String getUserSecretPwd() {
		return userSecretPwd;
	}

	public void setUserSecretPwd(String userSecretPwd) {
		this.userSecretPwd = userSecretPwd;
	}

	public String getUserSecretJson() {
		return userSecretJson;
	}

	public void setUserSecretJson(String userSecretJson) {
		this.userSecretJson = userSecretJson;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
