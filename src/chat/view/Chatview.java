package chat.view;

import javax.swing.JOptionPane;

/**
 * Popup display class for the GUI interaction in the Chatbot project.
 * @author ftha4681
 *@ version 1.0 10/23/15
 */

public class ChatView
{
	
	public String collectUserText(String displayText)
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
