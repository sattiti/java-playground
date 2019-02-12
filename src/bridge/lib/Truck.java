package lib;

public class Truck extends Car
{
    public Truck(IEngine engine)
    {
        this.engine = engine;
    }

    @Override
    public void setUpEngine()
    {
        System.out.println("Truck engine : ");
        engine.setUpEngine();
    }
}
