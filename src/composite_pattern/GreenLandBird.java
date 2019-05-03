package composite_pattern;

import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class GreenLandBird extends CompositeShape{
	
	ArrayList<IShape> shapes=new ArrayList<>();
	double birdX,birdY,birdSize;
	Color color;
	public GreenLandBird(Color color,double birdX,double birdY,double birdSize) {		
		
		this.birdX=birdX;
		this.birdY=birdY;
		this.birdSize=birdSize;
		this.color=color;
	}
	
	@Override
	public void buildShape(){
		
		shapes.add(new Circle(color,birdX,birdY,birdSize,birdSize*.1));
		shapes.add(new Rectangle(color,birdX+birdSize*.7,birdY-birdSize*.1,birdSize*.09,birdSize*.3,10));
	
		
		
	}
	
	@Override
	public void draw(GraphicsContext  gc) {
		
		buildShape();
		for(IShape shape:shapes) {
			
			shape.draw(gc);
		}
	}
	
}
