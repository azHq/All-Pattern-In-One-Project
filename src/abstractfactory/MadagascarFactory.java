package abstractfactory;


import generalclasses.Fauna;
import generalclasses.Flora;
import generalclasses.Huts;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import madagascarisland.MadagascarFlora;

public class MadagascarFactory extends AbstractFactory {
	
	GraphicsContext gc;
	public MadagascarFactory(GraphicsContext gc) {
		
		this.gc=gc;
	}
	

	@Override
	public Flora getFlora(String type) {
		
		
		return new MadagascarFlora(gc);
	}

	@Override
	public Fauna getFauna() {
		
		return null;
	}

	@Override
	public Huts getHuts(String type) {
		
		return null;
	}
}
