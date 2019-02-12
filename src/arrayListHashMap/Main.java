import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;

public class Main{
  private ArrayList<String> _fruit;
  private HashMap<String, Integer> _drink;

  public Main(){}

  public void arrayTest(){
    _fruit = new ArrayList<String>();
    _fruit.add("apple");
    _fruit.add("banana");
    _fruit.add("orange");
    _fruit.add("lenmon");
    _fruit.add("pipe apple");

    Iterator it = _fruit.iterator();

    System.out.println("ArrayList Test : ");
    while(it.hasNext()) {
      String ans = (String)it.next();
      System.out.println(
          String.format("id : %d, value : %s", _fruit.indexOf(ans), ans)
          );
    }
    System.out.println();
  }

  public void hashMapTest(){
    _drink = new HashMap<String, Integer>();
    _drink.put("Cola", 150);
    _drink.put("Whiskey", 750);
    _drink.put("Tea", 250);
    _drink.put("Beer", 550);
    _drink.put("Juices", 350);

    Iterator it = _drink.keySet().iterator();
    System.out.println("HashMap Test : ");
    while(it.hasNext()){
      String key = (String)it.next();
      System.out.println(String.format("key : %s, value : %d", key, _drink.get(key)));
    }
    System.out.println();
  }

  public static void main(String[] args){
    Main a = new Main();
    a.arrayTest();
    a.hashMapTest();
  }
}
