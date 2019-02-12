import lib.*;

public class Main
{
    public static void main(String[] args)
    {
        RobotSection rs = new RobotSection();
        rs.add(new Robot("Machine Gun Z", "Laser"));
        rs.add(new Robot("Atom", "Punch"));
        rs.add(new Robot("Gundam Z", "Beam"));
        rs.add(new Robot("Evg", "AT Field"));

        Iterator it = rs.iterator();
        while(it.hasNext()) {
            Robot r = (Robot)it.next();
            System.out.println("Name : " + r.getName());
            System.out.println("Weapon : " + r.getWeapon());
        }
    }
}
