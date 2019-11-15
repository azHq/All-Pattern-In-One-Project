package greenlandisland;

import composite_pattern.CompositeShape;
import composite_pattern.IShape;
import composite_pattern.Polygone;
import composite_pattern.Rectangle;
import flyweight.FlyHut;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class GreenLandRuralHut extends FlyHut{

	
	Color color;
	public Color roofColor;
	public Color bodyColor;
	public Color doorColor;
	public double height;
	public double width;
	public double positionX;
	public double positionY;
	Color baseColor;
	public GreenLandRuralHut() {
		
		
	}
	@Override
	public void buildShape() {
		
		
		//roof
		shapes.add(new Polygone(roofColor,new double[]{positionX,positionX+(width*1.4),positionX+width,positionX+(width*.4)},new double[]{positionY,positionY,positionY-(height*.55),positionY-(height*.55)}));
		//base
		shapes.add(new Polygone(baseColor,new double[]{positionX+(width*.14),positionX+(width*1.26),positionX+(width*1.22),positionX+(width*.18)},new double[]{positionY+(height*1.08),positionY+(height*1.08),positionY+height,positionY+height}));
		//body
		shapes.add(new Rectangle(bodyColor,positionX+(width*.2), positionY, width, height,0));
		//door
		shapes.add(new Rectangle(doorColor,positionX+width*.6, positionY+height*.2, width*.2, height*.8,2));
		//window
		shapes.add(new Rectangle(doorColor,positionX+width*.30, positionY+height*.3, width*.17, height*.34,5));
		shapes.add(new Rectangle(doorColor,positionX+width*.92, positionY+height*.3, width*.17, height*.34,5));
		
	}
	
	
	
	public void setRoofColor(Color roofColor) {
		this.roofColor = roofColor;
	}
	public void setBodyColor(Color bodyColor) {
		this.bodyColor = bodyColor;
	}
	public void setDoorColor(Color doorColor) {
		this.doorColor = doorColor;
	}
	public void setBaseColor(Color baseColor) {
		this.baseColor = baseColor;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setPositionX(double positionX) {
		this.positionX = positionX;
	}
	public void setPositionY(double positionY) {
		this.positionY = positionY;
	}
	
	

}
