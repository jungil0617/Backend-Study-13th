package parser;

import error.ErrorMessage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringParser {

    public String[] splitExpression(String input) {
        return input.split(" ");
    }

    public List<Double> getNumberList(String input) {
        try {
            return Arrays.stream(input.split(Separator.getRegex()))
                    .map(Double::parseDouble)
                    .collect(Collectors.toList());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_NUMBER_FORMAT.getMessage());
        }
    }
}
