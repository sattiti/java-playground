import java.util.*;

public class TreeSetClass implements HashInterface
{
  /**
   * hash
   *
   * @var Hash
   */
  private TreeSet <String>_hash;

  /**
   * constructor
   */
  public TreeSetClass()
  {}

  /**
   * hash setting.
   *
   * @return void
   */
  public void hashSetting()
  {
    this._hash = new TreeSet<String>();
    this._hash.add("rrr");
    this._hash.add("hhh");
    this._hash.add("www");
    this._hash.add("ooo");
    this._hash.add("qqq");
  }

  /**
   * display
   *
   * @return void
   */
  public void display()
  {
    for(String n : this._hash) {
      System.out.println(n);
    }
  }
}
