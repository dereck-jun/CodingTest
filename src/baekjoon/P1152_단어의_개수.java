package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1152_단어의_개수 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().trim();
		String[] arr = input.split(" ");

		System.out.println(arr.length);
	}

}
