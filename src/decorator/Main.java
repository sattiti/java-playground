import lib.*;

public class Main
{
    public static void main(String[] args)
    {
        IPlayer knight = new Knight();
        IPlayer hunter = new Hunter();

        System.out.println(knight.getDescription());
        System.out.println(knight.getSkill());
        System.out.println(knight.getAttackPoint());

        System.out.println("\n========== 変身!! ==========\n");
        knight = new WhiteMagical(hunter);
        System.out.println(hunter.getDescription());
        System.out.println(hunter.getSkill());
        System.out.println(hunter.getAttackPoint());

        System.out.println("\n========== 変身!! ==========\n");
        hunter = new BlackMagical(knight);
        System.out.println(hunter.getDescription());
        System.out.println(hunter.getSkill());
        System.out.println(hunter.getAttackPoint());
    }
}
