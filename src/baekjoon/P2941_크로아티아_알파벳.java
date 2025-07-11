package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2941_크로아티아_알파벳 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		// Set 선언 후 크로아티아 알파벳을 넣은 뒤, forEach로 확인할 경우 중복 카운팅 문제가 발생할 수 있음
		String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

		for (String s : croatia) {
			input = input.replaceAll(s, " ");
		}

		System.out.println(input.length());
	}

}
