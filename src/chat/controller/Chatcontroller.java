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
		display.displayText("Hello " + simpleBot.getUserName());
		chat();
	}
	
	private void chat()
	{
		String conversation = display.collectUserText("What should we talk about today?");
		while(simpleBot.lengthChecker(conversation))
		{
			if(simpleBot.contentChecker(conversation))
			{
				display.displayText("Wow, I have no idea you loved " + simpleBot.getContent());
			}
			conversation = display.collectUserText(conversation);
		}
	}

}
