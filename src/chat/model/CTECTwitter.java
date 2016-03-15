package chat.model;


import java.awt.List;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

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


public String topResults(List wordList)

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
	
	private void removeEmptyText()
	{
		for(int spot = 0; spot < wordsList.size(); spot++)
		{
			if (wordsList.get(spot).quals(""))
			{
				wordsList.remove(spot);
				spot--;
			}
		}
	}

	private List removeCommonEglishWords(List<String> wordList)
	@SuppressWarnings("unchecked")
	private List removeCommonEnglishWords(List<String> wordList)
	{
		String[] boringWords = importWordsToArray();
		
		for (int cout = 0; count < wordList.size(); count++)
		{
			for (int removeSpot = 0; removeSpot < boringWords.length; removepot++)
			{
				wordList.remove(count);
				count--;
				removeSpot = boringWords.length; //Exit the inner loop. 
			}
		}
	}
	//comment this if you want to keep Twitter usernames in your word list.
	private String [] importWordsToArray()
	{
		String[] boringWords;
		int wordCount = 0;
		try
		{
			Scanner wordFile = new Scanner(new File("commonWords.txt"));
			while (wordFile.hasNext())
			{
				wordCount++;
				wordFile.next();
			}
			wordFile.reset();
			boringWords = new String[wordCount];
			int boringWordCount =0;
			while (wordFile.hasNext())
			{
				boringWords[boringWordCount] = wordFile.next();
				boringWordCount++;
			}
			wordFile.close();
		}
		catch (FileNotFoundException e)
		{
			baseController.handleErrors(e.getMessage());
			return new String[0];
		}
		return boringWords;
	}
	
	private void removeTwitterUsernamesFromList(List<String>wordList)
	{
		for (int wordCount = 0; wordCount < wordList.size(); wordCount++)
		{
			if(wordList.get(wordCount).length() >= 1 && wordList.get(wordCount).charAt(0) == '@')
			{
				wordList.remove(wordCount);
				wordCount--;
			}
		}
			
	}
	
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