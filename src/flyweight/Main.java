import lib.*;

import java.util.ArrayList;

public class Main
{
  /**
   * 実行
   */
  public static void main(String[] args)
  {
    StampFactory factory = new StampFactory();
    ArrayList<Stamp> stamps = new ArrayList<Stamp>();
    stamps.add(factory.getStamp("i"));
    stamps.add(factory.getStamp("b"));
    stamps.add(factory.getStamp("b"));
    stamps.add(factory.getStamp("h"));
    stamps.add(factory.getStamp("o"));
    stamps.add(factory.getStamp("b"));
    stamps.add(factory.getStamp("h"));
    stamps.add(factory.getStamp("e"));
    stamps.add(factory.getStamp("w"));
    stamps.add(factory.getStamp("w"));
    stamps.add(factory.getStamp("a"));
    stamps.add(factory.getStamp("a"));
    stamps.add(factory.getStamp("a"));
    stamps.add(factory.getStamp("a"));
    stamps.add(factory.getStamp("a"));
    stamps.add(factory.getStamp("o"));
    stamps.add(factory.getStamp("p"));

    for(Stamp s : stamps) {
      s.print();
    }
  }
}
