import lib.*;

public class Main
{
    /**
     * よくあるシーンの例：
     *
     * Multi-level undo
     * Transactional behavior
     * Progress bar
     * Wizards
     * Thread pools
     * Macro recording
     * Networking
     *
     * Command 抽象クラス : Command
     * 呼び出しターゲット : Receiver
     * Invorker で Command を呼出し : Invorker
     */
    public static void main(String[] args)
    {
        CommandManager cmdManager = new CommandManager();
        Receiver r = new Receiver();

        System.out.println("-- exec --");
        Command c1 = new ConcreteCommand(r, "aaa");
        Command c2 = new ConcreteCommand(r, "bbb");
        Command c3 = new ConcreteCommand(r, "ccc");
        Command c4 = new ConcreteCommand(r, "ddd");
        cmdManager.exec(c1);
        cmdManager.exec(c2);
        cmdManager.exec(c3);
        cmdManager.exec(c4);

        System.out.println(r.getData());

        System.out.println("-- Undo --");
        cmdManager.undo();
        cmdManager.undo();
        cmdManager.undo();
        System.out.println(r.getData());
    }
}
