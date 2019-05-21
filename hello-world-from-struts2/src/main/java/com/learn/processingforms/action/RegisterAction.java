package com.learn.processingforms.action;

import org.apache.struts2.convention.annotation.Result;

import com.learn.processingforms.model.Person;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

@org.apache.struts2.convention.annotation.Action(value = "register", results = {
		@Result(name = "success", location = "/thankYou.jsp"),
		@Result(name = "input", location = "/register.jsp") 
	}
)
public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Person personBean;

	@Override
	public String execute() throws Exception {

		// call Service class to store personBean's state in database
		if (personBean != null) {
			return Action.SUCCESS;
		} else {
			return Action.INPUT;
		}
	}

	@Override
	public void validate() {
		if (personBean != null) {
			if (personBean.getFirstName().length() == 0) {
				addFieldError("personBean.firstName", "First name is required.");
			}

			if (personBean.getEmail().length() == 0) {
				addFieldError("personBean.email", "Email is required.");
			}

			if (personBean.getAge() < 18) {
				addFieldError("personBean.age", "Age is required and must be 18 or older");
			}
		}
	}

	public Person getPersonBean() {
		return personBean;
	}

	public void setPersonBean(Person personBean) {
		this.personBean = personBean;
	}

}
