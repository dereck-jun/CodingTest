package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P11654_아스키_코드 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		System.out.println((int) input.charAt(0));
	}

}
