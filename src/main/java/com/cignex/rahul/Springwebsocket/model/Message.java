/**
 * 
 */
package com.cignex.rahul.Springwebsocket.model;

import java.io.Serializable;

/**
 * @author rahul.panchal
 *
 */
@SuppressWarnings("serial")
public class Message implements Serializable{
	
	private  String from;
	
	private  String text;
	
	

	/**
	 * 
	 */
	public Message() {
	}

	/**
	 * Constructs an Message Object
	 * @param from
	 * @param text
	 */
	public Message(String from, String text) {
		super();
		this.from = from;
		this.text = text;
	}

	/**
	 * From which user
	 * @return String
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * Message text
	 * @return
	 */
	public String getText() {
		return text;
	}

	/**
	 * Message in String
	 */
	@Override
	public String toString() {
		return "Message [from=" + from + ", text=" + text + "]";
	}
	
}
