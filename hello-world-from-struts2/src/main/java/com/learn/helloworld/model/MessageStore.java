package com.learn.helloworld.model;

import org.apache.commons.lang3.StringUtils;

public class MessageStore {
	private String message;
	private String username;

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "MessageStore [message=" + message + ", username=" + username + "]" + " (from toString)";
	}

}
