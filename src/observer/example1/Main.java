import lib.*;

public class Main
{
    public static void main(String[] args)
    {
        RobotListener rl = new RobotListener();
        Robot robot = new Robot(rl);
        rl.setRobotValue(1, "F91", "Laser Gun!!");
    }
}
