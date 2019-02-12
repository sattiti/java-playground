import lib.*;

public class Main
{
    public static void main(String[] args)
    {
        IImage image1 = new ProxyImage("hello1");
        IImage image2 = new ProxyImage("hello2");
        IImage image3 = new ProxyImage("hello3");

        image1.display();
        image2.display();
        image2.display();
        image2.display();
        image2.display();
        image2.display();
        image2.display();
        image3.display();
    }
}
