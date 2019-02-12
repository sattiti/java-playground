import lib.*;

public class Main
{
    public static void main(String[] args)
    {
        Subject s = new Subject();
        Observer o = new Observer(s);
        s.setValues("hello", 23, "male");
        s.setValues("John", 27, "male");
        s.setValues("Wice", 12, "male");
        s.setValues("Sofi", 21, "female");
    }
}
