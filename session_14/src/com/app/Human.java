package com.app;

public class Human {
	private Heart heart;
	public Human() {
		
	}
	public Human(Heart heart) {
		System.out.println("In Constructor");
		this.heart=heart;
	}
	public void setHeart(Heart heart) {
		System.out.println("In Setter of Human");
		this.heart=heart;
	}
	public void pump() 
	{
		if(heart!=null)
		{
			heart.pumping();
		}
		else
		{
			System.out.println("You are Dead!!!");
		}
	}

}
