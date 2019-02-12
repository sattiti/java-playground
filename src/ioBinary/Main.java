import lib.*;

public class Main{
  public static void main(String[] args){
    String path = args[0];

    //new JOutputStream(path).write();
    new JInputStream(path).display();
  }
}
