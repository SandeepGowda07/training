package com.dao;

public class User {
	private String userName;
	private String emailId;
	private String dob;
	private int age;
	private String password;
	private int userId;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(String userName, String emailId, String dob, int age, String password) {
		super();
		this.userName = userName;
		this.emailId = emailId;
		this.dob = dob;
		this.age = age;
		this.password = password;
	}

	public User(String userName, String emailId, String dob, int age, String password, int userId) {
		super();
		this.userName = userName;
		this.emailId = emailId;
		this.dob = dob;
		this.age = age;
		this.password = password;
		this.userId = userId;
	}

	

}
