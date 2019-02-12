package lib;


public abstract class Command
{
    /**
     *
     */
    protected Receiver receiver;

    /**
     *
     */
    protected String param;



    /**
     *
     */
    public Command(Receiver receiver, String expr)
    {
        this.receiver = receiver;
        this.param    = expr;
    }

    /**
     *
     */
    public abstract void exec();
}
