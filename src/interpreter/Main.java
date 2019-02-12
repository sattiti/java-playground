import lib.*;

import java.util.List;
import java.util.ArrayList;

/**
 * あらかじめ定義された文法表現を素早く解釈することができます。
 */
public class Main
{
    public static void main(String[] args)
    {
        String inputExp = "10";

        System.out.println("最初の数値 : " + inputExp);

        Context context = new Context(inputExp);

        List<Expression> list = new ArrayList<Expression>();
        list.add(new PlusExpression());
        list.add(new PlusExpression());
        list.add(new MinusExpression());
        list.add(new PlusExpression());
        list.add(new MinusExpression());
        list.add(new PlusExpression());
        list.add(new MinusExpression());
        list.add(new MinusExpression());
        list.add(new MinusExpression());
        list.add(new MinusExpression());
        list.add(new MinusExpression());
        list.add(new MinusExpression());
        list.add(new MinusExpression());
        list.add(new MinusExpression());

        int len = list.size();

        for(int i = 0; i < len; i++){
            Expression expression = list.get(i);
            expression.interpret(context);
        }

        System.out.println("結果 : " + context.getOutput());
    }
}
