package composite_pattern;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MadagascarShoot extends BasicShape{
	
	double treeX,treeY,treeHeight;
	Color color;
	public MadagascarShoot(Color color,double treeX,double treeY,double treeHeight) {
		
		this.color=color;
		this.treeX=treeX;
		this.treeY=treeY;
		this.treeHeight=treeHeight;
		
	}
	@Override
	public void draw(GraphicsContext  gc) {
			
		gc.setFill(Color.GRAY);
		gc.fillPolygon(new double[]{treeX,treeX+(treeHeight/3.5),treeX+(treeHeight/3.5),treeX+(treeHeight/7),treeX,treeX+(treeHeight/2),treeX+(treeHeight*.8),treeX+(treeHeight*.7),treeX+(treeHeight/7)},
	        			new double[]{treeY,treeY,treeY-treeHeight-5,treeY-treeHeight-5,treeY,treeY,treeY-treeHeight*.8,treeY-treeHeight*.8,treeY},9);
	}
	

}
