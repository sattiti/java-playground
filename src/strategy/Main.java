import lib.*;

public class Main
{
    public static void main(String[] args)
    {
        Robot robot = new Robot(new AstroBoy());
        robot.weapon1();
        robot.weapon2();
        robot.superComb();

        robot = new Robot(new GundamZ());
        robot.weapon1();
        robot.weapon2();
        robot.superComb();
    }
}
