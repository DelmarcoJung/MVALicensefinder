package com.mva.Driver;

import java.util.Date;

public class Driver {
	private String licensedNum;
	private Date dateOfBirth;
	private String name;
	private String address;
	private String age;

	public String getLicensedNum() {
		return licensedNum;
	}

	public void setLicensedNum(String licensedNum) {
		this.licensedNum = licensedNum;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Driver [licensedNum=" + licensedNum + ", dateOfBirth=" + dateOfBirth. + ", name=" + name + ", address="
				+ address + ", age=" + age + "]";
	}

	
	

	
}
