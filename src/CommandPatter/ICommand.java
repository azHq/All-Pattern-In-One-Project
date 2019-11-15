package CommandPatter;

public abstract class ICommand {
	
	public ICommand() {}
	
	public abstract void execute();
	public abstract void undo();
	public abstract void redo();
	

}
