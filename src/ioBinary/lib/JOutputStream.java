package lib;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;


public class JOutputStream implements Serializable
{
  /**
   *
   */
  private String _path;

  /**
   *
   */
  private boolean _append;



  public JOutputStream(String path)
  {
    _path = path;
  }

  public void write()
  {
    File f = new File(_path);

    try{
      BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f));

      bos.write();
      //bos.write();

      bos.flush();
      bos.close();
    }
    catch(IOException e){
      e.printStackTrace();
    }
  }
}
