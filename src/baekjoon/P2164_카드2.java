package baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2164_카드2 {
	// 맨 위 & 맨 아래를 Queue 의 형태로 생각할 수 있는가?
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// N 장의 카드가 1부터 N까지 번호가 붙어있고, 1번이 제일 위, N번이 제일 아래에 있음
		int N = sc.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}

		// 먼저 제일 위에 있는 카드를 버리고, 다음으로 위에 있는 카드를 제일 아래로 옮긴다.
		// 해당 동작을 카드가 한 장 남을 때까지 반복한다.
		while (queue.size() > 1) {
			queue.poll();
			queue.add(queue.poll());
		}

		// 마지막 남은 카드를 출력한다.
		System.out.println(queue.poll());
	}
}
