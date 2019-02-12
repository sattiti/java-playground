package lib;

/**
 * Decorator Class
 */
abstract class Player implements IPlayer
{
    /**
     * Player Object
     *
     * @var IPlayer player
     */
    protected IPlayer player;



    /**
     * Constructor
     * 
     * @param IPlayer
     */ 
    Player(IPlayer player)
    {
        this.player = player;
    }

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
