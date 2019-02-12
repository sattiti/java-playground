package lib;
//package pattern.strategy;

public class Robot implements RobotInterface
{
    /**
     * robot
     *
     * @var Robot
     */
    private RobotInterface _robot;

    /**
     * constructor
     */
    public Robot(RobotInterface robot)
    {
        _robot = robot;
    }

    /**
     * weapon1
     *
     * @return void
     */
    public void weapon1()
    {
        _robot.weapon1();
    }

    /**
     * weapon1
     *
     * @return void
     */
    public void weapon2()
    {
        _robot.weapon2();
    }

    /**
     * superComb
     *
     * @return void
     */
    public void superComb()
    {
        _robot.superComb();
    }
}
