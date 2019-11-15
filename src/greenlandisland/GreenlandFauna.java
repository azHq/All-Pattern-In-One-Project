package greenlandisland;

import composite_pattern.GreenLandBird;
import composite_pattern.GreenLandSnake;
import generalclasses.Fauna;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class GreenlandFauna extends Fauna {

	GraphicsContext gc;
	public GreenlandFauna(GraphicsContext gc) {
		
		this.gc=gc;
	}
	@Override
	public void createBird() {
		
		new GreenLandBird(Color.GRAY,300,30,60).draw(gc);
		new GreenLandBird(Color.GRAY,300,80,60).draw(gc);
		new GreenLandBird(Color.GRAY,380,30,60).draw(gc);
		new GreenLandBird(Color.GRAY,450,30,60).draw(gc);
		new GreenLandBird(Color.GRAY,450,90,60).draw(gc);
		new GreenLandBird(Color.GRAY,650,90,60).draw(gc);
		new GreenLandBird(Color.GRAY,1380,30,60).draw(gc);
		new GreenLandBird(Color.GRAY,1450,30,60).draw(gc);
		new GreenLandBird(Color.GRAY,1450,90,60).draw(gc);
	}

	@Override
	public void createSnake() {
		
		
		
		new GreenLandSnake(Color.web("#9E9D24"),900,400,200).draw(gc);
	}

}
