package lib;

public abstract class AbstractHero
{
    /**
     * 攻撃
     *
     * @return void
     */
    protected abstract void attack();

    /**
     * 防備
     *
     * @return void
     */
    protected abstract void defence();

    /**
     * スーパーコンボ
     *
     * @return void
     */
    protected abstract void superComp();

    /**
     * template method
     * 特徴 : 変更されないように final をつける
     *
     * @return void
     */
    public final void action(){
        attack();
        defence();
        superComp();
    }
}
