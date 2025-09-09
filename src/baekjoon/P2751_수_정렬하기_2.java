package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2751_수_정렬하기_2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);

		StringBuilder sb = new StringBuilder();  // 출력 시 시간 초과 발생 방지를 위해 StringBuilder로 모아서 한 번에 출력
		for (int num : arr) {
			sb.append(num).append('\n');
		}

		System.out.print(sb);
	}
}
