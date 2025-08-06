package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2437_저울 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(nums);

		int sum = 0;

		for (int num : nums) {
			if (num > sum + 1) {
				/*
				 [1, 1, 1]의 경우 해당 위치에서 출력할 경우 if 문을 통과하지 못해 아무것도 출력되지 않게 된다.
				 1) num = 1, sum = 0 (false)
				 2) num = 1, sum = 1 (false)
				 3) num = 1, sum = 2 (false)
				*/
				// System.out.println(sum + 1);
				break;
			}

			sum += num;
		}

		System.out.println(sum + 1);
	}
}
