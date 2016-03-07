package chat.model;


import java.util.ArrayList;

import chat.controller.ChatController;
import twitter4j.*;
/**
 * @date Mar 7 2016
 * @author ftha4681
 * @version 1.0
 * Constructed new lists
 */
public class CTECTwitter
{
	private ArrayList<Status> statusList;
	private ArrayList<String> wordList;
	private Twitter chatbotTwitter;
	private ChatController baseController;

 
	public CTECTwitter(ChatController baseController) 
	{
		this.baseController = baseController;
		this.statusList = new ArrayList<Status>();
		this.wordList = new ArrayList<String>();
		this.chatbotTwitter = TwitterFactory.getSingleton();
	}
	
	public void sendTweet(String message)
{
	 try
	{
		chatbotTwitter.updateStatus("I just tweeted from my Java Chatbot program! #APCRocks @CTECNow thanks @cheerleader & @codyhenrichsen");
		//if boolean method set variable to true here
	}
	catch(TwitterException error)
	{
		baseController.handleErrors(error.getErrorMessage());
	}	 
	}
}