public class OutputHandler {

    public void printResult(int[] numbers, String sign, double result) {
        System.out.print(numbers[0]);

        for (int i = 1; i < numbers.length; i++) {
            System.out.print(" " + sign + " " + numbers[i]);
        }

        if (sign.equals("/")) {
            System.out.println(" = " + String.format("%.1f", result));
        } else {
            System.out.println(" = " + (int) result);
        }
    }
}
