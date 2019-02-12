package lib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Creatpr に相当する
public abstract class ListPrinter
{
    /**
     * anOperaton に相当する
     *
     * @param list
     */
    public void printList(List<String> list)
    {
        Comparator<String> comparator = createComparator();
        list = new ArrayList<String>(list);

        Collections.sort(list, comparator);

        for(String item : list){
            System.out.println(item);
        }
    }

    /**
     * factory method に相当する
     */
    public abstract Comparator<String> createComparator();
}
