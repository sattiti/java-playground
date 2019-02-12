package lib;

public class PrototypeImp extends PrototypeFactory
{
    /**
     *
     */
    private int _num;



    /**
     *
     */
    public PrototypeImp(int num)
    {
        _num = num;
    }

    /**
     *
     */
    @Override
    public void prototypeFactory(int num)
    {
        _num = num;
    }

    /**
     *
     */
    public void printValue()
    {
        System.out.println("Value : " + _num);
    }

}
