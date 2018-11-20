package gui.view;

import java.awt.Color;

import javax.swing.JFrame;
import gui.controller.GUIController;

public class CatFrame extends JFrame
{
	private GUIController appController;
	private CatPanel appPanel;
	
	public CatFrame()
	{
		super();
		this.appController = appController;
		this.appPanel = new CatPanel(appController);
		
		setupFrame();
	}
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(800, 800);
		this.setBackground(Color.red);
		this.setTitle("There is an invisible cat here, I promise.");
		this.setResizable(true);
		this.setVisible(true);
	}
}
