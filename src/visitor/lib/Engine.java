package lib;

public class Engine implements IVisitor
{

    /**
     *
     */
    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}
