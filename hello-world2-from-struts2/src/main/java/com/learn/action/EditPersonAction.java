package com.learn.action;

import com.learn.model.Person;
import com.learn.model.State;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class EditPersonAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Person personBean;

	@Override
	public String execute() throws Exception {
		if (personBean != null) {
			return Action.SUCCESS;
		} else {
			return Action.NONE;
		}
	}

	@Override
	public void validate() {
		if (personBean != null) {
			if (personBean.getFirstName().length() == 0) {
				addFieldError("personBean.firstName", "First name can not be empty");
			}
			if (personBean.getLastName().length() == 0) {
				addFieldError("personBean.lastName", "Last name can not be empty");
			}
		}
	}
	
	public String [] getFavoriteSports(){
		return new String [] {"football", "baseball", "basketball"};
	}
	
	public String getDefaultFavoriteSport() {
		return "basketball";
	}
	
	public String [] getGenders(){
		return new String [] {"male", "female", "not sure"};
	}
	
	public String getDefaultGender() {
		return "not sure";
	}
	
	public State [] getStates(){
		return new State [] {
				new State("AR", "Arizona"),
				new State("CA", "California"), 
				new State("FL", "Florida"), 
				new State("KA", "Kansas"),
				new State("NY", "New York")
		};
	}
	
	public String getDefaultState(){
		return "FL";
	}
	
	public boolean isDefaultOver21(){
		return true;
	}
	
	public String [] getCarModelsAvailable() {
		return new String [] {"Mazda", "Ford", "Toyota"};
	}
	
	public String [] getDefaultOwnedCarModels() {
		return new String [] {"Mazda"};
	}

	public Person getPersonBean() {
		return personBean;
	}

	public void setPersonBean(Person personBean) {
		this.personBean = personBean;
	}

}
