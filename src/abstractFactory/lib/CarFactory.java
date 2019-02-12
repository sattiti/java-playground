package lib;

import java.util.List;

/**
 *
 */
public abstract class CarFactory
{
    /**
     * bus, truck を製造する factory
     */
    public static final int REAL_CAR  = 1;

    /**
     * model bus, model truck を製造する factory
     */
    public static final int MODEL_CAR = 2;



    /**
     * bus, model bus を製造する
     */
    public abstract Bus createBus();

    /**
     * truck, model truck を製造する
     */
    public abstract Truck createTruck();

    /**
     * sub factory
     */
    public static CarFactory getCarFactory(int type)
    {
        switch(type){
            case REAL_CAR:
                return new RealCarFactory();
            case MODEL_CAR:
                return new ModelCarFactory();
            default:
                return null;
        }
    }
}
