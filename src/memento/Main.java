import lib.*;

public class Main
{
    public static void main(String[] args)
    {
        Caretaker caretaker = new Caretaker();

        Originator originator = new Originator();
        originator.set("state1");
        originator.set("state2");
        caretaker.addMemento(originator.save());
        originator.set("state3");
        caretaker.addMemento(originator.save());
        originator.set("state4");
        caretaker.addMemento(originator.save());

        System.out.println("\n");
        for(int i = 0; i < 3; i++) {
            originator.restore(caretaker.getMemento(i));
        }
    }
}
