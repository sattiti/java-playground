package lib;

public class Body implements IVisitor
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
