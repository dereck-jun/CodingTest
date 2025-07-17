package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11005_진법_변환_2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int num = Integer.parseInt(st.nextToken());
		int radix = Integer.parseInt(st.nextToken());

		String result = Integer.toString(num, radix).toUpperCase();
		System.out.println(result);
	}

}
