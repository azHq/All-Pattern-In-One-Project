package madagascarisland;

import generalclasses.Flora;
import greenlandisland.GreenLandBigTree;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MadagascarFlora extends Flora{

	GraphicsContext gc;
	public MadagascarFlora(GraphicsContext gc) {
		
		this.gc=gc;
	}
	public void createFlora() { 
		
		createBigTree();
		createGrass();
	}
	
	public  void createBigTree() {
		
		new MadagascarBigTree(Color.GREEN,400,400,200).draw(gc);
	}
	public  void createGrass() {
		
	}

}
