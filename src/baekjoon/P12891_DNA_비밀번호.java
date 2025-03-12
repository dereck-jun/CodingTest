package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12891_DNA_비밀번호 {
	static int[] checkDNA = new int[4];
	static int[] myArr = new int[4];
	static int checkSecret = 0;
	static int result = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 임의로 만든 DNA 문자열의 길이
		int S = Integer.parseInt(st.nextToken());

		// 부분 문자열의 길이
		int N = Integer.parseInt(st.nextToken());

		// 임의로 만든 DNA 문자열
		char[] DNA = new char[S];
		st = new StringTokenizer(br.readLine());
		DNA = st.nextToken().toCharArray();

		// 부분 문자열에 포함되어야 할 { A, C, G, T } 의 최소 개수가 공백을 구분으로 주어짐
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			checkDNA[i] = Integer.parseInt(st.nextToken());
			if (checkDNA[i] == 0) checkSecret++;
		}

		// 0 ~ N까지 조건에 대한 확인
		for (int i = 0; i < N; i++) {
			add(DNA[i]);
		}

		// 조건 부합 시 결과값++
		if (checkSecret == 4) result++;

		// 슬라이딩 윈도우
		// 이때 실제로 더하고 빼는 값은 각각 하나씩
		for (int i = N; i < S; i++) {
			int j = i - N;
			add(DNA[i]);
			sub(DNA[j]);
			if (checkSecret == 4) result++;
		}
		System.out.println(result);
	}

	private static void sub(char c) {
		switch (c) {
			case 'A': {
				if (checkDNA[0] == myArr[0]) checkSecret--;
				myArr[0]--;
				break;
			}
			case 'C': {
				if (checkDNA[1] == myArr[1]) checkSecret--;
				myArr[1]--;
				break;
			}
			case 'G': {
				if (checkDNA[2] == myArr[2]) checkSecret--;
				myArr[2]--;
				break;
			}
			case 'T': {
				if (checkDNA[3] == myArr[3]) checkSecret--;
				myArr[3]--;
				break;
			}
		}
	}

	private static void add(char c) {
		switch (c) {
			case 'A': {
				myArr[0]++;
				if (checkDNA[0] == myArr[0]) checkSecret++;
				break;
			}
			case 'C': {
				myArr[1]++;
				if (checkDNA[1] == myArr[1]) checkSecret++;
				break;
			}
			case 'G': {
				myArr[2]++;
				if (checkDNA[2] == myArr[2]) checkSecret++;
				break;
			}
			case 'T': {
				myArr[3]++;
				if (checkDNA[3] == myArr[3]) checkSecret++;
				break;
			}
		}
	}
}
