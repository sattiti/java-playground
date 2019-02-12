package lib;

public class Leaf implements IComponent
{
    /**
     * Name
     *
     * @var String _name
     */
    private String _name;



    /**
     * Constructor
     */
    public Leaf(String name)
    {
        _name = name;
    }

    /**
     * getName
     *
     * @param  void
     * @return String _name
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
        throw new Error("This is a Child Class.");
    }

    /**
     * remove
     *
     * @param  IComponent c
     * @return void 
     */
    public void remove(IComponent c)
    {
        throw new Error("This is a Child Class.");
    }

    /**
     * geetChildAt
     *
     * @param  int n
     * @return IComponent
     */
    public IComponent getChildAt(int n)
    {
        throw new Error("This is a Child Class.");
    }

    /**
     * display
     *
     * @param  String prefix
     * @return void
     */
    public void display(String prefix)
    {
        System.out.println(prefix + "/" + _name);
    }

    public void display()
    {
        this.display("");
    }
}
