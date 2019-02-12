package lib;

public interface ISubject
{
    public void attach(IObserver o);

    public void dettach(IObserver o);

    public void notifyObserver();
}
