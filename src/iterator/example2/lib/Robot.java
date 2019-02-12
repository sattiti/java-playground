package lib;

public class Robot
{
    /**
     * Robot Name
     *
     * @var String _name
     */
    private String _name;

/////////////////////////////////////////////////

    /**
     * Constructor
     *
     * @param String name
     */
    public Robot(String name)
    {
        _name = name;
    }

    /**
     * Returns robot name
     *
     * @return String _name
     */
    public String getName()
    {
        return _name;
    }

}
