package lib;

public class Prototype
{
    /**
     *
     */
    private PrototypeFactory _pf;



    /**
     *
     */
    public Prototype(PrototypeFactory pf)
    {
        _pf = pf;
    }

    /**
     *
     */
    public PrototypeFactory makeCopy() throws CloneNotSupportedException
    {
        return (PrototypeFactory) _pf.clone();
    }
}
