import lib.*;

public class Main
{
    public static void main(String[] args)
    {
        Logger l = new StdoutLogger(Logger.DEBUG).setNext(
                   new EmailLogger(Logger.NOTICE).setNext(
                   new StderrLogger(Logger.ERROR)));

        l.display("1 ", Logger.DEBUG);
        l.display("2 ", Logger.NOTICE);
        l.display("3 ", Logger.ERROR);
    }

}
