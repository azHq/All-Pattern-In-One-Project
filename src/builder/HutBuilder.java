package builder;

import composite_pattern.IShape;
import greenlandisland.GreenLandRuralHut;
import greenlandisland.GreenlandHut;
import javafx.scene.paint.Color;

public abstract class HutBuilder{
		
		
		public void createHut() {
			setRoofColor();
			setBodyColor();
			setDoorColor();
			setHeight();
			setWidth();
			setPositionX();
			setPositionY();
		}
		public abstract void setRoofColor();
		public abstract void setBodyColor();
		public abstract void setDoorColor();
		public abstract void setBaseColor();
		public abstract void setHeight();
		public abstract void setWidth();
		public abstract void setPositionX();
		public abstract void setPositionY();
		public abstract IShape build();
		

}
