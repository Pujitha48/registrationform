package com.register;

public class Details {
	private String fname;
	private String lname;
	private String email;
	private String country;
	private String password;
	public Details(String fname,String lname,String email,String country,String password)
	{
		this.fname=fname;
		this.lname=lname;
		this.email=email;
		this.country=country;
		this.password=password;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
