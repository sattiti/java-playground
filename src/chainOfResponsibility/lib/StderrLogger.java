package lib;

public class StderrLogger extends Logger
{
    public StderrLogger(int mask)
    {
        this.mask = mask;
    }

    protected void writeMessage(String msg)
    {
        System.out.println("err : " + msg);
    }
}
