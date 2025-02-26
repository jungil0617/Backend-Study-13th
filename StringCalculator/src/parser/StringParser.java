package parser;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringParser {

    public String[] splitExpression(String input) {
        return input.split(" ");
    }

    public List<Double> getNumberList(String input) {
        return Arrays.stream(input.split(Separator.getRegex()))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
    }
}
