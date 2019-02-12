import lib.*;

public class Main
{
    public static void main(String[] args)
    {
        RobotSection rs = new RobotSection(4);
        rs.append(new Robot("Gundum Z"));
        rs.append(new Robot("Eva"));
        rs.append(new Robot("Machine Gun"));
        rs.append(new Robot("F91"));

        Iterator it = rs.iterator();
        while(it.hasNext()) {
            Robot robot = (Robot)it.next();
            System.out.println(robot.getName());
        }
    }
}
