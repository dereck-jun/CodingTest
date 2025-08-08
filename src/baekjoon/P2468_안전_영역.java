package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2468_안전_영역 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		// 행렬의 크기는 같음
		int[][] graph = new int[N][N];

		// 비의 높이를 구하기 위해 가장 높은 값을 저장
		int highest = Integer.MIN_VALUE;

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int j = 0; j < N; j++) {
				int height = Integer.parseInt(st.nextToken());
				graph[i][j] = height;
				highest = Math.max(highest, height);
			}
		}

		// 비의 높이의 따라 안전 구역이 가장 많이 나오는 값을 저장
		int maxSafeZone = 0;

		// 비의 높이 => 최소 ~ 최대까지 돌아야 함
		for (int rainHeight = 0; rainHeight <= highest; rainHeight++) {
			boolean[][] isVisited = new boolean[N][N];
			int safeZone = 0;

			// 모든 인덱스를 돌아야 함
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (!isVisited[i][j] && graph[i][j] > rainHeight) {
						dfs(i, j, isVisited, graph, rainHeight);

						// 연결된 모든 칸을 하나의 안전 구역으로 보기 때문에 모든 재귀 함수 호출이 끝난 뒤 값을 증가시킨다.
						safeZone++;
					}
				}
			}

			maxSafeZone = Math.max(maxSafeZone, safeZone);
		}

		System.out.println(maxSafeZone);
	}

	private static void dfs(int x, int y, boolean[][] isVisited, int[][] graph, int rainHeight) {
		isVisited[x][y] = true;

		int[] dx = {0, 0, -1, 1}; // 상하좌우
		int[] dy = {1, -1, 0, 0};

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			// graph의 길이는 행렬 상관 없이 같음.
			// 따라서 최소 인덱스(x, y = 0)와 최대 인덱스(x, y = N - 1) 범위 내에 있으면 OK
			if (nx >= 0 && ny >= 0 && nx < graph.length && ny < graph.length) {
				if (!isVisited[nx][ny] && graph[nx][ny] > rainHeight) {
					dfs(nx, ny, isVisited, graph, rainHeight);
				}
			}
		}
	}

}
