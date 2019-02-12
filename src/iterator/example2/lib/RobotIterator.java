package lib;

public class RobotIterator implements Iterator
{
    /**
     * robotSection
     *
     * @var RobotSection
     */
    private RobotSection _robotSection;

    /**
     * Index
     *
     * @var int _index
     */
    private int _index;

/////////////////////////////////////////////////

    /**
     * Constructor
     *
     * @param RobotIterator robotSection
     */
    public RobotIterator(RobotSection robotSection)
    {
        _robotSection = robotSection;
        _index        = 0;
    }

    /**
     * Has next or not.
     *
     * @return boolean value
     */
    public  boolean hasNext()
    {
        if(_index < _robotSection.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * If has next, this method will be call.
     *
     * @return Object
     */
    public Object next()
    {
        Robot robot = _robotSection.robotAt(_index);
        _index ++;
        return robot;
    }
}
