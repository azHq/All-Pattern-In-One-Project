package composite_pattern;

import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;

public abstract  class CompositeShape implements IShape {

	ArrayList<IShape> shapes=new ArrayList<>();
	public abstract void buildShape();
	
	@Override
	public void draw(GraphicsContext  gc) {
		
		
	}
	
	

}
