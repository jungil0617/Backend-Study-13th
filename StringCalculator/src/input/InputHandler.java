package input;

import java.util.Scanner;

public class InputHandler {
    Scanner sc = new Scanner(System.in);

    public String getInput() {
        System.out.print("계산할 식을 입력해주세요 : ");

        String input = sc.nextLine().trim();

        if (input.isEmpty()) {
            throw new IllegalArgumentException("입력값이 비어있습니다.");
        }

        return input;
    }

    public void close() {
        sc.close();
    }
}
