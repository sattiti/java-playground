package lib;

public class Invoker
{
    /**
     *
     */
    private Command _command;

    /**
     *
     */
    public Command exec()
    {
        _command.exec();
        return _command;
    }

    /**
     *
     */
    public void setCommand(Command cmd)
    {
        _command = cmd;
    }
}
