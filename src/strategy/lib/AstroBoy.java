package lib;

//package pattern.strategy;

public class AstroBoy implements RobotInterface
{
    /**
     * _name
     *
     * @var String
     */
    private final static String _name = "AstroBoy";

    /**
     * constructor
     */
    public AstroBoy()
    {}

    /**
     * weapon1
     *
     * @return void
     */
    public void weapon1()
    {
        System.out.println(_name + "\tLaser!!");
    }

    /**
    * weapon1
    *
    * @return void
    */
    public void weapon2()
    {
        System.out.println(_name + "\tpunch!!");
    }

    /**
     * superComb
     *
     * @return void
     */
    public void superComb()
    {
        System.out.println(_name + "\tBomb!!");
    }
}
