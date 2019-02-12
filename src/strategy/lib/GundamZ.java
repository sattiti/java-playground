package lib;
//package pattern.strategy;

public class GundamZ implements RobotInterface
{
    /**
     * _name
     *
     * @var String
     */
    private final static String _name = "GundamZ";

    /**
     * constructor
     */
    public GundamZ()
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
        System.out.println(_name + "\tBeam!!");
    }

    /**
     * superComb
     *
     * @return void
     */
    public void superComb()
    {
        System.out.println(_name + "\tGun!!");
    }
}
