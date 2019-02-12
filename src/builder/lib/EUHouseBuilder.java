package lib;

public class EUHouseBuilder implements IBuilder
{
    private Building _building;
    private static final String NAME = "EU.";



    public EUHouseBuilder()
    {
        _building = new Building();
    }

    public void buildBase()
    {
        _building.setBase(NAME + Material.SNOW);
    }

    public void buildFrame()
    {
        _building.setFrame(NAME + Material.WHITE);
    }

    public void buildWall()
    {
        _building.setWall(NAME + Material.LIGHT);
    }

    public Building getResult()
    {
        return _building;
    }
}
