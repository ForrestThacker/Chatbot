package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatView;

/**
 *  Controller for the Chatbot project.
 * @author ftha4681
 * @version 1.0 Added methods. 
 */
public class ChatController 
{
	private Chatbot simpleBot;
	private ChatView display;
	
	public ChatController()
	{
		display = new ChatView();
		String user = display.collectUserText("What is your name, handsome?");
		simpleBot = new Chatbot(user);
	}
	
	public void start()
	{
		display.displayText(simpleBot.getUserName());
	}
}
