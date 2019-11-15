package Mediator;

import javafx.scene.canvas.GraphicsContext;

public abstract class User{
	
	public MediatorCafe mediator;
	public double x,y;
	public GraphicsContext gc;
	public User(GraphicsContext gc,MediatorCafe mediator,double x,double y) {
		
		this.mediator=mediator;
		this.x=x;
		this.y=y;
		this.gc=gc;
		
	}
	
	public abstract void sendMessage(String s,int type);

	public abstract void receiveMessage(String s);
}
