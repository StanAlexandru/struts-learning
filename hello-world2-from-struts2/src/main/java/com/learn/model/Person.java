package com.learn.model;

import java.util.Date;

/*
 * A Person object knows these things: 
 * first name, 
 * last name, 
 * favorite sport, 
 * gender, 
 * state of residency, 
 * is or is not over 21, 
 * and car models owned.
 */
public class Person {
	
	private String firstName;
	private String lastName;
	private String favoriteSport;
	private String stateOfResidence;
	private String gender;
	private int age;
	private String[] ownedCarModels;
	private Date birthDate;

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

	public String getFavoriteSport() {
		return favoriteSport;
	}

	public void setFavoriteSport(String favoriteSport) {
		this.favoriteSport = favoriteSport;
	}

	public String getStateOfResidence() {
		return stateOfResidence;
	}

	public void setStateOfResidence(String stateOfResidence) {
		this.stateOfResidence = stateOfResidence;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String[] getOwnedCarModels() {
		return ownedCarModels;
	}

	public void setOwnedCarModels(String[] ownedCarModels) {
		this.ownedCarModels = ownedCarModels;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
