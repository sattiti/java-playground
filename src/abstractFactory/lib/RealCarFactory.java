package lib;

public class RealCarFactory extends CarFactory
{
    /**
     *
     */
    @Override
    public Bus createBus()
    {
        return new RealBus();
    }

    /**
     *
     */
    @Override 
    public Truck createTruck()
    {
        return new RealTruck();
    }
}
