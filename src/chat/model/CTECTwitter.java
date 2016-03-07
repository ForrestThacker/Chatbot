package chat.model;


import java.util.ArrayList;
import twitter4j.*;
/**
 * 
 * @author ftha4681
 * @ version 1.0
 * Constructored new lists
 */
public class CTECTwitter 

{
	private ArrayList<Status> statusList;
	private ArrayList<String> wordList;


	public CTECTwitter()
	{
		this.statusList = new ArrayList<Status>();
		this.wordList = new ArrayList<String>();
	}
}