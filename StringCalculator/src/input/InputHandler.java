package input;

import java.util.Scanner;
import validation.Validator;

public class InputHandler {
    private final Scanner scanner = new Scanner(System.in);

    public String getInput() {
        String input = scanner.nextLine();
        Validator.validatorInput(input);

        return input;
    }
}
