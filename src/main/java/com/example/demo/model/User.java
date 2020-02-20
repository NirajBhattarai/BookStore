package com.example.demo.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String firstName;

	private String middleName;

	private String lastName;

	private String suffix;

	private String currStreetAddress;

	private String currCity;

	private String currState;

	private Long yearsInAddress;

	private Long monthsInAddress;

	private String ownOrRent;

	private String monthlyExpense;

	private String mailStreetAddress;

	private String mailCity;

	private String mailZip;

	private String mailCountry;

	@CreationTimestamp
	private Date createDt;

	@UpdateTimestamp
	private Date updateDt;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
	private Set<Role> role;

	@ApiModelProperty(hidden = true)
	private Boolean isEmailVerified = false;

	@ApiModelProperty(hidden = true)
	private Boolean isUserBlocked = false;

	@ApiModelProperty(hidden = true)
	private Boolean isUserRegistered = false;

	@ApiModelProperty(hidden = true)
	private Boolean isAccountDeactivated = false;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getCurrStreetAddress() {
		return currStreetAddress;
	}

	public void setCurrStreetAddress(String currStreetAddress) {
		this.currStreetAddress = currStreetAddress;
	}

	public String getCurrCity() {
		return currCity;
	}

	public void setCurrCity(String currCity) {
		this.currCity = currCity;
	}

	public String getCurrState() {
		return currState;
	}

	public void setCurrState(String currState) {
		this.currState = currState;
	}

	public Long getYearsInAddress() {
		return yearsInAddress;
	}

	public void setYearsInAddress(Long yearsInAddress) {
		this.yearsInAddress = yearsInAddress;
	}

	public Long getMonthsInAddress() {
		return monthsInAddress;
	}

	public void setMonthsInAddress(Long monthsInAddress) {
		this.monthsInAddress = monthsInAddress;
	}

	public String getOwnOrRent() {
		return ownOrRent;
	}

	public void setOwnOrRent(String ownOrRent) {
		this.ownOrRent = ownOrRent;
	}

	public String getMonthlyExpense() {
		return monthlyExpense;
	}

	public void setMonthlyExpense(String monthlyExpense) {
		this.monthlyExpense = monthlyExpense;
	}

	public String getMailStreetAddress() {
		return mailStreetAddress;
	}

	public void setMailStreetAddress(String mailStreetAddress) {
		this.mailStreetAddress = mailStreetAddress;
	}

	public String getMailCity() {
		return mailCity;
	}

	public void setMailCity(String mailCity) {
		this.mailCity = mailCity;
	}

	public String getMailZip() {
		return mailZip;
	}

	public void setMailZip(String mailZip) {
		this.mailZip = mailZip;
	}

	public String getMailCountry() {
		return mailCountry;
	}

	public void setMailCountry(String mailCountry) {
		this.mailCountry = mailCountry;
	}

	public Date getCreateDt() {
		return createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	public Date getUpdateDt() {
		return updateDt;
	}

	public void setUpdateDt(Date updateDt) {
		this.updateDt = updateDt;
	}

	public Set<Role> getRole() {
		return role;
	}

	public void setRole(Set<Role> role) {
		this.role = role;
	}

	public Boolean getIsEmailVerified() {
		return isEmailVerified;
	}

	public void setIsEmailVerified(Boolean isEmailVerified) {
		this.isEmailVerified = isEmailVerified;
	}

	public Boolean getIsUserBlocked() {
		return isUserBlocked;
	}

	public void setIsUserBlocked(Boolean isUserBlocked) {
		this.isUserBlocked = isUserBlocked;
	}

	public Boolean getIsUserRegistered() {
		return isUserRegistered;
	}

	public void setIsUserRegistered(Boolean isUserRegistered) {
		this.isUserRegistered = isUserRegistered;
	}

	public Boolean getIsAccountDeactivated() {
		return isAccountDeactivated;
	}

	public void setIsAccountDeactivated(Boolean isAccountDeactivated) {
		this.isAccountDeactivated = isAccountDeactivated;
	}

}
