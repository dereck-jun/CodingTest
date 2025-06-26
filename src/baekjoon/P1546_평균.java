package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.StringTokenizer;

public class P1546_평균 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		BigDecimal max = BigDecimal.ZERO;
		int N = Integer.parseInt(br.readLine());
		BigDecimal[] arr = new BigDecimal[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = new BigDecimal(st.nextToken());

			if (arr[i].compareTo(max) > 0) {
				max = arr[i];
			}
		}

		BigDecimal sum = BigDecimal.ZERO;
		for (int i = 0; i < N; i++) {
			BigDecimal converted = arr[i]
				.divide(max, 10, RoundingMode.HALF_UP)   // 점수 / max
				.multiply(BigDecimal.valueOf(100));
			sum = sum.add(converted);
		}

		BigDecimal avg = sum.divide(BigDecimal.valueOf(N), 2, RoundingMode.HALF_UP);
		System.out.println(avg);
	}

}
