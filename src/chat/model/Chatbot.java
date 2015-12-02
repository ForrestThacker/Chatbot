package chat.model;

import java.util.ArrayList;

/**
 * Base version of the 2015 Chatbot class. Only stub methods are provided. Students will complete methods as part
 * of the project.
 * @author ftha4681
 * @version 1.4 10/28/15 added wow meme method.
 * Added and completed contentChecker.
 */
public class Chatbot
{
	private ArrayList<String> memesList;
	private ArrayList<String> politicalTopicList;
	private String userName;
	private String content;
	
	/**
	 * Creates an instance of the Chatbot with the supplied username.
	 * @param userName The username for the chatbot.
	 */
	public Chatbot(String userName)
	{
		this.memesList = new ArrayList<String>();
		this.politicalTopicList = new ArrayList<String>();
		this.userName = userName;
		this.content = "Dark Souls";
		
		buildMemesList();
		buildPoliticalTopicsList();
	}
	
	private void buildMemesList()
	{
		this.memesList.add("high kermit");
		this.memesList.add("cute animals");
		this.memesList.add("doge");
		this.memesList.add("bad luck brian");
		this.memesList.add("scumbag steve");
		this.memesList.add("awkward penguin");
		this.memesList.add("success kid");
		this.memesList.add("leeroy jenkins");
		this.memesList.add("giant dad");
		this.memesList.add("insanity wolf");
	}
	
	private void buildPoliticalTopicsList()
	{
		this.politicalTopicList.add("election");
		this.politicalTopicList.add("Democrat");
		this.politicalTopicList.add("Republican");
		this.politicalTopicList.add("liberal");
		this.politicalTopicList.add("Conservative");
		this.politicalTopicList.add("Trump");
		this.politicalTopicList.add("Clinton");
		this.politicalTopicList.add("Biden");
		this.politicalTopicList.add("Carson");
		this.politicalTopicList.add("Rubio");
		this.politicalTopicList.add("Fiorina");
		this.politicalTopicList.add("Sanders");
		this.politicalTopicList.add("vote");
		this.politicalTopicList.add("11/8/16");
	}
	
	/**
	 * Checks the length of the supplied string. Returns false if the supplied String is empty or null,
	 * otherwise returns true. 
	 * @param currentInput
	 * @return A true or false based on the length of the supplied String.
	 */
	public boolean lengthChecker(String currentInput)
	{
		boolean hasLength = false;
		
		if(currentInput != null && currentInput.length() > 0)
		{
			hasLength = true;
		}
			
		return hasLength;
	}
	
	/**
	 * Checks if the supplied String matches the content area for this Chatbot instance.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether it matches the content area.
	 */
	public boolean contentChecker(String currentInput)
	{
		boolean hasContent = false;
		
		if(currentInput.contains(content))
		{
			hasContent = true;
		}
		
		return hasContent;
	}
	
	
	public boolean quitChecker(String currentInput)
	{
		boolean hasQuit = false;
		
		if(currentInput.equals ("quit"))
		{
			hasQuit = false;
		}
		
		if (currentInput.equals ("quit"))
		
		{
		hasQuit = true;	
		}
		
		return hasQuit;
}
	/**
	 * 
	 * Checks if supplied String matches ANY of the topics in the politicalTopicsList. Returns
	 * true if it does find a match and false if it does not match.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether the String is contained is a recognized meme.
	 */
	public boolean politicalTopicChecker(String currentInput)
	{
		return false;
	}
	
	public boolean keyboardMashChecker(String currentInput)
	{
		boolean isMash = false;
		
		if(currentInput.equals("sdf")  || currentInput.equals(",./") || currentInput.equals("dfg") || currentInput.equals("cvb"))
		{
			isMash = true;
		}
		
		return isMash;
	}
	
	public String processConversation(String currentInput)
		
	{
		String nextConversation = "oh, what else would you like to talk about my good chum? :^)";
		int randomTopic = (int) (Math.random() * 5); //This will generate a random number between 0 & 4.
		
		if(keyboardMashChecker(currentInput))
		{
			return "Stop mashing the keyboard!!";
		}
		
		switch (randomTopic)
		{
		case 0:
			if(contentChecker(currentInput))
			{
				nextConversation = "Hey, you talked about my special topic! That is neat! What else do you like?";
			}
			break;
		case 1:
			if(memeChecker(currentInput))
			{
				nextConversation = "That is a hot meme right now. What else do you like?";
			}
			break;
		case 2:
			if(politicalTopicChecker(currentInput))
			{
				nextConversation = "I like that too! Do you like video games?";
			}
			break;
		case 3:
			//Choose your own test here
			if(currentInput.length() > 23)
			{
				nextConversation = "I like video games too! Do you like to eat food?";
			}
			break;
		case 4:
			//Random topic for chat here
			nextConversation = "Eating is fun, I agree! Do you like to troll fat people?";
			break;
		default:
			//Never will happen!
			nextConversation = "That's fantastic! I'm so glad we like so many things!";
			break;
		}
		
			return nextConversation;
		}

	
	/**
	 * Checks to see that the supplied String value is in the current memesList variable.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether the supplied String is a recognized meme.
	 */

		public boolean memeChecker(String currentInput)
		{
			boolean hasMeme = false;
			
			for(String meme : memesList)
			{
				if(currentInput.toLowerCase().contains(meme.toLowerCase()))
				{
					hasMeme = true;
				}
			}
			
			return hasMeme;
		}
	
	/**
	 * Returns the username of this Chatbot instance.
	 * @return The username of the Chatbot.
	 */
	public String getUserName()
	{
		return userName;
	}
	
	/**
	 * Returns the content area for this Chatbot instance.
	 * @return The content area for this Chatbot instance.
	 */
	public String getContent()
	{
		return this.content=content;
	}
	
	/**
	 * Getter method for the memesList object.
	 * @return The reference to the meme list.
	 */
	public ArrayList<String> getMemesList()
	{
		return memesList;
	}
	
	/**
	 * Getter method for the politicalTopicList object.
	 * @return The reference to the political topic list.
	 */
	public ArrayList<String> getPoliticalTopicList()
	{
		return politicalTopicList;
	}
	
	/**
	 * Updates the content area for this Chatbot instance.
	 * @param content The updated value for the content area.
	 */
	public void setContent(String content)
	{
		this.content=content;
	}
}

