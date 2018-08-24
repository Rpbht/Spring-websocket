/**
 * 
 */
package com.cignex.rahul.Springwebsocket.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cignex.rahul.Springwebsocket.model.Message;
import com.cignex.rahul.Springwebsocket.model.OutputMessage;

/**
 * Controller class for output
 * 
 * @author rahul.panchal
 */
@MessageMapping
@Controller
@RequestMapping("/")
public class MessageController {
	
	/**
	 * 
	 * @return view 
	 */
	@GetMapping
	public String home() {
		return "/views/chat.jsp";
	}
	
	/**
	 * @param message
	 * @return
	 * @throws Exception
	 */
	@MessageMapping("/chat")
	@SendTo("/topic/messages")
	public OutputMessage send(Message message) throws Exception {
		String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
		return new OutputMessage(message.getFrom(), message.getText(), time);
	}

}
