public class HelloWorld
{
  /**
   * msg
   *
   * @var : string
   */
  private String _msg;

  /**
   * ary 
   * @var : array
   */
  private String[] _ary;

  /**
   * constructor
   *
   * @param : string
   */
  public HelloWorld(String msg)
  {
    _msg  = msg;
    _say();

  }

  /**
   * say
   *
   * @return : void
   */
  private void _say()
  {
    int len = 10;
    _ary    = new String[len];

    for(int i = 0; i < len; i++) {
      _ary[i] = i + ":" + _msg;
      System.out.println(_ary[i]);
    }
  }

  /**
   * main
   */
  public static void main(String[] args)
  {
    HelloWorld hello = new HelloWorld("hello world!");
  }
}
