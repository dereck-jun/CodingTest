package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import java.util.StringTokenizer;

public class P25206_너의_평점은 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigDecimal total = BigDecimal.ZERO;
		BigDecimal totalSub = BigDecimal.ZERO;

		Map<String, BigDecimal> map = Map.of(
			"A+", BigDecimal.valueOf(4.5),
			"A0", BigDecimal.valueOf(4.0),
			"B+", BigDecimal.valueOf(3.5),
			"B0", BigDecimal.valueOf(3.0),
			"C+", BigDecimal.valueOf(2.5),
			"C0", BigDecimal.valueOf(2.0),
			"D+", BigDecimal.valueOf(1.5),
			"D0", BigDecimal.valueOf(1.0),
			"F",  BigDecimal.valueOf(0.0)
		);

		for (int i = 0; i < 20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			st.nextToken();
			BigDecimal subject = new BigDecimal(st.nextToken());
			String grade = st.nextToken();

			if (grade.equals("P")) {
				continue;
			}

			BigDecimal value = map.get(grade);
			total = total.add(subject.multiply(value));
			totalSub = totalSub.add(subject);
		}

		if (totalSub.compareTo(BigDecimal.ZERO) == 0) {
			System.out.println("0.000000");
		} else {
			System.out.println(total.divide(totalSub, 6, RoundingMode.HALF_UP));
		}

	}

}
