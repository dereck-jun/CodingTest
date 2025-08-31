package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P19532_수학은_비대면_강의입니다 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());

		// 우리가 아는 연립 방정식으로도 풀 수 있지만 문제의 전제 조건 내에 0이 포함되기 때문에 간혹 0으로 나누는 경우가 발생함
		// 따라서 범위가 크지 않다는 것을 이용, 전체 탐색을 통해 답을 찾아내는 것이 문제에서 의도한 방법이다.
		for (int x = -999; x <= 999; x++) {
			for (int y = -999; y <= 999; y++) {
				if (a * x + b * y == c && d * x + e * y == f) {
					System.out.println(x + " " + y);
					return;
				}
			}
		}
	}

}
