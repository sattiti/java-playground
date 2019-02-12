package lib;

public class Observer implements IObserver
{
    private Subject _subject;

    private String _name;
    private int    _age;
    private String _gender;



    public Observer(Subject s)
    {
        _subject = s;
        s.attach(this);
    }

    public void notify(String name, int age, String gender)
    {
        _name   = name;
        _age    = age;
        _gender = gender;
        _display();
    }

    private void _display()
    {
        System.out.println("Name:\t" + _name);
        System.out.println("Age:\t" + _age);
        System.out.println("Gender:\t" + _gender);
        System.out.println("Done!!\n");
    }
}
