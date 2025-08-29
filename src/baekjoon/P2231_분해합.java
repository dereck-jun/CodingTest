package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2231_분해합 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int n = Integer.parseInt(input);
		int start = Math.max(1, n - (input.length() * 9));

		for (int i = start; i <= n; i++) {
			String[] arr = String.valueOf(i).split("");
			int sum = i;

			for (int j = 0; j < arr.length; j++) {
				sum += Integer.parseInt(arr[j]);
			}

			if (sum == n) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}
}
