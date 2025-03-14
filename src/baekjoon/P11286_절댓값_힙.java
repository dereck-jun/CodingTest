package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class P11286_절댓값_힙 {
	public static void main(String[] args) throws IOException {
		// 절댓값 힙이란
		// 1. 배열에 정수를 넣는다. (이때 정수는 0이 아닌 수)
		// 2. 배열에서 절댓값이 가장 작은 값을 출력하고, 그 값을 배열에서 제거한다.
		// 3. 절댓값이 가장 작은 값이 여러 개일 때는, 가장 작은 수를 출력하고, 그 값을 배열에서 제거한다.
		// 4. 비어있는 배열에서 시작한다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
			int o1Abs = Math.abs(o1);
			int o2Abs = Math.abs(o2);
			if (o1Abs == o2Abs) {
				return o1 > o2 ? 1 : -1;
			}
			return o1Abs - o2Abs;
		});
		// 연산을 몇 번 진행할 것인지?
		int N = Integer.parseInt(br.readLine());

		// N 만큼 반복
		for (int i = 0; i < N; i++) {
			// 입력 받은 값이 0이 아니면 Queue에 추가
			int request = Integer.parseInt(br.readLine());
			if (request != 0) {
				queue.add(request);
			} else {
				// 입력받은 값이 0이면 우선순위에 따라 출력. 단, 내부가 비어있다면 0을 출력
				if (queue.isEmpty()) {
					System.out.println("0");
				} else {
					System.out.println(queue.poll());
				}
			}
		}
	}
}
