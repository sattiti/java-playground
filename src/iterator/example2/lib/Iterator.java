package lib;

public interface Iterator
{
    /**
     * Has next or not.
     *
     * @return boolean value
     */
    public abstract boolean hasNext();

    /**
     * If has next, this method will be call.
     *
     * @return Object
     */
    public abstract Object next();
}
