package lib;

/**
 * 貸主
 */
public class Lessor extends Houser
{
    /**
     * 
     */
    public Lessor(Mediator mediator, String name, int width, int fee)
    {
        super(mediator, name, width, fee);
        mediator.registerLessor(this);
    }

    /**
     *
     */
    @Override
    public void match()
    {
        System.out.print("貸主物件 : " + getName() + " に合致する借主は : ");
        getMediator().matchDebtor(this);
    }
}
