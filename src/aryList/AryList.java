import java.util.*;

public class AryList{
  private ArrayList<Integer> _list;
  public AryList(){
    _list = new ArrayList<Integer>();
  }

  public void addAry(){
    for(int n = 0; n < 10; n++) {
      _list.add(n);
    }
    System.out.println(_list);
  }

  public static void main(String[] args){
    AryList al = new AryList();
    al.addAry();
  }
}
