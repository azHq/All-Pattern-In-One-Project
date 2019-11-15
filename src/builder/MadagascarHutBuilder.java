package builder;

import composite_pattern.IShape;
import greenlandisland.GreenLandRuralHut;
import javafx.scene.paint.Color;
import madagascarisland.MadagscarRuralHut;

public class MadagascarHutBuilder {
	public Color roofColor;
	public Color bodyColor;
	public Color doorColor;
	public double height;
	public double width;
	public double positionX;
	public double positionY;
	
	public MadagscarRuralHut greenLandHut;
	
	public MadagascarHutBuilder() {
		
		greenLandHut=new MadagscarRuralHut();
	}
	
	public void setRoofColor() {
		
		greenLandHut.setRoofColor(Color.FORESTGREEN);
	}
	public void setBodyColor() {
	
		greenLandHut.setBodyColor(Color.AQUA);
	}
	public void setDoorColor() {
		
		greenLandHut.setDoorColor(Color.MAGENTA);
	}
	public void setBaseColor() {
		
		greenLandHut.setBaseColor(Color.GRAY);
	}
	public void setHeight() {
	
		greenLandHut.setHeight(100);
	}
	public void setWidth() {
		
		greenLandHut.setWidth(200);
	}
	public void setPositionX() {
		
		greenLandHut.setPositionX(250);
	}
	public void setPositionY() {
		
		greenLandHut.setPositionY(350);
	}

	public MadagscarRuralHut build(){
		
		return greenLandHut;
	}
	public void createHut() {
		setRoofColor();
		setBodyColor();
		setDoorColor();
		setHeight();
		setWidth();
		setPositionX();
		setPositionY();
	}
	
}
