package programmers;

import java.util.Scanner;

public class 직각삼각형_출력하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("*".repeat(i));
            System.out.println();
        }
    }
}
