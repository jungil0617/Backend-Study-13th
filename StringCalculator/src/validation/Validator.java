package validation;

import error.ErrorMessage;

public class Validator {

    public static void validatorInput(String input) {
        checkEmpty(input);
        checkNull(input);
    }

    public static void checkNull(String string) {
        if(string == null) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_IS_NULL.getMessage());
        }
    }

    public static void checkEmpty(String string) {
        if (string.isEmpty()) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_IS_EMPTY.getMessage());
        }
    }

    public static void validateDivisionByZero(double number) {
        if (number == 0) {
            throw new ArithmeticException(ErrorMessage.DIVIDE_BY_ZERO.getMessage());
        }
    }
}
