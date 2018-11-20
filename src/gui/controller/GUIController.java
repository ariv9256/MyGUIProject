package gui.controller;

import gui.model.Cat;
import gui.view.CatFrame;

public class GUIController
{
	private Cat myCat;
	private CatFrame appFrame;
	
	
	public GUIController()
	{
		myCat = new Cat();
		
		appFrame = new CatFrame();
	}
	public void start()
	{
		
	}
}
