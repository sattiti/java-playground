package lib;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class JInputObject
{
  /**
   * バイナリファイルパス
   */
  private String _path;



  /**
   *
   */
  public JInputObject(String path)
  {
    _path = path;
  }

  /**
   * display
   */
  public void display()
  {
    File f = new File(_path);

    try{
      ObjectInputStream ois = new ObjectInputStream(
          new BufferedInputStream(
            new FileInputStream(f)
            )
          );

      System.out.println("\n----- 結果開始 -----");

      Serializable m = null;

      Iterator it = ((List)ois.readObject()).iterator();
      while(it.hasNext()){
        m = (Serializable)it.next();
        System.out.println(m.toString());
      }

      System.out.println("\n----- 結果終了 -----");

      ois.close();

    }
    catch(ClassNotFoundException e){
      e.printStackTrace();
    }
    catch(IOException e){
      e.printStackTrace();
    }
  }
}

