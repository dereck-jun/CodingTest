package programmers;

import java.util.Scanner;

public class 직사각형_별찍기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        for (int i = 0; i < column; i++) {
            System.out.println("*".repeat(row));
        }

        // Stream 방식을 사용하면 코드 줄 수가 많아지지만 속도가 더 빠름
        // StringBuilder sb = new StringBuilder();
        // IntStream.range(0, row).forEach(num -> sb.append("*"));
        // IntStream.range(0, column).forEach(num -> System.out.println(sb.toString()));
    }
}
