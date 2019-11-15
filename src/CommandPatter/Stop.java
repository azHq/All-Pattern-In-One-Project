package CommandPatter;

public class Stop extends ICommand {

	
	Marriage marriage;
	public Stop(Marriage marriage) {
		
		
		this.marriage=marriage;
	}

	@Override
	public void execute() {
		
		marriage.stopMarriage();
		
	}

	@Override
	public void undo() {
	
		marriage.startMarriage();
	}

	@Override
	public void redo() {
		
		marriage.stopMarriage();
	}

}
