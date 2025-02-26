package calculator;

import validation.Validator;

import java.util.List;

public class Calculator {

    public static double calculate(List<Double> numbers, Operator operator) {
        double result = numbers.getFirst();

        for (int i = 1; i < numbers.size(); i++) {
            switch (operator) {
                case ADD -> result += numbers.get(i);
                case SUBTRACT -> result -= numbers.get(i);
                case MULTIPLY -> result *= numbers.get(i);
                case DIVIDE -> {
                    if (numbers.get(i) == 0) {
                        Validator.validateDivisionByZero(numbers.get(i));
                    }
                    result /= numbers.get(i);
                }
            }
        }
        return result;
    }
}
