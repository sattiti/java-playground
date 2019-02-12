package lib;

public class ModelCarFactory extends CarFactory
{
    /**
     *
     */
    @Override
    public Bus createBus()
    {
        return new ModelBus();
    }

    /**
     *
     */
    @Override 
    public Truck createTruck()
    {
        return new ModelTruck();
    }
}
