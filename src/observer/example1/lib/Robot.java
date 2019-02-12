package lib;

public class Robot implements Observer, Display
{
    private int _id;
    private String _name;
    private String _weapon;
    private Subject _listener;
    
    public Robot(Subject s)
    {
        this._listener = s;
        this._listener.attach(this);
    }
    public void update(int id, String name, String weapon)
    {
        this._id     = id;
        this._name   = name;
        this._weapon = weapon;
        this.display();
    }
    
    public void display()
    {
        System.out.println("id = " + this._id);
        System.out.println("name = " + this._name);
        System.out.println("weapon = " + this._weapon);
        System.out.println("Update!!");
    }
}
