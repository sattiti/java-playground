package lib;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.Serializable;

public class JInputStream implements Serializable
{
  /**
   *
   */
  private String _path;



  public JInputStream(String path)
  {
    _path = path;
  }

  public void display()
  {
    File f = new File(_path);

    try{
      BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));

      byte[] b = new byte[1024];
      while((bis.read(b)) != -1){
        System.out.println(new String(b));
      }

      bis.close();
    }
    catch(FileNotFoundException e){
      e.printStackTrace();
    }
    catch(IOException e){
      e.printStackTrace();
    }

  }
}
