package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2839_설탕_배달 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int count = 0;
		while (n >= 0) {
			if (n % 5 == 0) {  // 5로 나누어 떨어지면
				count += n / 5;
				System.out.println(count);
				return;
			}
			n -= 3;  // 5로 안 나누어 떨어지면 3을 빼기
			count++;
		}
		System.out.println(-1);  // 정확히 안 맞으면
	}
}
