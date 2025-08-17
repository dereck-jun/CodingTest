package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P15894_수학은_체육과목_입니다 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());

		long result = 4 * n;

		System.out.println(result);
	}
}
