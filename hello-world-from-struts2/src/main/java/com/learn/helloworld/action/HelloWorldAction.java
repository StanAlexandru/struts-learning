package com.learn.helloworld.action;

import org.apache.commons.lang3.StringUtils;

import com.learn.helloworld.model.MessageStore;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private MessageStore messageStore;

	private static int helloCount = 0;

	public String execute() {

		if (messageStore != null && StringUtils.isNotEmpty(messageStore.getUsername())) {
			messageStore.setMessage("Hello " + messageStore.getUsername());
		} else {
			messageStore = new MessageStore();
			messageStore.setMessage("Hello World!");
		}
		
		helloCount++;

		return Action.SUCCESS;
	}

	public MessageStore getMessageStore() {
		return messageStore;
	}

	public void setMessageStore(MessageStore messageStore) {
		this.messageStore = messageStore;
	}

	public int getHelloCount() {
		return helloCount;
	}

}
