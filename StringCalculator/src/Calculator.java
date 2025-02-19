public class Calculator {

    public double calculate(int[] numbers, String sign) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("계산할 숫자가 없습니다.");
        }

        if (!sign.matches("[+\\-*/]")) {
            throw new IllegalArgumentException("잘못된 연산자입니다: " + sign);
        }

        double result = numbers[0];

        for(int i = 1; i < numbers.length; i++ ) {
            switch (sign) {
                case "+":
                    result += numbers[i];
                    break;
                case "-":
                    result -= numbers[i];
                    break;
                case "*":
                    result *= numbers[i];
                    break;
                case "/":
                    if (numbers[i] == 0) {
                        throw new ArithmeticException("0으로 나눌 수 없습니다.");
                    }
                    result /= numbers[i];
                    break;
            }
        }

        return result;
    }
}
