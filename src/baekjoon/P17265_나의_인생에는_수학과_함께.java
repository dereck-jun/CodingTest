package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P17265_나의_인생에는_수학과_함께 {

	static String[][] s;
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	static int N;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		s = new String[N][N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				s[i][j] = st.nextToken();
			}
		}

		for (int i = 0; i < N; i++) {
			int value = 0;
			for (int j = 0; j < N; j++) {
				int startValue = Integer.parseInt(s[0][0]);
				dfs(0, 0, startValue, null);
			}
		}

		System.out.println(max + " " + min);
	}

	static void dfs(int x, int y, int value, String lastOperator) {
		if (x == N - 1 && y == N - 1) {
			min = Math.min(value, min);
			max = Math.max(value, max);
			return;
		}

		int[] dx = {1, 0};
		int[] dy = {0, 1};

		for (int i = 0; i < 2; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx < N && ny < N) {
				String str = s[ny][nx];

				if (isOperator(str)) {
					dfs(nx, ny, value, str);
				} else {
					int num = Integer.parseInt(str);

					if (lastOperator == null) {
						dfs(nx, ny, num, null);
					} else {
						int newVal = calculate(value, num, lastOperator);
						dfs(nx, ny, newVal, null);
					}
				}
			}
		}
	}

	static int calculate(int a, int b, String operator) {
		if (operator.equals("+")) {
			return a + b;
		}
		if (operator.equals("-")) {
			return a - b;
		}
		return a * b;
	}

	static boolean isOperator(String str) {
		return str.equals("+") || str.equals("-") || str.equals("*");
	}
}
