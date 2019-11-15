package Observer;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Subjects {
	
	public double x,y;
	GraphicsContext gc;
	
	public Subjects(GraphicsContext gc,double x,double y) {
		
		this.gc=gc;
		this.x=x;
		this.y=y;
	}
	
	public void notify(String s) {
		
		gc.setFill(Color.WHITE);
		gc.setFont(Font.font("Droid Sans", FontWeight.BOLD, 15));
		gc.fillText(s,x+50, y);
		
		System.out.println(s+":"+x+","+y);
	}
	
	

}
