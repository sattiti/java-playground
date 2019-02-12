package lib;

public interface IBuilder
{
    public void buildBase();
    public void buildFrame();
    public void buildWall();

    public Building getResult();
}
