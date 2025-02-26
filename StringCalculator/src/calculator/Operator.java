package calculator;

import error.ErrorMessage;

import java.util.Arrays;

public enum Operator {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private final String symbol;

    Operator(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public static Operator getOperator(String input) {
        return Arrays.stream(Operator.values())
                .filter(op -> op.getSymbol().equals(input))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(ErrorMessage.INVALID_OPERATOR.getMessage()));
    }
}
