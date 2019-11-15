package composite_pattern;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Polygone extends BasicShape{
	
	double[] xPoints,yPoints;
	Color color;
	
	public Polygone(Color color,double[] xPoints,double[] yPoints) {
		
		this.color=color;
		this.xPoints=xPoints;
		this.yPoints=yPoints;
	}
	
	@Override
	public void draw(GraphicsContext  gc) {
		
	
		gc.setFill(color);
		gc.fillPolygon(xPoints, yPoints, xPoints.length);
		 
	}
	

}
