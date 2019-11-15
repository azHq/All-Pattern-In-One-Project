package composite_pattern;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Shoot extends BasicShape{
	
	double treeHeight=100;
	double treeWidthTop=10;
	double treeWidthBottom=20;
	double treeX,treeY;
	Color color;
	public Shoot(Color color,double treeX,double treeY,double treeWidthTop,double treeWidthBottom,double treeHeight) {
		
		this.color=color;
		this.treeX=treeX;
		this.treeY=treeY;
		this.treeWidthTop=treeWidthTop;
		this.treeWidthBottom=treeWidthBottom;
		this.treeHeight=treeHeight;
	}
	
	@Override
	public void draw(GraphicsContext  gc) {
		
		 gc.setFill(Color.GRAY);
		 gc.fillPolygon(new double[]{treeX,treeX+treeWidthBottom,treeX+((treeWidthTop-(treeWidthTop/5))*2),treeX+(treeWidthTop/2)},
	        		new double[]{treeY,treeY,treeY-treeHeight,treeY-treeHeight},4);
		
	}
}
