package madagascarisland;

import flyweight.FlyWeightFactory;
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
		
		MadagascarBigTree shape=(MadagascarBigTree) FlyWeightFactory.getTree(Color.FORESTGREEN,2);
		shape.draw(gc);
		
		shape=(MadagascarBigTree) FlyWeightFactory.getTree(Color.FORESTGREEN,2);
		shape.treeX=360;
		shape.treeY=430;
		
		shape.draw(gc);
	}
	public  void createGrass() {
		
	}

}
