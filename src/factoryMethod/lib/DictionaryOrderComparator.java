package lib;

import java.util.Comparator;

// java.util.Comparator が Product に相当する
// ConcreteProduct に相当する
public class DictionaryOrderComparator implements Comparator<String>
{
    /**
     * compare
     *
     * @param str1
     * @param str2
     */
    @Override
    public int compare(String str1, String str2)
    {
        return str1.compareTo(str2);
    }
}
