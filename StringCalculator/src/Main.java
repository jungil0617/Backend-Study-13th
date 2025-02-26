import calculator.Calculator;
import calculator.Operator;
import input.InputHandler;
import output.OutputHandler;
import parser.StringParser;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        StringParser stringParser = new StringParser();

        final int OPERAND_INDEX = 0;
        final int OPERATOR_INDEX = 1;

        String input = inputHandler.getInput();
        String[] parsedExpression = stringParser.splitExpression(input);

        Operator operator = Operator.getOperator(parsedExpression[OPERATOR_INDEX]);

        List<Double> operands = stringParser.getNumberList(parsedExpression[OPERAND_INDEX]);

        double result = Calculator.calculate(operands, operator);

        OutputHandler.printResult(operands, operator, result);
    }
}
