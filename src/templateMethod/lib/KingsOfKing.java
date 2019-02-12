package lib;

public class KingsOfKing extends AbstractHero
{
    /**
     * 名前
     *
     * @static final String
     */
    private static final String NAME = "KingsOfKing";



    /**
     * @return void
     */
    protected void attack()
    {
        System.out.println(NAME + " : Punch Punch!");
    }

    /**
     * @return void
     */
    protected void defence()
    {
        System.out.println(NAME + " : Block Block.");
    }

    /**
     * @return void
     */
    protected void superComp(){
        System.out.println(NAME + " : Double Punch.");
    }
}
