package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatView;
import chat.view.ChatFrame;

/**
 *  Controller for the Chatbot project.
 * @author ftha4681
 * @version 1.0 Added methods. 
 */
public class ChatController 
{
	private Chatbot simpleBot;
	private ChatView display;
	private ChatFrame baseFrame;
	
	public ChatController()
	
	{
		display = new ChatView();
		String user = display.collectUserText("What is your name, handsome?");
		simpleBot = new Chatbot(user);
	}
	
	public void start()
	{
		display.displayText("Hello " + simpleBot.getUserName());
		chat();
	}
	
	public  ChatController getChatbot(){
		return this;
	}
	
	public ChatView getChatView(){
		return display;
	}
	
	public ChatFrame getBaseFrame(){
		return baseFrame;
		
	}
	
	private void chat()
	{
		String conversation = display.collectUserText("What should we talk about today?");
		while(simpleBot.lengthChecker(conversation))
		{
			conversation = simpleBot.processConversation(conversation);
			conversation = display.collectUserText(conversation);
		}
	}

	
}
