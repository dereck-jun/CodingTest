package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1783_병든_나이트 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int y = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());

		int result = 0;

		if (y == 1) {
			result = 1;
		} else if (y == 2) {
			result = Math.min((x + 1) / 2, 4);
		} else if (y >= 3 && x < 7) {
			result = Math.min(x, 4);
		} else if (y >= 3 && x >= 7) {
			result = x - 2;
		}

		System.out.println(result);
	}

}
