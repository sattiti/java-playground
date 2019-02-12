package lib;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class JFileReader{
  private String _path;
  public JFileReader(String path){
    _path = path;
  }

  public void display(){
    // file 生成
    File f = new File(_path);

    try{
      System.out.println("----- FileReader Start -----");

      // 一文字、一文字を読込用
      FileReader fr     = new FileReader(f);
      // 行を読込用
      BufferedReader br = new BufferedReader(fr);

      String line = null;

      // 一行ずつ読み込んで、処理をする
      while((line = br.readLine()) != null){
        System.out.println(line);
      }

      // 逆順にする
      br.close();
      fr.close();

      System.out.println("----- FileReader End -----");
    }
    catch(IOException e){
      e.printStackTrace();
    }
  }
}
