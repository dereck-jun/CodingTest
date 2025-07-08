package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2444_별_찍기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		for (int i = 1; i <= N; i++) {
			sb.append(" ".repeat(N - i));
			sb.append("*".repeat(i * 2 - 1));
			sb.append("\n");
		}

		for (int i = N - 1; i >= 1; i--) {
			sb.append(" ".repeat(N - i));
			sb.append("*".repeat(i * 2 - 1));
			sb.append("\n");
		}

		System.out.print(sb);
	}
}
