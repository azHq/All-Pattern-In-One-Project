package greenlandisland;

import java.util.ArrayList;

import composite_pattern.Circle;
import composite_pattern.CompositeShape;
import composite_pattern.IShape;
import composite_pattern.Leaf;
import composite_pattern.Rectangle;
import composite_pattern.Shoot;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class GreenLandBigTree extends CompositeShape {

	ArrayList<IShape> shapes=new ArrayList<>();
	Color color;
	double treeHeight=100;
	double treeWidthTop=10;
	double treeWidthBottom=20;
	double[][] leafinfo=new double[7][5];
	double treeX,treeY;
	double leafCenterX;
	double leafCenterY;
	public GreenLandBigTree(TreeBuilder treebulider) {
		
		this.treeHeight=treebulider.treeHeight;
		this.treeWidthTop=treebulider.treeWidthTop;
		this.treeWidthBottom=treebulider.treeWidthBottom;
		this.color=treebulider.color;
		this.treeX=treebulider.treeX;
		this.treeY=treebulider.treeY;
		leafCenterX=treeX+(treeWidthBottom/2);
		leafCenterY=treeY-treeHeight;
		
		System.out.println(leafCenterX+","+leafCenterY);
		
			
	}
	@Override
	public void buildShape() {
		
		shapes.add(new Shoot(color,treeX,treeY,treeWidthTop,treeWidthBottom,treeHeight));
		
		//rigt side
		shapes.add(new Leaf(color,leafCenterX+(treeWidthBottom*.2), leafCenterY-(treeWidthBottom*9),leafCenterX+(treeHeight*1.5), leafCenterY-treeWidthBottom*4.2,leafCenterX,leafCenterY));
		shapes.add(new Leaf(color,leafCenterX+(treeWidthBottom*.4), leafCenterY-(treeWidthBottom*7),leafCenterX+(treeHeight*1.5), leafCenterY-treeWidthBottom*1.5,leafCenterX,leafCenterY));
		shapes.add(new Leaf(color,leafCenterX+(treeWidthBottom*1.9), leafCenterY-(treeWidthBottom*5),leafCenterX+(treeHeight*1.5), leafCenterY+treeWidthBottom*1.5,leafCenterX,leafCenterY));
		
		
		//left side
		shapes.add(new Leaf(color,leafCenterX-(treeWidthBottom*.2), leafCenterY-(treeWidthBottom*9),leafCenterX-(treeHeight*1.5), leafCenterY-treeWidthBottom*4.2,leafCenterX,leafCenterY));
		shapes.add(new Leaf(color,leafCenterX-(treeWidthBottom*.4), leafCenterY-(treeWidthBottom*7),leafCenterX-(treeHeight*1.5), leafCenterY-treeWidthBottom*1.5,leafCenterX,leafCenterY));
		shapes.add(new Leaf(color,leafCenterX-(treeWidthBottom*1.9), leafCenterY-(treeWidthBottom*5),leafCenterX-(treeHeight*1.5), leafCenterY+treeWidthBottom*1.5,leafCenterX,leafCenterY));
		
		
		//middle
		shapes.add(new Leaf(color,leafCenterX, leafCenterY-(treeWidthBottom*5),leafCenterX, leafCenterY-treeHeight*1.4,leafCenterX,leafCenterY));
		
	}
	
	
	
	@Override
	public void draw(GraphicsContext  gc) {
		
		buildShape();
		
		for(IShape shape:shapes) {
			
			shape.draw(gc);
		}
		
	}
	
	public static class TreeBuilder{
		
		
		Color color=Color.GREEN;
		double treeX=400;
		double treeY=600;
		double treeHeight=100;
		double treeWidthTop=10;
		double treeWidthBottom=20;
	
		
		public Color getColor() {
			return color;
		}
		public TreeBuilder setColor(Color color) {
			this.color = color;
			
			return this;
		}
		
		public TreeBuilder setTreeHeight(double treeHeight) {
			this.treeHeight = treeHeight;
			
			return this;
		}
		
		public TreeBuilder setTreeWidthTop(double treeWidthTop) {
			this.treeWidthTop = treeWidthTop;
			
			return this;
		}
		
		public TreeBuilder setTreeX(double treeX) {
			this.treeX = treeX;
			
			return this;
		}
		public TreeBuilder setTreeY(int treeY) {
			this.treeY = treeY;
			
			return this;
		}
		public TreeBuilder setTreeWidthBottom(double treeWidthBottom) {
			this.treeWidthBottom = treeWidthBottom;
			
			return this;
		}
		
		public  GreenLandBigTree build() {
			
			return new GreenLandBigTree(this);
		}
		
		
	}
}
