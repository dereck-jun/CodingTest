package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P9063_대지 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int x1 = Integer.MAX_VALUE;
		int x2 = Integer.MIN_VALUE;
		int y1 = Integer.MAX_VALUE;
		int y2 = Integer.MIN_VALUE;

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int inputX = Integer.parseInt(st.nextToken());
			int inputY = Integer.parseInt(st.nextToken());

			x1 = Math.min(x1, inputX);
			x2 = Math.max(x2, inputX);
			y1 = Math.min(y1, inputY);
			y2 = Math.max(y2, inputY);
		}

		System.out.println((x2 - x1) * (y2 - y1));
	}
}
