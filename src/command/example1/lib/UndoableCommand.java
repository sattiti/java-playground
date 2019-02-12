package lib;

public abstract class UndoableCommand extends Command
{
    /**
     *
     */
    public UndoableCommand(Receiver receiver, String expr)
    {
        super(receiver, expr);
    }

    /**
     *
     */
    public abstract void undo();
}
