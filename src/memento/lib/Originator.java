package lib;

public class Originator
{
    /**
     * State
     *
     * @var String 
     */
    private String _state;

    /**
     * set State
     *
     * @param  String
     * @return void
     */
    public void set(String state)
    {
        System.out.println("Originator : Setting state to " + state);
        _state = state;
    }

    /**
     * Memento に保存する
     *
     * @return Memento
     */
    public Memento save()
    {
        System.out.println("\nOriginator : " + _state + " Saving to Memento\n");
        return new Memento(_state);
    }

    /**
     * retore from memento
     *
     * @param  Memento m
     * @return void
     */
    public void restore(Memento m)
    {
        _state = m.getState();
        System.out.println("Originator : State after restoring from Memento : " + _state);
    }
}
