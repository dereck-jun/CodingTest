package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2501_약수_구하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
//		Queue<Integer> queue = new PriorityQueue<>();
//
//		for (int i = 1; i <= N; i++) {
//			if (N % i == 0) {
//				queue.add(i);
//			}
//		}
//
//		for (int i = 0; i < K - 1; i++) {
//			queue.poll();
//		}
//
//		System.out.println(queue.peek() != null ? queue.peek() : 0);

		// ---

		int[] arr = new int[N];
		int idx = 0;
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				if (arr[K - 1] == 0) {
					arr[idx] = i;
					idx++;
				}
			}
		}

		System.out.println(arr[K - 1]);
	}

}
