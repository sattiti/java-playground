package lib;

public class BlackMagical extends Player
{
    /**
     * description
     *
     * @var String
     */
    private String _description = "黒魔法";

    /**
     * skill
     *
     * @var String
     */
    private String _skill = "アルティマ";

    /**
     * skill point
     *
     * @var double
     */
    private double _attackPoint = 7.0;



    /**
     * Constructor
     *
     * @param Player
     */
    public BlackMagical(IPlayer player)
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
