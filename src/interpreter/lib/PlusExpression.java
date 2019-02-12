package lib;

public class PlusExpression extends Expression
{
    @Override
    public void interpret(Context context)
    {
        System.out.println("Plus ++");

        String input     = context.getInput();
        int parsedResult = Integer.parseInt(input);
        parsedResult++;

        context.setInput(String.valueOf(parsedResult));
        context.setOutput(parsedResult);
    }
}
