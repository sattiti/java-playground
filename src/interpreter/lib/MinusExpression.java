package lib;

public class MinusExpression extends Expression
{
    @Override
    public void interpret(Context context)
    {
        System.out.println("Minus --");

        String input     = context.getInput();
        int parsedResult = Integer.parseInt(input);
        parsedResult--;

        context.setInput(String.valueOf(parsedResult));
        context.setOutput(parsedResult);
    }
}
