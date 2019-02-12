package lib;

import java.util.ArrayList;
import java.util.List;

/**
 * 仲介
 */
public class Mediator
{
    /**
     * 貸主リスト
     */
    private List<Lessor> _lessorList;

    /**
     * 借主リスト
     */
    private List<Debtor> _debtorList;



    /**
     *
     */
    public Mediator()
    {
        _lessorList = new ArrayList<Lessor>();
        _debtorList = new ArrayList<Debtor>();
    }

    /**
     * 貸主の登録
     */
    public void registerLessor(Lessor lessor)
    {
        _lessorList.add(lessor);
    }

    /**
     * 借主登録
     */
    public void registerDebtor(Debtor debtor)
    {
        _debtorList.add(debtor);
    }

    /**
     * 借主の条件に合致する物件を探す
     */
    public void matchLessor(Debtor debtor)
    {
        for(Lessor lessor : _lessorList){
            if(lessor.getFee() == debtor.getFee() && lessor.getWidth() == debtor.getWidth()){
                System.out.println("[Lessor name] : " + lessor.getName());
            }
            else {
                System.out.println("なし");
            }
        }
    }

    /**
     * 貸主の条件に合致する借主を照会する
     */
    public void matchDebtor(Lessor lessor)
    {
        for(Debtor debtor : _debtorList){
            if(lessor.getFee() == debtor.getFee() && lessor.getWidth() == lessor.getWidth()){
                System.out.println("[Debtor name] : " + debtor.getName());
            }
            else {
                System.out.println("なし");
            }
        }
    }
}
