package lib;

public class RobotFacade
{
    /**
     * Constructor
     */
    public RobotFacade()
    {
    }

    /**
     * Gundam action
     *
     * @return void
     */
    public void gundamAction()
    {
        Gundam r = new Gundam();

        System.out.println("\n" + r.toString() + "です。");
        r.onYourMark();
        r.getSet();
        r.go();
        r.attack();
        r.sword();
        r.shoot();
    }

    /**
     * MachineGunZ action
     *
     * @return void
     */
    public void machineGunZAction()
    {
        MachineGunZ r = new MachineGunZ();
        System.out.println("\n" + r.toString() + "です。");
        r.on();
        r.waiting();
        r.fake();
        r.risk();
        r.deffence();
    }

    /**
     * Eva action
     *
     * @return void
     */
    public void evaAction()
    {
        Eva r = new Eva();
        System.out.println("\n" + r.toString() + "です。");
        r.setPlugin();
        r.on();
        r.go();
        r.attack();
        r.superComb();
    }

    
}
