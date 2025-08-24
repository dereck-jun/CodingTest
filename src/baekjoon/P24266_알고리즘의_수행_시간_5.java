package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P24266_알고리즘의_수행_시간_5 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());

		System.out.println(n * n * n);
		System.out.println("3");
	}

}
