package lib;

import java.util.Stack;

public class CommandManager
{
    /**
     *
     */
    private Stack<Command> _commandStack;



    /**
     *
     */
    public CommandManager()
    {
        _commandStack = new Stack<Command>();
    }

    /**
     *
     */
    public void exec(Command cmd)
    {
        cmd.exec();
        if(cmd instanceof UndoableCommand) _commandStack.push(cmd);
    }

    /**
     *
     */
    public void undo()
    {
        if(_commandStack.size() > 0){
            UndoableCommand cmd = (UndoableCommand)_commandStack.pop();
            cmd.undo();
        }
        else{
            throw new UnsupportedOperationException("");
        }
    }
}
