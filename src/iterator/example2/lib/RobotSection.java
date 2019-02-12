package lib;

import java.util.ArrayList;

public class RobotSection implements IRobotAggregate
{
    /**
     * robots
     *
     * @var ArrayList _robots
     */
    private ArrayList<Robot> _robots;

/////////////////////////////////////////////////

    /**
     * Contructor
     */
    public RobotSection(int robotsLength)
    {
        _robots = new ArrayList<Robot>(robotsLength);
    }

    /**
     * Return a robot
     *
     * @param  int index
     * @return Robot
     */
    public Robot robotAt(int index)
    {
        return (Robot)_robots.get(index);
    }

    /**
     * Append to _robots
     *
     * @param  Robot robot
     * @return void
     */
    public void append(Robot robot)
    {
        _robots.add(robot);
    }

    /**
     * Get robots length.
     *
     * @return int _robots.size()
     */
    public int getLength()
    {
        return _robots.size();
    }

    /**
     * Iterator Object.
     *
     * @return Iterator
     */
    public Iterator iterator()
    {
        return new RobotIterator(this);
    }
}
