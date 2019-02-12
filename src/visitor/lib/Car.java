package lib;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle
{
    public Car()
    {
        super();
        wheels = new ArrayList<Wheel>();
        wheels.add(new Wheel("front left"));
        wheels.add(new Wheel("front right"));
        wheels.add(new Wheel("back left"));
        wheels.add(new Wheel("back right"));
    }
         
    /**
     *
     */
    public void accept(Visitor visitor)
    {
        visitor.visitCar(this);
    }
}
