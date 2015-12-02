package chat.view;

import javax.swing.*;
import chat.controller.ChatController;
import java.awt.event.*;
import java.awt.*;

public class ChatPanel extends JPanel 
{
	private ChatController baseController;
	private SpringLayout baseLayout;
	private JButton chatButton;
	private JTextArea chatArea;
	private JTextField chatTextField;
	private JLabel promptLabel;
	
	public ChatPanel(ChatController baseController)
	{
		setBackground(new Color(51, 204, 204));
		this.baseController = baseController;
		chatArea = new JTextArea (10,30);
		chatButton = new JButton("Submit your message to the chatbot!");
		chatButton.setBackground(SystemColor.scrollbar);
		chatTextField = new JTextField(30);
		baseLayout = new SpringLayout();
		baseLayout.putConstraint(SpringLayout.WEST, chatTextField, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatTextField, -97, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, chatButton, -10, SpringLayout.EAST, this);
		promptLabel = new JLabel("Type to the chatbot of doom!");
		baseLayout.putConstraint(SpringLayout.NORTH, chatButton, 20, SpringLayout.SOUTH, promptLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, promptLabel, 6, SpringLayout.SOUTH, chatTextField);
		baseLayout.putConstraint(SpringLayout.WEST, promptLabel, 120, SpringLayout.WEST, this);
		promptLabel.setBackground(Color.BLACK);
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupLayout()
	{
		
	}

	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(chatButton);
		this.add(chatTextField);
		this.add(chatArea);
		this.add(promptLabel);
		chatArea.setEnabled(false);
		chatTextField.setToolTipText("Type in here for the chatbot");
	}
	
	private void setupListeners()
	{
		chatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				//Grab user text	x
				//send the text to the controller	x
				//text to chatbot to process	x
				//display users text	x
				//get chatbots answer	x
				//display answer	x
				//clear user field	x
				String userText = chatTextField.getText();	//Grab user text x
				String response = baseController.fromUserToChatbot(userText); //send the text to the controller x give
				chatArea.append("\nUser: " + userText); // displays user text x
				chatArea.append("\nChatbot" + response);
				chatTextField.setText("");
			}
		});
	}
	
	public JButton getButton()
	{
		return chatButton;
	}
	
	public JTextField getTextField()
	{
		return chatTextField;
	}
}
