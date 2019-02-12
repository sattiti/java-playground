public class Main
{
  public static void main(String[] args){
    char str = 'c';

    /**
     * switch 文
     *
     * int のみ。
     * byte, short, char 型が自動的に int 型に拡大変換するため、利用可能。
     * enum 型も利用可能。
     */
    switch(str) {
      case 'd':
        // 実行内容
        System.out.println("1.No");
        // break が省略可能。省略された場合、switch 文を抜けぬ、次の case にいく。
        break;
      case 'c':
        System.out.println("2.Yes");
        break;
        // default が省略可能。省略された場合、なにも起こらない。
      default:
        System.out.println("default");
    }
  }
}
