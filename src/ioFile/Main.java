import lib.*;

public class Main
{
  public static void main(String[] args)
  {
    String path = args[0];
    boolean append = args[1].equals("true") ? true : false;

    // 書き込み
    new JFileWriter(path, append).write();

    // 読み込み
    new JFileReader(path).display();
  }
}
