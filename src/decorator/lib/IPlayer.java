package lib;

public interface IPlayer
{
    /**
     * getDescription
     *
     * @return String
     */
    public abstract String getDescription();

    /**
     * スキル
     *
     * @return String
     */
    public abstract String getSkill();

    /**
     * 攻撃力
     *
     * @return double
     */
    public abstract double getAttackPoint();
}
