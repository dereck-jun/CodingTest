package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class P2018_수들의_합 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		int startIndex = 1;
		int endIndex = 1;
		int sum = 1;

		while (endIndex != N) {
			if (sum == N) {
				count++;
				endIndex++;
				sum += endIndex;
			} else if (sum > N) {
				sum -= startIndex;
				startIndex++;
			} else {
				endIndex++;
				sum += endIndex;
			}
		}
		System.out.println(count);
	}
}
