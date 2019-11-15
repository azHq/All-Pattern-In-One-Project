package abstractfactory;


import generalclasses.Fauna;
import generalclasses.Flora;
import generalclasses.Hut;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import madagascarisland.MadagascarFauna;
import madagascarisland.MadagascarFlora;
import madagascarisland.MadagascarHut;

public class MadagascarFactory extends AbstractFactory {
	
	GraphicsContext gc;
	public MadagascarFactory(GraphicsContext gc) {
		
		this.gc=gc;
	}
	

	@Override
	public Flora getFlora() {
		
		
		return new MadagascarFlora(gc);
	}

	@Override
	public Fauna getFauna() {
		
		return new MadagascarFauna(gc);
	}

	@Override
	public Hut getHuts() {
		
		return new MadagascarHut(gc);
	}
}
