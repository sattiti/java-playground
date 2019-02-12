package lib;

import java.util.Comparator;

// ConcreteProduct に相当する
public class LengthOrderComparator implements Comparator<String>
{
    public int compare(String str1, String str2)
    {
        return str1.length() - str2.length();
    }
}
