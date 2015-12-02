package chat.view;

import javax.swing.JFrame;
import chat.controller.ChatController;
import chat.view.ChatPanel;


public class ChatFrame extends JFrame
{
	private ChatController baseController;
	private ChatPanel basePanel;
	private String frameTitle;
	
	public ChatFrame(ChatController baseController)
	{
		this.baseController = baseController;
		basePanel = new ChatPanel(baseController);
		frameTitle ="Chatbot";
		
		setupFrame();
	}
	
	public ChatController getbaseController()
	{
		return baseController;
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400,400);
		this.setTitle("Forrest's Chatbot");
		this.setVisible(true);
		this.setResizable(false);
		this.setSize(500, 500);
	}
	
	
	public ChatController getBaseController()
	{
		return baseController;
	}
}
