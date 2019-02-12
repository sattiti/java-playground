package lib;

/**
 * 貸主、借主の抽象クラス
 */
public abstract class Houser
{
    public static final int WIDTH_1DK  = 0;
    public static final int WIDTH_1LDK = 1;
    public static final int WIDTH_2DK  = 2;
    public static final int WIDTH_2LDK = 3;
    public static final int WIDTH_3DK  = 4;
    public static final int WIDTH_3LDK = 5;

    /**
     *
     */
    private String _name;

    /**
     * 賃金
     */
    private int _fee;

    /**
     * 広さ
     */
    private int _width;

    /**
     * 仲介会社
     */
    private Mediator _mediator;



    /**
     *
     */
    public Houser(Mediator mediator, String name, int width, int fee)
    {
        _mediator = mediator;
        _name     = name;
        _width    = width;
        _fee      = fee;
    }

    /**
     * 条件探し
     */
    public abstract void match();

    /**
     *
     */
    public int getWidth()
    {
        return _width;
    }

    public void setWidth(int width)
    {
        _width = width;
    }

    /**
     *
     */
    public int getFee()
    {
        return _fee;
    }

    public void setFee(int fee)
    {
        _fee = fee;
    }

    /**
     *
     */
    public String getName()
    {
        return _name;
    }

    public void setName(String name)
    {
        _name = name;
    }

    /**
     *
     */
    public Mediator getMediator()
    {
        return _mediator;
    }

}
