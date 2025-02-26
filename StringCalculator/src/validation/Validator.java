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

}
