package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P10813_공_바꾸기 {

	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			int[] arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = i + 1;
			}

			for (int j = 0; j < M; j++) {
				st = new StringTokenizer(br.readLine());
				int b1 = Integer.parseInt(st.nextToken());
				int b2 = Integer.parseInt(st.nextToken());

				int tmp = arr[b1 - 1];
				arr[b1 - 1] = arr[b2 - 1];
				arr[b2 - 1] = tmp;
			}

			for (int num : arr) {
				bw.write(num + " ");
			}
			bw.flush();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
