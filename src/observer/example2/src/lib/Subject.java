package lib;

import java.util.ArrayList;

public class Subject implements ISubject
{
    private ArrayList<IObserver> _observers;

    private String _name;
    private int    _age;
    private String _gender;



    public Subject()
    {
        _observers = new ArrayList<IObserver>();
    }

    public void attach(IObserver o)
    {
        _observers.add(o);
    }

    public void dettach(IObserver o)
    {
        _observers.remove(o);
    }

    public void notifyObserver()
    {
        int len = _observers.size();
        for(int i = 0; i < len; i++) {
            _observers.get(i).notify(_name, _age, _gender);
        }
    }

    public void setValues(String name, int age, String gender)
    {
        _name   = name;
        _age    = age;
        _gender = gender;
        notifyObserver();
    }
}
