package lib;

import java.util.Iterator;
import java.util.ArrayList;

public class Composite implements IComponent
{
    /**
     * Name
     *
     * @var String _name
     */
    private String _name;

    /**
     * Directory
     *
     * @var ArrayList<IComponent> _directories
     */
    private ArrayList<IComponent> _directories;



    /**
     * Constructor
     */
    public Composite(String name)
    {
        _name = name;
        _directories = new ArrayList<IComponent>();
    }

    /**
     * Return name
     *
     * @return _name
     */
    public String getName()
    {
        return _name;
    }

    /**
     * add
     *
     * @param  IComponent c
     * @return void 
     */
    public void add(IComponent c)
    {
        _directories.add(c);
    }

    /**
     * remove
     *
     * @param  IComponent c
     * @return void 
     */
    public void remove(IComponent c)
    {
        _directories.remove(c);
    }

    /**
     * geetChildAt
     *
     * @param  int n
     * @return IComponent
     */
    public IComponent getChildAt(int n)
    {
        if(_directories.isEmpty()) {
            throw new Error("Empty");
        }
        else {
            return _directories.get(n);
        }
    }

    /**
     * display
     *
     * @param  String prefix
     * @return void
     */
    public void display(String prefix)
    {
        Iterator it = _directories.iterator();
        while(it.hasNext()) {
            IComponent c = (IComponent)it.next();
            c.display(prefix + "/" + _name);
        }
    }

    public void display()
    {
        this.display("");
    }
}
