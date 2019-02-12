import lib.*;

public class Main
{
    public static void main(String[] args)
    {
        try{
            PrototypeFactory pf = null;

            int num = 1000;

            PrototypeFactory prot = new PrototypeImp(num);
            Prototype p = new Prototype(prot);

            for(int i = 0; i < 10; i++) {
                pf = p.makeCopy();
                pf.prototypeFactory(i * num);
                pf.printValue();
            }

        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}

