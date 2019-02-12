package lib;

public class Knight implements IPlayer
{
    /**
     * 説明
     *
     * @var String
     */
    private String _description = "騎士";

    /**
     * skill
     *
     * @var String
     */
    private String _skill = "二段斬り";

    /**
     *  スキルポイント
     *
     * @var double 
     */
    private double _attackPoint = 2.0;



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
