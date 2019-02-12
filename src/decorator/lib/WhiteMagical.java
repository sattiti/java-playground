package lib;

public class WhiteMagical extends Player
{
    /**
     * description
     *
     * @var String
     */
    private String _description = "白魔法";

    /**
     * skill
     *
     * @var String
     */
    private String _skill = "ホーリー";

    /**
     * skill point
     *
     * @var double
     */
    private double _attackPoint = 4.0;



    /**
     * Constructor
     *
     * @param Player
     */
    public WhiteMagical(IPlayer player)
    {
        super(player);
    }

    /**
     * get Description
     *
     * @return String
     */
    public String getDescription()
    {
        return _description + player.getDescription();
    }

    /**
     * スキル
     *
     * @return String
     */
    public String getSkill()
    {
        return _skill + player.getSkill();
    }

    /**
     * attack point
     *
     * @return double 
     */
    public double getAttackPoint()
    {
        return _attackPoint * player.getAttackPoint();
    }
}
