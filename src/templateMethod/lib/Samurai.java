package lib;

public class Samurai extends AbstractHero
{
    /**
     * 名前
     *
     * @static final String
     */
    private static final String NAME = "Kirizo";
    


    /**
     * 攻撃
     *
     * @return void
     */
    protected void attack()
    {
        System.out.println(NAME + " : 斬！");
    }

    /**
     * 防備
     *
     * @return void
     */
    protected void defence()
    {
        System.out.println(NAME + " : 横流し！");
    }

    /**
     * スーパーコンボ
     *
     * @return void
     */
    protected void superComp()
    {
        System.out.println(NAME + " : 名無し斬！");
    }
}
