package lib;

/**
 * 個体
 */
public class Robot
{
    /**
     * Robot name
     *
     * @var String _name
     */
    private String _name;

    /**
     * Robot weapon
     *
     * @var String _weapon
     */
    private String _weapon;



    /**
     * Constructor
     *
     * @param String name
     */
    public Robot(String name, String weapon)
    {
        _name   = name;
        _weapon = weapon;
    }

    /**
     * Return robot name.
     *
     * @return String _name
     */
    public String getName()
    {
        return _name;
    }

    /**
     * Return robot weapon.
     *
     * @return String _weapon
     */
    public String getWeapon()
    {
        return _weapon;
    }
}
