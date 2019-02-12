package lib;

public class Hunter implements IPlayer
{
    /**
     * 説明
     *
     * @var String
     */
    private String _description = "ハンター";

    /**
     * skill
     *
     * @var String
     */
    private String _skill = "まじん斬り";

    /**
     *  スキルポイント
     *
     * @var double 
     */
    private double _attackPoint = 4.0;



    /**
     * getDescription
     *
     * @return String
     */
    public String getDescription()
    {
        return _description;
    }

    /**
     * スキル
     *
     * @return String
     */
    public String getSkill()
    {
        return _skill;
    }

    /**
     * 攻撃力
     *
     * @return double
     */
    public double getAttackPoint()
    {
        return _attackPoint;
    }
}
