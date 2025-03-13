package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class P1874_스택_수열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 1;
		boolean result = true;
		StringBuilder sb = new StringBuilder();

		Stack<Integer> stack = new Stack<>();

		int[] N = new int[sc.nextInt()];
		for (int i = 0; i < N.length; i++) {
			N[i] = sc.nextInt();
		}

		for (int su : N) {
			if (num <= su) {
				while (num <= su) {
					stack.push(num++);
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			} else {
				int pop = stack.pop();
				if (pop > su) {
					System.out.println("NO");
					result = false;
					break;
				} else {
					sb.append("-\n");
				}
			}
		}

		if (result) {
			System.out.println(sb.toString());
		}
	}
}
