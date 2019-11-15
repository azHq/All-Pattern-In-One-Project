package CommandPatter;

import javafx.scene.canvas.GraphicsContext;

public class Redo extends ICommand {

	String s;
	double x,y;
	GraphicsContext gc;
	Marriage marriage;
	public Redo(String s,double x,double y,GraphicsContext gc,Marriage marriage) {
		
		this.x=x;
		this.y=y;
		this.s=s;
		this.gc=gc;
		this.marriage=marriage;
	}

	@Override
	public void execute() {
		
		marriage.write(s, x, y);
		
	}

	@Override
	public void undo() {
	
		marriage.clear(s, x, y);
	}

	@Override
	public void redo() {
		
		marriage.write(s, x, y);
	}

}
