package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3009_네_번째_점 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] x = new int[3];
		int[] y = new int[3];

		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}

		int x4 = (x[0] == x[1]) ? x[2] : (x[0] == x[2]) ? x[1] : x[0];
		int y4 = (y[0] == y[1]) ? y[2] : (y[0] == y[2]) ? y[1] : y[0];

		System.out.println(x4 + " " + y4);
	}
}
