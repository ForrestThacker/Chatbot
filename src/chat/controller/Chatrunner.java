package chat.controller;

import chat.controller.ChatController;
/**
 * Starts the Chatbot program.
 * @author ftha4681
 *@ version 1.0 10/21/15
 */
public class Chatrunner
{
	public static void main (String [] args) 
	{
		ChatController myChatcontroller = new ChatController();
		myChatcontroller.start();
	}
	
}
