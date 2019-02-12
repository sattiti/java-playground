import lib.*;

public class Main
{
    public static void main(String[] args)
    {
        IEngine engine1500cc = new Engine1500cc();
        IEngine engine2000cc = new Engine2000cc();

        Car truck1500cc = new Truck(engine1500cc);
        Car truck2000cc = new Truck(engine2000cc);

        Car bus1500cc = new Bus(engine1500cc);
        Car bus2000cc = new Bus(engine2000cc);

        truck1500cc.setUpEngine();
        truck2000cc.setUpEngine();

        bus1500cc.setUpEngine();
        bus2000cc.setUpEngine();
    }
}
