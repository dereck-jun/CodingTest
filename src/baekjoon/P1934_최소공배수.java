package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1934_최소공배수 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());

			sb.append((num1 * num2) / gcd(num1, num2)).append("\n");
		}

		System.out.println(sb);
	}

	private static int gcd(int a, int b) {
		if (a % b != 0) {
			return gcd(b, a % b);
		}
		return b;
	}
}
