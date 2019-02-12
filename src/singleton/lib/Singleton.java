package lib;

final public class Singleton
{
    /**
     * singleton
     *
     * @var instance
     */
    private static final Singleton _instance = new Singleton();
    // private static Singleton _instance;

    /**
     * instance member
     *
     * @var int
     */
    private int _instanceNumber = 0;

    /**
     * class mumber
     *
     * @var int
     */
    private static int _classNumber = 0;

    /**
     * Private constructor
     */
    private Singleton() {}

    /**
     * the best way for java Singleton.
     *
     * @return Singleton
     */
    public static Singleton getInstance()
    {
        return Singleton._instance;
    }

    /**
     * Gof pattern. not for java use. get instance
     *
     * @return Singleton
     */
    /*
    public static synchronized Singleton getInstance()
    {
        if(_instance == null) {
            _instance = new Singleton();
        }
        return _instance;
    }
    */

    /**
     * display say method.
     *
     * @return void
     */
    public void display()
    {
        _say();
    }

    /**
     * show the different of instanceNumber and classNumber
     *
     * @return void
     */
    private void _say()
    {
        this._instanceNumber += 1;
        this._classNumber    += 1;
        System.out.println("Instance Number is : " + this._instanceNumber);
        System.out.println("Class Number is : " + this._classNumber);
    }
}
