package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2042_구간_합_구하기 {
	//TODO: 세그먼트 트리 방식으로 풀어야 함
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = Long.parseLong(br.readLine());
		}

		long[] S = new long[A.length + 1];
		for (int i = 0; i < A.length; i++) {
			S[i + 1] = S[i] + A[i];
		}

		for (int i = 0; i < M + K; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			long c = Long.parseLong(st.nextToken());

			if (a == 1) {
				A[b - 1] = c;
				for (int j = b; j < S.length; j++) {
					S[j] = S[j - 1] + A[j - 1];
				}
			}

			if (a == 2) {
				System.out.println(S[(int)c] - S[b - 1]);
			}
		}
	}
}
