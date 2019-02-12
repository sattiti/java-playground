package lib;

/**
 * このクラスは処理用
 */
public class Stamp
{
  /**
   *
   */
  private String _str;



  /**
   * init
   *
   * @param str
   */
  public Stamp(String str)
  {
    _str = str;
  }

  /**
   * 処理メソッド
   */
  public void print()
  {
    System.out.print(_str + ", ");
  }
}

