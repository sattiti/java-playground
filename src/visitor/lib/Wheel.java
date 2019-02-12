package lib;

public class Wheel implements IVisitor
{
    /**
     *
     */
    private String _name;



    /**
     *
     */
    public Wheel(String name)
    {
        _name = name;
    }

    /**
     *
     */
    public String getName()
    {
        return _name;
    }
    
    public void setName(String name)
    {
        _name = name;
    }

    /**
     *
     */
    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}
