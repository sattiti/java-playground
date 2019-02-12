import lib.*;

public class Main
{
    public static void main(String[] args)
    {
        EvaZeroAdapter eva = new EvaZeroAdapter(new EvaZero());
        eva.attack();
        eva.superComp();

        JackyAdapter jacky = new JackyAdapter(new Jacky());
        jacky.attack();
        jacky.superComp();
    }
}
