import lib.*;

public class Main
{
  public static void main(String[] args)
  {
    String path = args[0];

    // 書込み
    JOutputObject oo = new JOutputObject(path);
    oo.addObj(new Member("John", 20, 'M', "john@gmail.com"));
    oo.addObj(new Member("Paul", 32, 'M', "paul@gmail.com"));
    oo.addObj(new Member("Susan", 23, 'F', "susan@gmail.com"));
    oo.addObj(new Member("Mary", 24, 'F', "mary@gmail.com"));
    oo.write();

    // 読込
    JInputObject io = new JInputObject(path);
    io.display();
  }
}
