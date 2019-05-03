package greenlandisland;

import java.util.ArrayList;

import composite_pattern.CompositeShape;
import composite_pattern.IShape;
import composite_pattern.Leaf;
import composite_pattern.Shoot;
import greenlandisland.GreenLandBigTree.TreeBuilder;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class GreenlandHut extends CompositeShape {

	ArrayList<IShape> shapes=new ArrayList<>();
	Color color;
	
	public GreenlandHut() {
		
		
		
			
	}
	@Override
	public void buildShape() {
		
		
	}
	
	
	
	@Override
	public void draw(GraphicsContext  gc) {
		
		buildShape();
		
		for(IShape shape:shapes) {
			
			shape.draw(gc);
		}
		
	}
}
