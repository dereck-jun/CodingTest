package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P11653_소인수분해 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		while (input > 1) {
			for (int i = 2; i <= input; i++) {
				if (input % i == 0) {
					input /= i;
					sb.append(i).append("\n");
					break;
				}
			}
		}

		System.out.println(sb);
	}
}
