package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1427_소트인사이드 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 정렬하려고 하는 수 N을 입력 받음
		String N = br.readLine();

		int[] A = new int[N.length()];
		// 각 자릿수로 나눔
		for (int i = 0; i < N.length(); i++) {
			A[i] = Integer.parseInt(N.substring(i, i + 1));
		}

		// 그냥 값으로 접근하니까 정렬 과정에서 값이 올바르게 최신화가 안됨
		// 예시로 A[i]에는 max 값이 잘 들어가는데 max 값에 A[i]가 들어가지 않음
		// -> (인덱스에 저장된 값을 바꾼 것이 아니라 변수 값을 바꿨기 때문)
		for (int i = 0; i < A.length; i++) {
			int max = i;
			for (int j = i + 1; j < A.length; j++) {
				if (A[max] < A[j]) {
					max = j;
				}
			}
			if (A[i] < A[max]) {
				int temp = A[i];
				A[i] = A[max];
				A[max] = temp;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i : A) {
			sb.append(i);
		}

		System.out.println(sb);
	}
}
