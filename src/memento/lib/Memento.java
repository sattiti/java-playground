package lib;

public class Memento
{
    /**
     * State
     *
     * @var String
     */
    private String _state;


    
    /**
     * Constructor
     *
     * @param String State
     */
    public Memento(String state)
    {
        _state = state;
    }

    /**
     * get State
     *
     * @return String _state
     */
    public String getState()
    {
        return _state;
    }
}
