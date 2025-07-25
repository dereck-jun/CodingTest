package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P5086_배수와_약수 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = -1;
		int num2 = -1;

		while (num1 != 0 && num2 != 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			num1 = Integer.parseInt(st.nextToken());
			num2 = Integer.parseInt(st.nextToken());

			if (num1 > num2) {
				if (num1 % num2 == 0) {
					System.out.println("multiple");
				} else {
					System.out.println("neither");
				}
			}

			if (num1 < num2) {
				if (num2 % num1 == 0) {
					System.out.println("factor");
				} else {
					System.out.println("neither");
				}
			}
		}
	}
}
