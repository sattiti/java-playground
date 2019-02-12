package lib.command;

import java.util.Stack;
import java.util.Iterator;

public class MacroCommand implements ICommand
{
    /**
     * Command 集合
     *
     * @var Stack
     */
    private Stack _commands = new Stack();



    /**
     * execute
     *
     * @return void
     */
    public void execute()
    {
        Iterator it = _commands.iterator();
        while(it.hasNext()) {
            ((ICommand)it.next()).execute();
        }
    }

    public void append(ICommand cmd)
    {
        if(cmd != this) _commands.push(cmd);
    }

    public void undo()
    {
        if(!_commands.empty()) _commands.pop();
    }

    public void clear()
    {
        _commands.clear();
    }
}
