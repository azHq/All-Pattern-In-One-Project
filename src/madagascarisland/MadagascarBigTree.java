package madagascarisland;

import java.util.ArrayList;

import composite_pattern.Circle;
import composite_pattern.CompositeShape;
import composite_pattern.IShape;
import composite_pattern.MadagascarLeaf;
import composite_pattern.MadagascarShoot;
import composite_pattern.Rectangle;
import composite_pattern.Shoot;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class MadagascarBigTree extends CompositeShape{
	
	
	double treeX,treeY,treeHeight;
	Color color;
	public MadagascarBigTree(Color color,double treeX,double treeY,double treeHeight) {		
		
		this.treeX=treeX;
		this.treeY=treeY;
		this.treeHeight=treeHeight;
		this.color=color;
	}
	
	@Override
	public void buildShape() {
		
		shapes.add(new MadagascarShoot(color,treeX,treeY,treeHeight));
		shapes.add(new MadagascarLeaf(color,treeX-(treeHeight*.20),treeY-(treeHeight*1.7),treeHeight*.94,treeHeight*.9));
		shapes.add(new MadagascarLeaf(color,treeX+(treeHeight*.55),treeY-treeHeight*1.2,treeHeight*.55,treeHeight*.5));
		
	}
	
	
	

}
