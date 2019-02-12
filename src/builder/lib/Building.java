package lib;

public class Building
{
    private String _base;
    private String _frame;
    private String _wall;




    public void setBase(String m)
    {
        _base = m;
    }

    public void setFrame(String m)
    {
        _frame = m;
    }

    public void setWall(String m)
    {
        _wall = m;
    }

    public String toString()
    {
        return "Base : " + _base + "\nFrame : " + _frame + "\nWall : " + _wall;
    }
}
