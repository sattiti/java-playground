package lib;

public interface Iterator
{
    /**
     * hasNext
     * 
     * @return Boolean
     */
    public abstract Boolean hasNext();

    /**
     * next
     *
     * @return Object
     */
    public abstract Object next();

    /**
     * next
     *
     * @return void
     */
    // public abstract void remove();
}
