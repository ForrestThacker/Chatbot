package chat.view;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 * Popup display class for the GUI interaction in the Chatbot project.
 * @author ftha4681
 *@ version 1.2 10/23/15 Added icon to input window.
 */

public class ChatView
{
	private String windowMessage;
	private ImageIcon chatIcon;
	
	public ChatView()
	{
		windowMessage = "This is a message brought to you by GhostBot!";
		chatIcon = new ImageIcon(getClass().getResource("images/GhostBot.png"));
	}
	/**
	 * Displays a GUI popup for collecting user text with the supplied String.
	 *Usually in the form of a question to collect for further use in the program.
	 *@param displayText The text to show in the popup window. Should be a question.
	 * @return The text supplied by the user.
	 */
	
	public String collectUserText(String displayText)
	{
		String userInput;
		
		userInput = JOptionPane.showInputDialog(null, displayText, windowMessage, 
				JOptionPane.INFORMATION_MESSAGE, chatIcon, null,
				"Type here, please").toString();
	
		return userInput;

	}
	
	/**
	 * Displays a String to the user with a standrad popup.
	 * @param displayText The supplied text to be displayed.
	 */
	
	public void displayText(String displayText)
	{
		JOptionPane.showMessageDialog(null, displayText);
	}
}
