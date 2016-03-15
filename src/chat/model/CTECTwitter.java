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
		chatbotTwitter.updateStatus("Forrest Thacker I just tweeted from my Java Chatbot program! #APCRocks @CTECNow thanks @cheerleader & @codyhenrichsen");
		//if boolean method set variable to true here
	}
	catch(TwitterException error)
	{
		baseController.handleErrors(error.getErrorMessage());
	}	 
	}


public String topResults(List<String> wordList)

public void loadTweets(String twitterhandle) throws TwitterException
{
	Paging statusPage = Paging(1, 200);
	int page = 1;
	while (page <= 10)
	{
		statusPage.setPage(page);
		statuses.addAll(chatbotTwitter.getUserTimeline(twitterHandle, statusPage));
		page++;
	}
	for (Status currentStatus : statuses)
	{
		String[] tweetText = currentStatus.getText().split("");
		for (String word : tweetText)
		{
			wordsList.add(removePuncuaton(word).toLowerCase());
		}
	}
	removeCommonEnglishWords(wordLists);
	
	private void removeEmptyText();

	private List removeCommonEglishWords(List<String> wordList)
	
	private String [] importWordsToArray()
	
	private void removeTwitterUsernamesFromList(List<String>wordList)
	
	private String RemovePuncuation(String currentString)
	{
		String punctuation = ".,'?!\(){}^<>-"; //think about adding
												// hashtag and @
		String scrubbedString = "";
		for(int i = 0; i < currentString.length(); i++)
		{
			if(punctuation.indexOf(currentString.charAt(i)) == -1)
			{
				scrubbedString.+=(currentString.charAt(i);
			}
		}
		return scrubbedString;
		
	}
	
	
	
}