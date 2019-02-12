package lib;

public class JackyAdapter implements IAdapter
{
    /**
     * adapter
     *
     * @var Jacky
     */
    private Jacky _adapter;

    /**
     * Constructor
     *
     * @param Jacky adapter
     */
    public JackyAdapter(Jacky adapter)
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
        _adapter.drink();
    }

    /**
     * スーパーコンボ
     *
     * @return void
     */
    public void superComp()
    {
        _adapter.passGas();
    }
}
