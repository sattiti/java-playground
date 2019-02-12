package lib;

public class StdoutLogger extends Logger
{
    public StdoutLogger(int mask)
    {
        this.mask = mask;
    }

    protected void writeMessage(String msg)
    {
        System.out.println("std : " + msg);
    }
}
