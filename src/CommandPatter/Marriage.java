package CommandPatter;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Marriage {
	GraphicsContext gc;
	public Marriage(GraphicsContext gc) {
		this.gc=gc;
	}

	public void write(String s,double x,double y) {
		
		gc.setFill(Color.WHITE);
    	gc.setFont(Font.font("Droid Sans", FontWeight.BOLD, 15));
		gc.fillText(s, x, y);
	}
	
	public void clear(String s,double x,double y) {
		
		gc.clearRect(x-10,y-10,180,15);
		
		
	}
	
	public void startMarriage() {
		
		gc.setFill(Color.BLACK);
		gc.fillRect(900,550,200,300);
		this.gc=gc;
	}
	public void stopMarriage() {
		
		gc.setFill(Color.GREEN);
		gc.fillRect(900,550,200,300);
	}
	

}
