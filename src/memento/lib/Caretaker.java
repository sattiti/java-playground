package lib;

import java.util.ArrayList;

public class Caretaker
{
    /**
     * states
     *
     * @var ArrayList<Memento>
     */
    private ArrayList<Memento> _states = new ArrayList<Memento>();


    /**
     * addMemento
     *
     * @param  Memento m
     * @return void
     */
    public void addMemento(Memento m)
    {
        _states.add(m);
    }

    /**
     * get memento
     *
     * @param  int index
     * @return Memento
     */
    public Memento getMemento(int index)
    {
        return _states.get(index);
    }
}
