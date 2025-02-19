public class StringCalculator {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        OutputHandler outputHandler = new OutputHandler();
        StringParser stringParser = new StringParser();
        Calculator calculator = new Calculator();

        String input = inputHandler.getInput();

        stringParser.parse(input);

        int[] numbers = stringParser.getNumbers();
        String sign = stringParser.getSign();

        double result = calculator.calculate(numbers, sign);

        outputHandler.printResult(numbers, sign, result);

        inputHandler.close();
    }
}