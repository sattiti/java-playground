import lib.*;

public class Main
{
    public static void main(String[] args)
    {
        AbstractHero ninja   = new Ninja();
        AbstractHero samurai = new Samurai();
        AbstractHero champ   = new KingsOfKing();

        ninja.action();
        System.out.println("\n");
        samurai.action();
        System.out.println("\n");
        champ.action();
    }
}
