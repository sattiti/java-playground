package lib;

import java.util.Comparator;

// ConcreteCreator に相当する
public class DictionaryOrderListPrinter extends ListPrinter
{
    /**
     * 
     */
    @Override
    public Comparator<String> createComparator()
    {
        return new DictionaryOrderComparator();
    }
}
