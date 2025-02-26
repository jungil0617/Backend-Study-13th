package output;

import calculator.Operator;
import java.util.List;

public class OutputHandler {

    public static void printResult(List<Double> numbers, Operator operator, double result) {
        System.out.print(formatNumber(numbers.get(0)));

        for (int i = 1; i < numbers.size(); i++) {
            System.out.print(" " + operator.getSymbol() + " " + formatNumber(numbers.get(i)));
        }

        String formattedResult = (operator == Operator.DIVIDE)
                ? String.format(" = %.1f", result)
                : String.format(" = %d", (int) result);

        System.out.println(formattedResult);
    }

    private static String formatNumber(Double number) {
        return (number % 1 == 0) ? String.format("%d", number.longValue()) : String.format("%.1f", number);
    }
}
