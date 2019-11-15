package greenlandisland;

import java.util.ArrayList;

import Mediator.MediatorCafe;
import Mediator.User;
import Mediator.VillagerUser;
import Observer.Subjects;
import Observer.Observer;
import builder.GreenLandHutBuilder;
import builder.HutBuilder;
import composite_pattern.CompositeShape;
import composite_pattern.IShape;
import composite_pattern.Leaf;
import composite_pattern.Polygone;
import composite_pattern.Rectangle;
import composite_pattern.Shoot;
import flyweight.FlyHut;
import flyweight.FlyWeightFactory;
import generalclasses.Hut;
import greenlandisland.GreenLandBigTree.TreeBuilder;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class GreenlandHut extends Hut {
	GraphicsContext gc;
	public GreenlandHut(GraphicsContext gc) {
		
		this.gc=gc;
	}

	@Override
	public void createCityHut() {
		
		
	}

	@Override
	public void createRuralHut(Observer ob,MediatorCafe mediatorCafe) {
		
		
		Subjects sub=new Subjects(gc,280,320);
		ob.addObserver(sub);
		mediatorCafe.addUser(new VillagerUser(gc,mediatorCafe,280,320));
		
		FlyHut greenLandBigTree=(FlyHut) FlyWeightFactory.getHut(Color.BLUE,1);
		greenLandBigTree.setBaseColor(Color.web("#880E4F"));
		greenLandBigTree.draw(gc);
		
		/*ob=new Observers(gc,1230,680);
		sub.addObserver(ob);*/
		greenLandBigTree=(FlyHut) FlyWeightFactory.getHut(Color.web("#26C6DA"),1);
		greenLandBigTree.setPositionX(1200);
		greenLandBigTree.setPositionY(700);
		greenLandBigTree.setBaseColor(Color.GRAY);
		greenLandBigTree.draw(gc);
		
		
		sub=new Subjects(gc,840,180);
		ob.addObserver(sub);
		mediatorCafe.addUser(new VillagerUser(gc,mediatorCafe,840,180));
		
		greenLandBigTree=(FlyHut) FlyWeightFactory.getHut(Color.web("#26C6DA"),1);
		greenLandBigTree.setPositionX(800);
		greenLandBigTree.setPositionY(200);
		greenLandBigTree.setHeight(100);
		greenLandBigTree.setWidth(150);
		greenLandBigTree.setBaseColor(Color.GRAY);
		greenLandBigTree.draw(gc);
		
		sub=new Subjects(gc,130,680);
		ob.addObserver(sub);
		
		mediatorCafe.addUser(new VillagerUser(gc,mediatorCafe,130,680));
		greenLandBigTree=(FlyHut) FlyWeightFactory.getHut(Color.BLUE,1);
		greenLandBigTree.setBaseColor(Color.web("#880E4F"));
		greenLandBigTree.setPositionX(100);
		greenLandBigTree.setPositionY(700);
		greenLandBigTree.setHeight(100);
		greenLandBigTree.setWidth(160);
		greenLandBigTree.draw(gc);
		
		
		greenLandBigTree=(FlyHut) FlyWeightFactory.getHut(Color.BLUE,1);
		greenLandBigTree.setBaseColor(Color.web("#880E4F"));
		greenLandBigTree.setPositionX(1140);
		greenLandBigTree.setPositionY(280);
		greenLandBigTree.setHeight(80);
		greenLandBigTree.setWidth(120);
		greenLandBigTree.draw(gc);
		gc.setFill(Color.WHITE);
		gc.fillText("Cyber Cafe",1180,260);
		
		
		
		
	
		
		
	}

	
	
}
