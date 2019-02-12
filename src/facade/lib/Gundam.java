package lib;

public class Gundam
{
    /**
     * name
     */
    public final static String NAME = "Gundam";



    /**
     * Constructor
     */
    public Gundam()
    {
    }

    public void onYourMark()
    {
        System.out.println(NAME + " : 出撃準備...");
    }

    public void getSet()
    {
        System.out.println(NAME + " : 出撃準備完了！");
    }

    public void go()
    {
        System.out.println(NAME + " : 出撃！");
    }

    public void attack()
    {
        System.out.println(NAME + " : 攻撃開始！");
    }

    public void sword()
    {
        System.out.println(NAME + " : ライトセーバー！");
    }

    public void shoot()
    {
        System.out.println(NAME + " : 機関砲！");
    }

    public String toString()
    {
        return NAME;
    }
}
