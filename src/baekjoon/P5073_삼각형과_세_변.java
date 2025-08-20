package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P5073_삼각형과_세_변 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			if (a == 0 && b == 0 && c == 0) {
				break;
			}

			int sum = a + b + c;
			int max = Math.max(a, Math.max(b, c));

			if (sum - max <= max) {
				System.out.println("Invalid");
				continue;
			}

			if (a == b && a == c) {
				System.out.println("Equilateral");
			} else if (a == b || a == c || b == c) {
				System.out.println("Isosceles");
			} else {
				System.out.println("Scalene");
			}
		}
	}

}
