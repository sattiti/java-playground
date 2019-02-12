import java.util.List;
import java.util.Arrays;

public class LambdaTest
{
  public static void main(String args[])
  {
    List<String> list = Arrays.asList("java", "Groovy", "Scala");
    // lambda
    list.sort(
      (String s1, String s2) -> {
        return s1.length() -s2.length();
      }
    );
    System.out.println(list);
  }
}
