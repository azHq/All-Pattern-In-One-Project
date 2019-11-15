package greenlandisland;

import flyweight.FlyWeightFactory;
import generalclasses.Flora;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class GreenlandFlora extends Flora {
	
	GraphicsContext gc;
	public GreenlandFlora(GraphicsContext gc) {
		
		this.gc=gc;
	}
	
	public  void createBigTree() {
		
		
		
		GreenLandBigTree greenLandBigTree=(GreenLandBigTree) FlyWeightFactory.getTree(Color.GREEN,1);
		greenLandBigTree.draw(gc);
		
		greenLandBigTree=(GreenLandBigTree) FlyWeightFactory.getTree(Color.web("#00BCD4"),1);
		greenLandBigTree.treeX=1400;
		greenLandBigTree.treeY=600;
		greenLandBigTree.treeWidthBottom=20;
		greenLandBigTree.treeHeight=70;
		
		
		greenLandBigTree.draw(gc);
	}
	public  void createGrass() {
		
	}

}
