package lib;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class JOutputObject
{
  /**
   *
   */
  private String _path;

  /**
   *
   */
  private List<Serializable> _objs;



  /**
   *
   */
  public JOutputObject(String path)
  {
    // path
    _path = path;

    // objs
    _objs = new ArrayList<Serializable>();
  }

  /**
   * オブジェクトを追加
   *
   * @param Serializable
   */
  public void addObj(Serializable o)
  {
    _objs.add(o);
  }

  /**
   * 書き込み
   */
  public void write()
  {
    File f = new File(_path);

    try{
      ObjectOutputStream oos = new ObjectOutputStream(
          new BufferedOutputStream(
            new FileOutputStream(f)
            )
          );

      System.out.println("\n----- 書き込み開始 -----");

      /*
      // 書き込み
      Iterator it = _objs.iterator();
      Serializable m = null;

      // 内容を出力するための動作です
      while(it.hasNext()){
      m = (Serializable)it.next();
      System.out.println(m.toString());
      }
      */

      // ArrayListのまま書込み
      oos.writeObject(_objs);

      oos.close();

      // メッセージ
      System.out.println("\n----- 書き込み完了 -----");
    }
    catch(FileNotFoundException e){
      e.printStackTrace();
    }
    catch(IOException e){
      e.printStackTrace();
    }
  }
}
