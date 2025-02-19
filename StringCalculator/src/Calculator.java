public class Calculator {

    public void calculator(int[] numbers, String sign) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("계산할 숫자가 없습니다.");
        }

        if (!sign.matches("[+\\-*/]")) {
            throw new IllegalArgumentException("잘못된 연산자입니다: " + sign);
        }

        System.out.print(numbers[0]);
        double result = numbers[0];

        for(int i = 1; i < numbers.length; i++ ) {
            System.out.print(" " + sign + " " + numbers[i]); // 연산 과정 출력

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

        if (sign.equals("/")) {
            System.out.println(" = " + String.format("%.1f", result));
        } else {
            System.out.println(" = " + (int) result);
        }
    }
}
