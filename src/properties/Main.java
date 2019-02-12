import java.util.Map;

public class Main{
  public static void main(String[] args){
    Map properties = System.getProperties();
    for(Object k : properties.keySet()) {
      System.out.println(k + " : " + properties.get(k) + "\n");
    }
  }
}
