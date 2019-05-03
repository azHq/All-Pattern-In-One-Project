package greenlandisland;

import composite_pattern.GreenLandBird;
import composite_pattern.GreenLandDeer;
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
		
		new GreenLandBird(Color.GRAY,300,300,150).draw(gc);
	}

	@Override
	public void createDeer() {
		
		new GreenLandDeer(Color.GRAY,400,400,200).draw(gc);
	}

}
