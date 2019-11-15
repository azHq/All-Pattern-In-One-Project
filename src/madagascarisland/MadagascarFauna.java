package madagascarisland;

import composite_pattern.GreenLandBird;
import composite_pattern.GreenLandSnake;
import composite_pattern.MadagascarBird;
import composite_pattern.MadagascarSnake;
import generalclasses.Fauna;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MadagascarFauna extends Fauna{
	
	GraphicsContext gc;
	public MadagascarFauna(GraphicsContext gc) {
		this.gc=gc;
	}

	@Override
	public void createBird() {
		
		new MadagascarBird(Color.YELLOW,300,80,100).draw(gc);
		new MadagascarBird(Color.YELLOW,420,120,100).draw(gc);
		new MadagascarBird(Color.YELLOW,300,150,100).draw(gc);
		new MadagascarBird(Color.YELLOW,520,120,100).draw(gc);
	}



	@Override
	public void createSnake() {
		
		new MadagascarSnake(Color.GRAY,400,400,200).draw(gc);
	}

}
