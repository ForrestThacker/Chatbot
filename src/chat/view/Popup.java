package chat.view;

import javax.swing.JOptionPane;


/**
 * This class provides popups for input and output.
 * @author ftha4681
 * @version 1.0 9/24/15
 */

public class Popup
{
	/**
	 * Provides a popup box for a asking a question and allows the user to submit a text answer.
	 * Returns the user's response as a String.
	 * @param input The supplied question for the popup.
	 * @return The user's answer to the supplied question
	 */
	public String getUserInput(String input)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, input);
		
		return answer;
	}
	/**
	 * Displays a response after answering.
	 * @param input What text you put into a response.
	 */
	public void displayResponse(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	
	}
	
}}

