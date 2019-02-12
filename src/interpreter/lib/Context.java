package lib;

public class Context
{
    /**
     *
     */
    private String _input;

    /**
     *
     */
    private int _output;



    /**
     *
     */
    public Context(String input)
    {
        _input = input;
    }

    /**
     *
     */
    public String getInput()
    {
        return _input;
    }

    /**
     *
     */
    public void setInput(String input)
    {
        _input = input;
    }

    /**
     *
     */
    public int getOutput()
    {
        return _output;
    }

    /**
     *
     */
    public void setOutput(int output)
    {
        _output = output;
    }
}
