package lib;

public class Eva
{
    /**
     * name
     */
    public final static String NAME = "EVA ZERO";



    /**
     * Constructor
     */
    public Eva()
    {
    }

    public void on()
    {
        System.out.println(NAME + " : 起動！");
    }

    public void setPlugin()
    {
        System.out.println(NAME + " : プラグイン挿入！");
    }

    public void go()
    {
        System.out.println(NAME + " : 出撃！");
    }

    public void attack()
    {
        System.out.println(NAME + " : 攻撃開始！");
    }

    public void superComb()
    {
        System.out.println(NAME + " : 暴走！");
    }

    public String toString()
    {
        return NAME;
    }
}
