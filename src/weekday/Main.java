public class Main
{
  public static void main(String[] args){
    if(args.length <= 0){
      System.out.println("年月日を入力して下さい。");
      System.exit(1);
    }
    else {
      int yy = Integer.parseInt(args[0]);
      int mm = Integer.parseInt(args[1]);
      int dd = Integer.parseInt(args[2]);
      String[] wDay = {"日", "月", "火", "水", "木", "金", "土"};

      int d = (yy +
          (int)(yy /4) -
          (int)(yy /100) +
          (int)(yy /400) +
          (int)(13 * mm + 8) /5 + dd
          ) % 7;

      System.out.printf("今日は %d年%d月%d日 %s曜日 です。", yy, mm, dd, wDay[d]);
    }
  }
}
