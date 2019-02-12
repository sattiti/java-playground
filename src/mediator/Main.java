import lib.*;

public class Main
{
    /**
     * mediator
     *
     * Mediatorパターンでは、異なるオブジェクト同士は協調して
     * 動作する必要がある場合、明示的に参照し合うことをせず、
     * Mediator(仲介者)を介して行います。
     *
     * A は B を直接利用せず、mediator に介して処理を行う
     *
     * 利用シーン:
     *     # クラスのオブジェクト同士の協調関係が煩雑であること
     *     # クラスの責任を単一化にしたいこと
     *     # クラスのオブジェクト同士の協調関係を集中管理にしたいこと
     *
     * メリット:
     *     # クラスに必要だけの責任を持つことで、各クラスの責任を
     *       明確することができます。
     *     # オブジェクト間の協調関係をMediatorで集中管理すること
     *       ができます。
     *     # 協調しあうオブジェクト同士は直接参照しないようにする
     *       ことで、元々オブジェクト間の「N対N」の関係をMediator
     *       との「1対1」の関係にまで単純化することができ、各クラス
     *       間の依存度を下げ、低結合度を実現することができます。
     *
     * 設定 : 賃貸
     * 貸主、借主の抽象クラス : Houser
     * 貸主 : Lessor
     * 借主 : Debtor
     * 仲介 : Mediator
     *
     */
    public static void main(String[] args)
    {
        Mediator mediator = new Mediator();

        // 貸主物件登録
        Lessor la = new Lessor(mediator, "LA", Lessor.WIDTH_1DK, 80000);
        Lessor lb = new Lessor(mediator, "LB", Lessor.WIDTH_2LDK, 100000);
        Lessor lc = new Lessor(mediator, "LC", Lessor.WIDTH_3DK, 180000);

        // 借主登録
        Debtor da = new Debtor(mediator, "DA", Debtor.WIDTH_2LDK, 100000);

        la.match();
        lb.match();
        lc.match();

        System.out.println("");
        da.match();
    }
}
