package composite_pattern;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class MadagascarLeaf extends BasicShape{
	
	double leafX=300;
	double leafY=760;
	double radiusX=500;
	double radiusY=500;
	Color color;
	public MadagascarLeaf(Color color,double leafX,double leafY,double radiusX,double radiusY) {
		
		this.leafX=leafX;
		this.leafY=leafY;
		this.radiusX=radiusX;
		this.radiusY=radiusY;
		this.color=color;
	}
	
	public void draw(GraphicsContext  gc) {
	
			
			
			
			
			 
			/*gc.setFill(Color.GRAY);
			gc.fillPolygon(new double[]{treeX,treeX+(treeHeight/3.5),treeX+(treeHeight/3.5),treeX+(treeHeight/7),treeX,treeX+(treeHeight/2),treeX+(treeHeight*.8),treeX+(treeHeight*.7),treeX+(treeHeight/7)},
		        			new double[]{treeY,treeY,treeY-treeHeight-5,treeY-treeHeight-5,treeY,treeY,treeY-treeHeight*.8,treeY-treeHeight*.8,treeY},9);
			 */
			gc.setFill(color);
			gc.setStroke(color);
			
			gc.fillOval(leafX,leafY,radiusX,radiusY);
			
			
			/*gc.fillOval(treeX-(treeHeight*.25),treeY-(treeHeight*1.8),treeHeight*.9,treeHeight*.8);
			gc.fillOval(treeX+(treeHeight*.55),treeY-treeHeight*1.2,treeHeight*.55,treeHeight*.5);*/
			 
			
	}

}
