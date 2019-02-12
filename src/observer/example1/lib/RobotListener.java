package lib;

import java.util.*;

public class RobotListener implements Subject
{
    private ArrayList<Observer> _observers;
    private int _id;
    private String _name;
    private String _weapon;
    
    public RobotListener()
    {
        this._observers = new ArrayList<Observer>();
    }
    
    public void attach(Observer o)
    {
        this._observers.add(o);
    }
    
    public void detach(Observer o)
    {
        this._observers.remove(o);
    }

    public void notifyObserver()
    {
        int len = this._observers.size();
        for(int n = 0; n < len; n++) {
            Observer o = this._observers.get(n);
            o.update(this._id, this._name, this._weapon);
        }
    }
    
    public void setRobotValue(int id, String name, String weapon)
    {
        this._id     = id;
        this._name   = name;
        this._weapon = weapon;
        this.notifyObserver();
    }
}
