package lib;

import java.util.ArrayList;

/**
 * Robot の集合体
 */
public class RobotSection implements IAggregate
{
    /**
     * Robot ArrayList
     *
     * @var ArrayList<Robot> _robots
     */
    private ArrayList<Robot> _robots;



    /**
     * Constructor
     *
     * @param
     */
    public RobotSection()
    {
        _robots = new ArrayList<Robot>();
    }

    /**
     * Get Robot At
     *
     * @param  int n
     * @return Robot
     */
    public Robot getRobotAt(int n)
    {
        return (Robot)_robots.get(n);
    }

    /**
     * _robots の長さを戻す
     * RobotSectionIterator の hasNext で利用される
     *
     * @return int
     */
    public int getLength()
    {
        return _robots.size();
    }

    /**
     * add
     *
     * @param  Robot r
     * @return void
     */
    public void add(Robot r)
    {
        _robots.add(r);
    }

    /**
     * Iterator
     * 
     * @return Iterator
     */
    public Iterator iterator()
    {
        return new RobotSectionIterator(this);
    }
}
