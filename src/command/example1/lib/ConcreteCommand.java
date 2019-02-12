package lib;

public class ConcreteCommand extends UndoableCommand
{
    /**
     *
     */
    private String _prevData = null;



    /**
     *
     */
    public ConcreteCommand(Receiver receiver, String expr)
    {
        super(receiver, expr);
    }

    /**
     *
     */
    @Override
    public void exec()
    {
        _prevData = receiver.getData();
        receiver.append(param);
    }

    /**
     *
     */
    @Override
    public void undo()
    {
        receiver.setData(_prevData);
    }
}
