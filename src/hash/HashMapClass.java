import java.util.*;

public class HashMapClass
{
  /**
   * hash
   *
   */
  private HashMap <String, String>_hash;

  public HashMapClass()
  {
    this._hash = new HashMap<String, String>();
  }

  /**
   * set Hash.
   *
   * @param  String
   * @param  String
   * @return void
   */
  public void setHash(String k, String v)
  {
    _hash.put(k, v);
  }

  /**
   * get hash.
   *
   * @return HashMap
   */
  public HashMap getHash()
  {
    return _hash;
  }

  /**
   * display
   *
   * @return void
   */
  public void display()
  {
    for(String n : _hash.keySet()) {
      System.out.println(n + "->"  + _hash.get(n));
    }
  }

  /**
   * main
   */
  public static void main(String[] args)
  {
    HashMapClass h = new HashMapClass();
    h.setHash("name", "nakada");
    h.setHash("age", "12");
    h.setHash("tel", "11111111");
    h.display();
  }
}
