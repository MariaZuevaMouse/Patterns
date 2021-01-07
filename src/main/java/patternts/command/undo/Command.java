package patternts.command.undo;

public interface Command {
	public void execute();
	public void undo();
}
