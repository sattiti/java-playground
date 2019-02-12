package lib;

public class MachineGunZ
{
    /**
     * name
     */
    public final static String NAME = "MachineGunZ";



    /**
     * Constructor
     */
    public MachineGunZ()
    {
    }

    public void on()
    {
        System.out.println(NAME + " : 起動！");
    }

    public void waiting()
    {
        System.out.println(NAME + " : 待機！");
    }

    public void fake()
    {
        System.out.println(NAME + " : フェイク！");
    }

    public void deffence()
    {
        System.out.println(NAME + " : 防備");
    }

    public void risk()
    {
        System.out.println(NAME + " : 罠を設置！");
    }

    public String toString()
    {
        return NAME;
    }
}
