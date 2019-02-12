package lib;

public class EmailLogger extends Logger
{
    public EmailLogger(int mask)
    {
        this.mask = mask;
    }

    protected void writeMessage(String msg)
    {
        System.out.println("mail : " + msg);
    }
}
