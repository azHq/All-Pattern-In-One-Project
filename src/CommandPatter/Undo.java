package CommandPatter;

import javafx.scene.canvas.GraphicsContext;

public class Undo extends ICommand{
	
	String s;
	double x,y;
	GraphicsContext gc;
	Marriage marriage;
	public Undo(String s,double x,double y,GraphicsContext gc,Marriage marriage) {
		
		this.x=x;
		this.y=y;
		this.s=s;
		this.gc=gc;
		this.marriage=marriage;
	}

	@Override
	public void execute() {
		
		marriage.clear(s, x, y);
		
	}

	@Override
	public void undo() {
	
		marriage.write(s, x, y);
	}

	@Override
	public void redo() {
		
		marriage.clear(s, x, y);
	}


}
