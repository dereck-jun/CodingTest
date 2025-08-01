package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2745_진법_변환 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String num = st.nextToken();
		int radix = Integer.parseInt(st.nextToken());
		System.out.println();
		System.out.println(Integer.parseInt(num, radix));
	}

}
