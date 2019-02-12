import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main
{
  public static void main(String[] args)
  {
    Connection con       = null;
    PreparedStatement ps = null;

    try{
      // ドライバクラスをロード
      Class.forName("com.mysql.jdbc.Driver");

      // データベースへ接続
      con = DriverManager.getConnection("jdbc:mysql://localhost/kiso_sample","root","root");

      // name,bloodType,ageのデータを検索するSQL文を作成
      String sql = "SELECT * FROM member";

      // ステートメントオブジェクトを生成
      ps = con.prepareStatement(sql);

      // クエリーを実行して結果セットを取得
      ResultSet rs = ps.executeQuery();

      // 検索された行数分ループ
      while(rs.next()){
        // nameデータを取得
        String name = rs.getString("name");

        // bloodTypeデータを取得
        String age  = rs.getString("age");

        // データの表示
        System.out.println("name;"+" "+name);
        System.out.println("age;"+" "+age );
      }
    }
    catch (SQLException e){
      e.printStackTrace();
    }
    catch (ClassNotFoundException e){
      e.printStackTrace();
    }
    finally{
      try{
        // close処理
        if(ps != null){
          ps.close();

          // close処理
          if(con != null) con.close();
        }
      }
      catch(SQLException e){
        e.printStackTrace();
      }
    }
  }
}
