package lib;

public class Receiver
{
    /**
     *
     */
    private String _data = "";



    /**
     *
     */
    public Receiver()
    {
    }

    /**
     *
     */
    public void append(String expr)
    {
        _data += expr;
    }

    /**
     *
     */
    public String getData()
    {
        return _data;
    }

    public void setData(String data)
    {
        _data = data;
    }
}
