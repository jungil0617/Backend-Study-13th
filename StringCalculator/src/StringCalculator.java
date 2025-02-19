import java.util.Scanner;

public class StringCalculator {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        StringParser stringParser = new StringParser();
        Calculator calculator = new Calculator();

        String input = inputHandler.getInput();

        stringParser.parse(input);

        int[] numbers = stringParser.getNumbers();
        String sign = stringParser.getSign();

        calculator.calculator(numbers, sign);

        inputHandler.close();
    }
}