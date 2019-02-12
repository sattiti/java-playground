package lib;
// import java.io.BufferedReader;
// import java.io.FileReader;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.System;
import java.util.Map;
import java.util.HashMap;

public class JFileWriter{
  private String _path;
  private boolean _append;
  public JFileWriter(String path, boolean append){
    _path   = path;
    _append = append;
  }

  public void write(){
    // File を生成
    File f = new File(_path);

    try{
      // 存在するかどうか
      if(f.exists()){
        System.out.println("存在する");

        // ファイルであるかどうか
        if(f.isFile()){
          System.out.println("ファイルです");

          // 書き込み可能かどうか
          if(f.canWrite()){
            System.out.println("書き込み可能");
            System.out.println("追加書き込みします。");

            //f.delete();
            _writeIn(f, _append);
          }
        }
        else {
          System.out.println("ファイルではないので。。");
          return;
        }
      }
      else {
        System.out.println("存在しない。");
        System.out.println("新しいファイルを作りますね。");
        f.createNewFile();
        System.out.println("新しいファイルを作りました。");

        //f.delete();
        _writeIn(f, _append);
      }
    }
    catch(IOException e) {
      e.printStackTrace();
    }
  }


  /**
   * 書き込み処理
   *
   * @param File f
   */
  private void _writeIn(File f, Boolean append) throws IOException
  {
    // BufferedWriter を生成
    BufferedWriter bw = new BufferedWriter(new FileWriter(f, append));

    Map<String, String> env = new HashMap<String, String>();
    env = System.getenv();

    System.out.println("書き込み開始！");

    for(Object k : env.keySet()){
      bw.write(k + " : " + env.get(k));

      // 改行
      bw.newLine();
    }

    // close
    bw.flush();
    bw.close();

    System.out.println("書き込み完了！");
  }
}
