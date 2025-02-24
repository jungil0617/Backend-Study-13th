package parser;

public class StringParser {
    private String number;
    private String sign;

    public void parse(String input) {
        if(input == null || input.isEmpty()) {
            throw new IllegalArgumentException("입력값이 비어있습니다.");
        }

        String[] parts = input.split(" ");

        if (parts.length < 2) {
            throw new IllegalArgumentException("잘못된 입력 형식입니다.");
        }

        this.number = parts[0];
        this.sign = parts[1];
    }

    public int[] getNumbers() {
        String[] numbers = number.split("[:,]");

        int[] intNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            intNumbers[i] = Integer.parseInt(numbers[i]);
        }

        return intNumbers;
    }

    public String getSign() {
        return sign;
    }
}
