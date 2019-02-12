package lib;

public abstract class Logger
{
    public static final int ERROR  = 0;
    public static final int NOTICE = 1;
    public static final int DEBUG  = 2;

    protected int mask;
    protected Logger _next;


    public Logger setNext(Logger l)
    {
        _next = l;
        return this;
    }

    public void display(String msg, int priority)
    {
        if(priority <= mask) {
            writeMessage(msg);
            
            if(_next != null) {
                _next.display(msg, priority);

            }
        }
    }

    /**
     *
     */
    abstract protected void writeMessage(String msg);
}
