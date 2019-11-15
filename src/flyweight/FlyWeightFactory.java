package flyweight;

import java.util.HashMap;

import builder.GreenLandHutBuilder;
import builder.MadagascarHutBuilder;
import composite_pattern.GreenLandBird;
import composite_pattern.IShape;
import greenlandisland.GreenLandBigTree;
import greenlandisland.GreenLandRuralHut;
import javafx.scene.paint.Color;
import madagascarisland.MadagascarBigTree;

 public class FlyWeightFactory {
	
	public  static HashMap<Color,IShape> tree=new HashMap<Color,IShape>();
	public  static HashMap<Color,FlyHut> hut=new HashMap<Color,FlyHut>();
	public  static HashMap<Color,IShape> bird=new HashMap<Color,IShape>();
	
	public static IShape getTree(Color bodyColor,int type) {
		
		IShape shape=tree.get(bodyColor);
		
		if(shape==null&&type==1) {
			
					shape=new GreenLandBigTree.TreeBuilder()
					.setTreeX(220)
					.setTreeY(250)
					.setColor(bodyColor)
					.setTreeWidthBottom(20)
					.setTreeHeight(80)
					.build();
					
					tree.put(bodyColor,shape);
			
		}
		else if(shape==null&&type==2) {
			
			shape=new MadagascarBigTree(bodyColor,200,300,150);
			tree.put(bodyColor,shape);
		}
		
		return shape;
	}
	public static IShape getHut(Color bodyColor,int type) {
		
		FlyHut shape=hut.get(bodyColor);
		
		if(shape==null&&type==1) {
			
			GreenLandHutBuilder builder=new GreenLandHutBuilder();
			builder.createHut();
			shape=builder.build();
			shape.setBodyColor(bodyColor);
			hut.put(bodyColor,shape);
			
		}
		else if(shape==null&&type==2) {
			
			MadagascarHutBuilder builder=new MadagascarHutBuilder();
			builder.createHut();
			shape=builder.build();
			shape.setBodyColor(bodyColor);
			hut.put(bodyColor,shape);
		}
		
		return shape;
	}
	
	public static IShape getBird(Color bodyColor) {
		
		IShape shape=bird.get(bodyColor);
		
		if(shape==null) {
			
			shape=new GreenLandBird(bodyColor,300,30,60);
			bird.put(bodyColor,shape);
			
		}
		
		return shape;
	}


}
