package composite_pattern;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends BasicShape{
	
	double centerX;
	double centerY;
	double radiusX;
	double radiusY;
	Color color;
	
	public Circle(Color color,double centerX,double centerY,double radiusX,double radiusY) {
		
		this.centerX=centerX;
		this.centerY=centerY;
		this.radiusX=radiusX;
		this.radiusY=radiusY;
		this.color=color;
	}
	
	@Override
	public void draw(GraphicsContext  gc) {
			
		gc.setFill(color);
		gc.fillOval(centerX,centerY,radiusX,radiusY);
	}
	
}