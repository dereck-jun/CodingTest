package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P27323_직사각형 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());

		System.out.println(M * N);
	}

}
