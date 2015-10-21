package chat.view;

import javax.swing.JOptionPane;

public class Chatview 
/**
 * 
 */
{
	
	public String CollectUserTest(String displayText)
	{
		String userInput;
		
		userInput = JOptionPane.showInputDialog(null, displayText);
	
		return userInput;
	}
	
	public void displayText(String displayText)
	{
		JOptionPane.showMessageDialog(null,  displayText);
	}
}
