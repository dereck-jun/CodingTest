package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2738_행렬_덧셈 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int outer = Integer.parseInt(st.nextToken());
		int inner = Integer.parseInt(st.nextToken());
		int[][] arr = new int[outer][inner];

		// A
		for (int i = 0; i < outer; i++) {
			int sum = 0;
			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < inner; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		// B
		for (int i = 0; i < outer; i++) {
			int sum = 0;
			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < inner; j++) {
				arr[i][j] += Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < outer; i++) {
			for (int j = 0; j < inner; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

}
