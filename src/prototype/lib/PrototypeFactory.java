package lib;

public abstract class PrototypeFactory implements Cloneable
{
    /**
     *
     */
    public Object clone() throws CloneNotSupportedException
    {
        // call Object.clone()
        return (PrototypeFactory) super.clone();
    }

    public abstract void prototypeFactory(int x);
    public abstract void printValue();
}
