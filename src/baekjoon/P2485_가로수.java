package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2485_가로수 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		int g = 0;
		for (int i = 1; i < n; i++) {
			int gap = arr[i] - arr[i - 1];
			g = gcd(g, gap);
		}

		for (int i = 1; i < n; i++) {
			count += (arr[i] - arr[i - 1]) / g - 1;
		}

		System.out.println(count);
	}

	public static int gcd(int a, int b) {
		if (a % b != 0) {
			return gcd(b, a % b);
		}
		return b;
	}
}
