package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2903_중앙_이동_알고리즘 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int point = (int) Math.pow((int) Math.pow(2, n) + 1, 2);

		System.out.println(point);
	}

}
