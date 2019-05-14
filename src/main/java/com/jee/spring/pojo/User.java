package com.jee.spring.pojo;

public class User {
	
	 private String username;
	 private String password;
	 private String firstName;
	 private String lastName;
	 private String dob;
	 private String mobileNo;
	 private String emailId;

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

	 public String getFirstName() {
	  return firstName;
	 }

	 public void setFirstName(String firstName) {
	  this.firstName = firstName;
	 }

	 public String getLastName() {
	  return lastName;
	 }

	 public void setLastName(String lastName) {
	  this.lastName = lastName;
	 }

	 public String getDob() {
	  return dob;
	 }

	 public void setDob(String dob) {
	  this.dob = dob;
	 }

	 public String getMobileNo() {
	  return mobileNo;
	 }

	 public void setMobileNo(String mobileNo) {
	  this.mobileNo = mobileNo;
	 }

	 public String getEmailId() {
	  return emailId;
	 }

	 public void setEmailId(String emailId) {
	  this.emailId = emailId;
	 }

	 @Override
	 public String toString() {
	  return "User [username=" + username + ", password=" + password
	    + ", firstName=" + firstName + ", lastName=" + lastName
	    + ", dob=" + dob + ", mobileNo=" + mobileNo + ", emailId="
	    + emailId + "]";
	 }
	}
