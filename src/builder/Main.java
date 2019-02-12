import lib.*;

public class Main
{
    public static void main(String[] args)
    {
        Director d1 = new Director(new JPHouseBuilder());
        Director d2 = new Director(new EUHouseBuilder());

        Building b1 = d1.constructor();
        Building b2 = d2.constructor();

        System.out.println(b1);
        System.out.println(b2);
    }
}
