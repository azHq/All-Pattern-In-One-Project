package greenlandisland;

import generalclasses.Flora;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class GreenlandFlora extends Flora {
	
	GraphicsContext gc;
	public GreenlandFlora(GraphicsContext gc) {
		
		this.gc=gc;
	}
	
	public  void createBigTree() {
		
		
		GreenLandBigTree greenLandBigTree=new GreenLandBigTree.TreeBuilder()
				.setTreeX(400)
				.setTreeY(600)
				.setColor(Color.GREEN)
				.setTreeWidthBottom(20)
				.setTreeHeight(100)
				.build();
		greenLandBigTree.draw(gc);
	}
	public  void createGrass() {
		
	}

}
