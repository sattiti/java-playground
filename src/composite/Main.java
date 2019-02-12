import lib.*;

public class Main
{
    public static void main(String[] args)
    {
        Composite rootDir = new Composite("root");
        Composite usrDir = new Composite("usr");

        rootDir.add(usrDir);

        usrDir.add(new Leaf("bin"));
        usrDir.add(new Leaf("sbin"));

        rootDir.display();

    }
}
