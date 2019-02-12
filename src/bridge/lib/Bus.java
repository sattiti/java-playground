package lib;

public class Bus extends Car
{
    public Bus(IEngine engine)
    {
        this.engine = engine;
    }

    @Override
    public void setUpEngine()
    {
        System.out.println("Bus engine : ");
        engine.setUpEngine();
    }
}
