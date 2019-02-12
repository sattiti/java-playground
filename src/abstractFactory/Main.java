import lib.*;
    
public class Main
{
    /**
     * Abstract Factory
     *
     * メリット:
     *     カプセル化。クライアントは具体的なクラスを知らず、
     *     抽象ファクトリだけで異なるインスタンスを生成する
     *     ことができます。
     *     柔軟性。インスタンスの生成をサブファクトリクラス
     *     に委ねることで、より柔軟なインスタンスの生成が
     *     できます。
     *
     * サンプルの設定 : 車を作ること
     * モデルカー か 本物の車か
     */
    public static void main(String[] args)
    {
        // real bus, truck
        CarFactory factory = CarFactory.getCarFactory(CarFactory.REAL_CAR);

        Bus bus     = factory.createBus();
        Truck truck = factory.createTruck();

        System.out.println("Type of Bus   : " + bus.getType());
        System.out.println("Type of Truck : " + truck.getType());

        // model bus, truck
        // 工場のラインを変更するによって、
        // 製造するものが変わる。
        factory = CarFactory.getCarFactory(CarFactory.MODEL_CAR);

        bus   = factory.createBus();
        truck = factory.createTruck();

        System.out.println("Type of Bus   : " + bus.getType());
        System.out.println("Type of Truck : " + truck.getType());
    }
}
