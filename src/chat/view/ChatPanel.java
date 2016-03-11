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
	private JButton chatButton_1;
	private JTextArea chatArea;
	private JTextField chatTextField;
	private JLabel promptLabel;
	private JButton tweetButton;
	
	public ChatPanel(ChatController baseController)
	{
		setBackground(new Color(51, 204, 204));
		this.baseController = baseController;
		chatArea = new JTextArea (10,30);
		tweetButton = new JButton("Sned a tweet!");
		chatButton = new JButton("Send tweet!");
		chatButton_1 = new JButton("Submit your message to the chatbot!");
		chatButton_1.setBackground(SystemColor.scrollbar);
		chatTextField = new JTextField(30);
		baseLayout = new SpringLayout();
		promptLabel = new JLabel("Type to the chatbot of doom!");
		promptLabel.setBackground(Color.BLACK);
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, tweetButton, 0, SpringLayout.NORTH, chatButton_1);
		baseLayout.putConstraint(SpringLayout.WEST, tweetButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatTextField, -6, SpringLayout.NORTH, promptLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, promptLabel, 209, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, chatButton_1, 14, SpringLayout.SOUTH, promptLabel);
		baseLayout.putConstraint(SpringLayout.WEST, promptLabel, 120, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatArea, -6, SpringLayout.NORTH, chatTextField);
		baseLayout.putConstraint(SpringLayout.EAST, chatArea, 0, SpringLayout.EAST, chatTextField);
		baseLayout.putConstraint(SpringLayout.WEST, chatTextField, 40, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, chatButton_1, -19, SpringLayout.EAST, this);
	}

	
	private void setupPanel()
	{
		this.add(tweetButton);
		this.setLayout(baseLayout);
		this.add(chatButton_1);
		this.add(chatTextField);
		this.add(chatArea);
		this.add(promptLabel);
		chatArea.setEnabled(false);
		chatTextField.setToolTipText("Type in here for the chatbot");
	}
	
	private void setupListeners()
	{
		chatButton_1.addActionListener(new ActionListener()
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
		
		tweetButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
				{
					baseController.sendTweet("");
				}
	});
}
	
	public JButton getButton()
	{
		return chatButton_1;
	}
	
	public JTextField getTextField()
	{
		return chatTextField;
	}
}

	tweetButton.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent click)
		{
			baseController.sendTweet("No text to send");
		}
	});
	
	analyzeTwitterButton.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent click)
		{
			String user = typingField.getText();
			String results = baseController.analyze(user);
			chatArea.setText(results);
		}
		
	});
}

public JButton getButton()
{
	return testButton;
}
}