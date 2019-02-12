package lib;

public class JPHouseBuilder implements IBuilder
{
    private Building _building;
    private static final String NAME = "JP.";



    public JPHouseBuilder()
    {
        _building = new Building();
    }

    public void buildBase()
    {
        _building.setBase(NAME + Material.CONCRETE);
    }

    public void buildFrame()
    {
        _building.setFrame(NAME + Material.WOOD);
    }

    public void buildWall()
    {
        _building.setWall(NAME + Material.CLAY);
    }

    public Building getResult()
    {
        return _building;
    }
}
