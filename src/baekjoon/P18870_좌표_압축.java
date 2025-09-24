package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class P18870_좌표_압축 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] nums = new long[n];
		Map<Long, Integer> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			nums[i] = Long.parseLong(st.nextToken());
		}

		long[] distAndSorted = Arrays.stream(nums)
			.distinct()
			.sorted()
			.toArray();

		for (int i = 0; i < distAndSorted.length; i++) {
			map.put(distAndSorted[i], i);
		}

		for (int i = 0; i < n; i++) {
			sb.append(map.get(nums[i])).append(" ");
		}

		System.out.println(sb.toString().trim());
	}

}
