package lib;

public interface IComponent
{
    /**
     * add
     *
     * @param  IComponent c
     * @return void 
     */
    public abstract void add(IComponent c);

    /**
     * remove
     *
     * @param  IComponent c
     * @return void 
     */
    public abstract void remove(IComponent c);

    /**
     * geetChildAt
     *
     * @param  int n
     * @return IComponent
     */
    public abstract IComponent getChildAt(int n);

    /**
     * display
     *
     * @param  String prefix
     * @return void
     */
    public abstract void display(String prefix);
    public abstract void display();
}
