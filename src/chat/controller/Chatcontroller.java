package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatView;
import chat.view.*;
import chat.model.CTECTwitter;

/**
 *  Controller for the Chatbot project.
 * @author ftha4681
 * @version 1.3 Added twitter methods 
 */
public class ChatController 
{
	private Chatbot simpleBot;
	private ChatView display;
	private ChatFrame baseFrame;
	private CTECTwitter myTwitter;
	
	public ChatController()
	
	{	myTwitter = new CTECTwitter(this);
		display = new ChatView();
		String user = display.collectUserText("What is your name, handsome?");
		simpleBot = new Chatbot(user);
		baseFrame = new ChatFrame(this);
	}
	
	public void start()
	{
		display.displayText("Hello " + simpleBot.getUserName());
		//chat();
	}
	
	public  ChatController getChatbot()
	{
		return this;
	}
	
	public ChatView getChatView()
	{
		return display;
	}
	
	public ChatFrame getBaseFrame()
	{
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

	public String fromUserToChatbot(String conversation)
	{
		String botResponse = "";
		
		if(simpleBot.quitChecker(conversation))
		{
			shutDown();
		}
		
		botResponse = simpleBot.processConversation(conversation);
		
		return botResponse;
	}
	
	private void shutDown()
	{
		display.displayText("Goodbye, " + simpleBot.getUserName() + "It was nice to talk to you!");
		System.exit(0);
	}
	
	public void handleErrors(String error)
	{
		display.displayText(error);
	}
	
	public void sendTweet(String tweet)
	{
		myTwitter.sendTweet(tweet);
	}
}
