public class Hash implements HashInterface{
  /**
   * hash
   *
   * @var Hash
   */
  private HashInterface _hash;

  /**
   * constructor
   */
  public Hash(HashInterface hash)
  {
    this._hash = hash;
  }

  /**
   * hash setting.
   *
   * @return void
   */
  public void hashSetting(){
    this._hash.hashSetting();
  }

  /**
   * display
   *
   * @return void
   */
  public void display(){
    this._hash.display();
  }

  /**
   * main
   */
  public static void main(String[] args)
  {
    Hash h1 = new Hash(new HashSetClass());
    h1.hashSetting();
    System.out.println(h1.getClass().getName());
    h1.display();

    Hash h2 = new Hash(new TreeSetClass());
    h2.hashSetting();
    System.out.println(h1.getClass().getName());
    h2.display();
  }
}
