public class StringTest
{
  /**
   * msg
   *
   * @var String
   */
  private String _msg;

  /**
   * constructor
   */
  public StringTest()
  {
    _msg = "helloworld";
  }

  /**
   * compare to.
   *
   * @param  String
   * @return void
   */
  public void compareTo(String str)
  {
    String resurit;
    if(_msg.compareTo(str) == 0) {
      resurit = "Yes!";
    }
    else {
      resurit = "No!";
    }
    System.out.println(resurit);
  }

  /**
   * compare to ingnore case.
   *
   * @param  String
   * @return void
   */
  public void compareToIgnoreCase(String str)
  {
    String resurit;
    if(_msg.compareTo(str) == 0) {
      resurit = "Yes!";
    }
    else {
      resurit = "No!";
    }
    System.out.println(resurit);
  }

  /**
   * equals
   *
   * @param  String
   * @return void
   */
  public void isEquals(String str)
  {
    String resurit;
    if(_msg.equals(str)) {
      resurit = "Yes!";
    }
    else {
      resurit = "No!";
    }
    System.out.println(resurit);
  }

  /**
   * equals ignore case.
   *
   * @param  String
   * @return void
   */
  public void isEqualsIgnoreCase(String str)
  {
    String resurit;
    if(_msg.equalsIgnoreCase(str)) {
      resurit = "Yes!";
    }
    else {
      resurit = "No!";
    }
    System.out.println(resurit);
  }

  /**
   * character at.
   *
   * @param  int
   * @return void
   */
  public void getCharAt(int n)
  {
    System.out.println(_msg.charAt(n));
  }

  /**
   * index of.
   *
   * @param  String
   * @param  int
   * @return void
   */
  public void getIndexOf(String s)
  {
    System.out.println(_msg.indexOf(s));
  }

  public void getIndexOf(String s, int n)
  {
    System.out.println(_msg.indexOf(s, n));
  }

  /**
   * last index of.
   *
   * @param  String
   * @param  int
   * @return void
   */
  public void getLastIndexOf(String s)
  {
    System.out.println(_msg.indexOf(s));
  }

  public void getLastIndexOf(String s, int n)
  {
    System.out.println(_msg.indexOf(s, n));
  }

  /**
   * splitStr
   *
   * @param  String
   * @return void
   */
  public void splitStr(String s)
  {
    String [] str = _msg.split(s);
    int len       = str.length;

    for(int n =0; n < len; n++ ) {
      System.out.println(str[n]);
    }
  }


  /**
   * main
   */
  public static void main(String[] args){
    StringTest q = new StringTest();
    q.isEquals("helloWorld");
    q.isEqualsIgnoreCase("helloWorld");
    q.compareTo("helloworld");
    q.compareToIgnoreCase("helloWorld");
    q.getCharAt(3);
    q.getIndexOf("hello");
    q.splitStr("l");
  }
}
