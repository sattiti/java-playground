package lib;

public class Director
{
    private IBuilder _builder;

    public Director(IBuilder b)
    {
        _builder = b;
    }

    public Building constructor()
    {
        _builder.buildBase();
        _builder.buildFrame();
        _builder.buildWall();
        return _builder.getResult();
    }
}
