package abstractfactory;


import generalclasses.Fauna;
import generalclasses.Flora;
import generalclasses.Huts;
import greenlandisland.GreenlandFauna;
import greenlandisland.GreenlandFlora;
import javafx.scene.canvas.GraphicsContext;

public class GreenLandFactory extends AbstractFactory {

	GraphicsContext gc;
	public GreenLandFactory(GraphicsContext gc) {
		
		this.gc=gc;
	}
	

	@Override
	public Flora getFlora(String type) {
		
		
		return new GreenlandFlora(gc);
	}

	@Override
	public Fauna getFauna() {
		
		return new GreenlandFauna(gc);
	}

	@Override
	public Huts getHuts(String type) {
		
		return null;
	}

}
