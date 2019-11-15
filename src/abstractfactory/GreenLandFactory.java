package abstractfactory;


import builder.GreenLandHutBuilder;
import builder.HutBuilder;
import generalclasses.Fauna;
import generalclasses.Flora;
import generalclasses.Hut;
import greenlandisland.GreenlandFauna;
import greenlandisland.GreenlandFlora;
import greenlandisland.GreenlandHut;
import javafx.scene.canvas.GraphicsContext;

public class GreenLandFactory extends AbstractFactory {

	GraphicsContext gc;
	public GreenLandFactory(GraphicsContext gc) {
		
		this.gc=gc;
	}
	

	@Override
	public Flora getFlora() {
		
		
		return new GreenlandFlora(gc);
	}

	@Override
	public Fauna getFauna() {
		
		return new GreenlandFauna(gc);
	}

	@Override
	public Hut getHuts() {
		
		return new GreenlandHut(gc);
	}

}
