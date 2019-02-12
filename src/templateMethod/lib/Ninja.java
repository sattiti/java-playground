package lib;

public class Ninja extends AbstractHero
{
    /**
     * 名前
     *
     * @static final String
     */
    private static final String NAME = "NinNin";

    /**
     * 攻撃
     *
     * @return void
     */
    protected void attack()
    {
        System.out.println(NAME + " : 火遁！");
    }

    /**
     * 防備
     *
     * @return void
     */
    protected void defence()
    {
        System.out.println(NAME + " : 分身");
    }

    /**
     * スーパーコンボ
     *
     * @return void
     */
    protected void superComp()
    {
        System.out.println(NAME + " : 幻術");
    }
}
