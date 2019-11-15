package composite_pattern;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Leaf extends BasicShape{
	
	Color color;
	double X1,X2,Y1,Y2;
	double leafCenterX,leafCenterY;

	public Leaf(Color color,double X1,double Y1,double X2,double Y2,double leafCenterX,double leafCenterY) {

		this.color=color;
		this.X1=X1;
		this.X2=X2;
		this.Y1=Y1;
		this.Y2=Y2;
		this.leafCenterX=leafCenterX;
		this.leafCenterY=leafCenterY;
		
		
	}
	
	public void draw(GraphicsContext  gc) {
		
		
		
		gc.fill();
		gc.setFill(color);
		gc.closePath();
		gc.beginPath();
		gc.moveTo(leafCenterX,leafCenterY);
		gc.quadraticCurveTo(X1,Y1,X2, Y2);
		gc.stroke();
		gc.setLineWidth(3);
		gc.closePath();
		
		
		gc.setStroke(Color.BLUE);
		
	}

}
