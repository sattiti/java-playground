package lib;

public class EvaZeroAdapter implements IAdapter
{
    /**
     * EvaZero Adapter
     *
     * @var EvaZero
     */
    private EvaZero _adapter;



    /**
     * Constructor
     *
     * @param  EvaZero
     */
    public EvaZeroAdapter(EvaZero adapter)
    {
        _adapter = adapter;
    }

    /**
     * 通常攻撃
     *
     * @return void
     */
    public void attack()
    {
        _adapter.ATField();
    }

    /**
     * スーパーコンボ
     *
     * @return void
     */
    public void superComp()
    {
        _adapter.getCrazy();
    }
}
