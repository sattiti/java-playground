package lib;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle{
    /**
     *
     */
    protected Engine  engine = new Engine();

    /**
     *
     */
    protected Body body = new Body();

    /**
     *
     */
    protected List<Wheel> wheels;
                 
    /**
     *
     */
    public Engine getEngine()
    {
        return engine;
    }

    /**
     *
     */
    public Body getBody()
    {
        return body;
    }
    
    /**
     *
     */
    public List<Wheel> getWheels()
    {
        return wheels;
    }

    /**
     *
     */
    public void accept(Visitor visitor)
    {
        visitor.visitVehicle(this);
    }

}
