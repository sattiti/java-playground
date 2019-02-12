package lib;


import java.util.HashMap;


public class StampFactory
{
  /**
   * プール
   */
  private HashMap<String, Stamp> _pool;

  /**
   * new をした回数を計るための変数
   */
  private static int NUM = 0;



  /**
   * Constructor
   */
  public StampFactory()
  {
    _pool = new HashMap<String, Stamp>();
  }

  /**
   * Flyweight パターンの真髄
   *
   * メリットは重複したものを new せず、再利用することが可能で、
   * メモリを抑えられる
   *
   * ただし、ガベージコレクションされないので、
   * 場合によって、手動で削除する必要がある。
   */
  public Stamp getStamp(String str)
  {
    // _pool から stamp を取得する
    Stamp stamp = _pool.get(str);

    // 取得した stamp が null である場合、
    // 新しい stamp を生成し、pool に入れて、return する。
    // 前回に登録された場合、新しい stamp を生成せずに、
    // そのまま return する。
    if(stamp == null) {
      // instance された回数を出力
      NUM++;
      System.out.println("スタックされた回数 : " + NUM);

      // stamp を生成し、_pool に入れる
      stamp = new Stamp(str);
      _pool.put(str, stamp);
    }
    // stamp を return
    return stamp;
  }

  /**
   * pool を開放する
   */
  public void releasePool()
  {
    _pool = null;
  }
}
