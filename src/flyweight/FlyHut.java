package flyweight;

import composite_pattern.CompositeShape;
import javafx.scene.paint.Color;

public abstract class FlyHut extends CompositeShape {

	public abstract void setRoofColor(Color roofColor);
	public abstract void setBodyColor(Color bodyColor);
	public abstract void setDoorColor(Color doorColor);
	public abstract void setBaseColor(Color baseColor);
	public abstract void setHeight(double height);
	public abstract void setWidth(double width);
	public abstract void setPositionX(double positionX);
	public abstract void setPositionY(double positionY);
}
