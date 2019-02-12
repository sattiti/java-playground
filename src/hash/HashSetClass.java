import java.util.*;

public class HashSetClass implements HashInterface
{
  /**
   * hash
   *
   * @var Hash
   */
  private HashSet <String>_hash;

  /**
   * constructor
   */
  public HashSetClass()
  {}

  /**
   * hash setting.
   *
   * @return void
   */
  public void hashSetting()
  {
    this._hash = new HashSet<String>();
    this._hash.add("aaa");
    this._hash.add("bbb");
    this._hash.add("ccc");
    this._hash.add("ttt");
    this._hash.add("vvv");
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
