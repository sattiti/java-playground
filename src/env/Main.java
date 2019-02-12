import java.util.Map;

public class Main{
  public static void main(String[] args){
    Map env = System.getenv();
    for(Object o : env.keySet()) {
      System.out.println(o + " : " + env.get(o) + "\n");
    }
  }
}
