import lib.*;
import java.util.Arrays;
import java.util.List;

/**
 * Factory Method パターンは、オブジェクトの生成をサブクラスに
 * 委ねることによって、プログラム内で使用されるインスタンスの
 * 型の制約を緩めることを目的とする。
 * Virtual Constructor パターンとも呼ばれる。
 */
public class Main
{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("melon", "orange", "banana", "apple", "water melon", "jam");

        System.out.println("五十音順で表示:");
        new DictionaryOrderListPrinter().printList(list);

        System.out.println();

        System.out.println("長さ順で表示:");
        new LengthOrderListPrinter().printList(list);
    }
}
