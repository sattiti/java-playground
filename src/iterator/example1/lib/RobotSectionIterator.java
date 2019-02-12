package lib;

public class RobotSectionIterator implements Iterator
{
    /**
     * RobotSection をここに入れて、利用する。
     *
     * @var RobotSection _rs
     */
    private RobotSection _rs;

    /**
     * RobotSection 内の ArrayList _robots の長さと比較するための変数
     *
     * @var int _index
     */
    private int _index;



    /**
     * Constructor
     *
     * @param RobotSection robotSection
     */
    public RobotSectionIterator(RobotSection robotSection)
    {
        _rs    = robotSection;
        _index = 0;
    }

    /**
     * hasNext
     * 
     * @return Boolean
     */
    public Boolean hasNext()
    {
        return _index < _rs.getLength() ? true : false;
    }

    /**
     * next
     *
     * @return Object
     */
    public Object next()
    {
        Robot robot = _rs.getRobotAt(_index);
        _index++;
        return robot;
    }
}
