package lib;

/**
 * 借主
 */
public class Debtor extends Houser
{
    /**
     * 
     */
    public Debtor(Mediator mediator, String name, int width, int fee)
    {
        super(mediator, name, width, fee);
        mediator.registerDebtor(this);
    }

    /**
     *
     */
    @Override
    public void match()
    {
        System.out.print("借主 : " + getName() + " に合致する物件は : ");
        getMediator().matchLessor(this);
    }
}
