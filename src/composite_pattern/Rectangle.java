package composite_pattern;

import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;



public class Rectangle extends BasicShape{
	
	double X1,Y1,height,width,radius;
	Color color;
	public Rectangle(Color color,double X1,double Y1,double width,double height,double radius) {
		
		this.color=color;
		this.height=height;
		this.X1=X1;
		this.Y1=Y1;
		this.width=width;
		this.radius=radius;
	
	}

	
	@Override
	public void draw(GraphicsContext  gc) {
		
		gc.setFill(color);
		gc.fillRoundRect(X1, Y1,width, height, radius, radius);
		 
	}
}
