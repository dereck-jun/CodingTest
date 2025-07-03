package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2908_상수 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		String[] arr = input.split(" ");
		for (int i = 0; i < arr.length; i++) {
			StringBuilder sb = new StringBuilder();
			arr[i] = sb.append(arr[i]).reverse().toString();
		}

		int num = Math.max(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
		System.out.println(num);
	}

}
