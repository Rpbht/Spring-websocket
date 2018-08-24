/**
 * 
 */
package com.cignex.rahul.Springwebsocket.model;

import java.io.Serializable;

/**
 * Model class for output
 * @author rahul.panchal
 *
 */
@SuppressWarnings("serial")
public class OutputMessage implements Serializable{
	
	/**
	 * From user
	 */
	private  String fromUser;
	
	/**
	 * Message text
	 */
	private  String messageText;
	
	/**
	 * time
	 */
	private  String time;
	
	

	/**
	 * 
	 */
	public OutputMessage() {
	}

	/**
	 * @param fromUser
	 * @param messageText
	 * @param time
	 */
	public OutputMessage(String fromUser, String messageText, String time) {
		this.fromUser = fromUser;
		this.messageText = messageText;
		this.time = time;
	}

	/**
	 * @return the fromUser
	 */
	public String getFromUser() {
		return fromUser;
	}

	/**
	 * @return the messageText
	 */
	public String getMessageText() {
		return messageText;
	}

	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OutputMessage [fromUser=" + fromUser + ", messageText=" + messageText + ", time=" + time + "]";
	}

}
