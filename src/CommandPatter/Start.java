package CommandPatter;

import javafx.scene.canvas.GraphicsContext;

public class Start extends ICommand {

	
	Marriage marriage;
	public Start(Marriage marriage) {
		
		
		this.marriage=marriage;
	}

	@Override
	public void execute() {
		
		marriage.startMarriage();
		
	}

	@Override
	public void undo() {
	
		marriage.stopMarriage();
	}

	@Override
	public void redo() {
		
		marriage.startMarriage();
	}

}
