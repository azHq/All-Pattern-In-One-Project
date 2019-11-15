package madagascarisland;

import Mediator.MediatorCafe;
import Mediator.User;
import Mediator.VillagerUser;
import Observer.Subjects;
import Observer.Observer;
import builder.GreenLandHutBuilder;
import builder.HutBuilder;
import builder.MadagascarHutBuilder;
import composite_pattern.IShape;
import composite_pattern.Polygone;
import flyweight.FlyHut;
import flyweight.FlyWeightFactory;
import generalclasses.Hut;
import greenlandisland.GreenLandRuralHut;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MadagascarHut extends Hut {
		GraphicsContext gc;
		public MadagascarHut(GraphicsContext gc) {
			
			this.gc=gc;
		}

		@Override
		public void createCityHut() {
			
			
		}

		@Override
		public void createRuralHut(Observer ob,MediatorCafe mediatorCafe) {
		
			
			Subjects sub=new Subjects(gc,180,680);
			ob.addObserver(sub);
			mediatorCafe.addUser(new VillagerUser(gc,mediatorCafe,180,680));
			
			FlyHut greenLandBigTree=(FlyHut) FlyWeightFactory.getHut(Color.BLUE,2);
			greenLandBigTree.setPositionX(100);
			greenLandBigTree.setPositionY(700);
			greenLandBigTree.setBaseColor(Color.web("#880E4F"));
			greenLandBigTree.draw(gc);
			
			
			/*ob=new Observers(gc,1220,650);
			sub.addObserver(ob);*/
			greenLandBigTree=(FlyHut) FlyWeightFactory.getHut(Color.web("#26C6DA"),2);
			greenLandBigTree.setPositionX(1200);
			greenLandBigTree.setPositionY(700);
			greenLandBigTree.setBaseColor(Color.GRAY);
			greenLandBigTree.draw(gc);
			
			
			sub=new Subjects(gc,850,180);
			ob.addObserver(sub);
			mediatorCafe.addUser(new VillagerUser(gc,mediatorCafe,850,180));
			greenLandBigTree=(FlyHut) FlyWeightFactory.getHut(Color.web("#26C6DA"),2);
			greenLandBigTree.setPositionX(800);
			greenLandBigTree.setPositionY(200);
			greenLandBigTree.setHeight(100);
			greenLandBigTree.setWidth(150);
			greenLandBigTree.setBaseColor(Color.GRAY);
			greenLandBigTree.draw(gc);
			
			
			sub=new Subjects(gc,70,250);
			ob.addObserver(sub);
			mediatorCafe.addUser(new VillagerUser(gc,mediatorCafe,70,250));
			greenLandBigTree=(FlyHut) FlyWeightFactory.getHut(Color.BLUE,2);
			greenLandBigTree.setBaseColor(Color.web("#880E4F"));
			greenLandBigTree.setPositionX(20);
			greenLandBigTree.setPositionY(280);
			greenLandBigTree.setHeight(120);
			greenLandBigTree.setWidth(220);
			greenLandBigTree.draw(gc);
			
			greenLandBigTree=(FlyHut) FlyWeightFactory.getHut(Color.BLUE,2);
			greenLandBigTree.setBaseColor(Color.web("#880E4F"));
			greenLandBigTree.setPositionX(1140);
			greenLandBigTree.setPositionY(280);
			greenLandBigTree.setHeight(80);
			greenLandBigTree.setWidth(120);
			greenLandBigTree.draw(gc);
			gc.setFill(Color.WHITE);
			gc.fillText("Cyber Cafe",1190,260);
			
			
			
			
		
			
		}

}
