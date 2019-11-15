package Mediator;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class VillagerUser extends User {
	
	public VillagerUser(GraphicsContext gc,MediatorCafe mediator, double x, double y) {
		super(gc,mediator, x, y);
		
	}
	@Override
	public void sendMessage(String s,int type) {
		
		mediator.sendMessage(s,type);
		
	}

	@Override
	public void receiveMessage(String s) {
		
		gc.setFont(Font.font("Droid Sans", FontWeight.BOLD, 15));
		gc.fillText(s, x+50, y);
	}

}
