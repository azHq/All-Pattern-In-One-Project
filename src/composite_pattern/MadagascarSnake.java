package composite_pattern;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class MadagascarSnake extends BasicShape {
	
	double x=400;
	double y=400;
	double length=200;
	Color color;
	public MadagascarSnake(Color color,double x,double y,double length) {
		
		this.x=x;
		this.y=y;
		this.length=length;
		this.color=color;
	}
	@Override
	public void draw(GraphicsContext  gc) {
	
		
		
		//main
		gc.setStroke(color);	
		gc.setFill(color);	
		gc.setLineWidth(length*.04);
		gc.fill();
	
		gc.beginPath();	
	
		gc.moveTo(x,y);
		gc.quadraticCurveTo(x+length*.25,y-length*.25,x+length*.5,y);
		gc.quadraticCurveTo(x+length*.75,y+length*.25,x+length,y);
		gc.moveTo(x+length,y);
		
		gc.translate(x+length,y);
		gc.fillOval(-2,-8,length*.11,length*.07);
		gc.translate(-(x+length),-400);
		gc.rotate(-30);
		gc.rotate(30);
		
		
		
		gc.stroke();
		gc.closePath();
		
		
		
	
		
		
	
		
	}
}
