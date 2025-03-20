package algorithm;

public class QuickSortExample {

	// 퀵 정렬 메서드: 배열 arr의 low부터 high까지를 정렬
	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(arr, low, high);
			// 피벗의 왼쪽 부분 정렬
			quickSort(arr, low, pivotIndex - 1);
			// 피벗의 오른쪽 부분 정렬
			quickSort(arr, pivotIndex + 1, high);
		}
	}

	// 투 포인터 방식을 사용한 partition 메서드 (피벗: 오른쪽 끝 원소)
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];        // 피벗 선택 (오른쪽 끝 원소)
		int left = low;               // 왼쪽 포인터: 배열 시작점
		int right = high - 1;         // 오른쪽 포인터: 피벗 바로 왼쪽부터 시작

		while (true) {
			// 왼쪽 포인터: 피벗보다 작은 동안 계속 오른쪽으로 이동
			while (left <= right && arr[left] < pivot) {
				left++;
			}
			// 오른쪽 포인터: 피벗보다 큰 동안 계속 왼쪽으로 이동
			while (right >= left && arr[right] > pivot) {
				right--;
			}
			// 만약 left와 right가 교차(또는 같아짐)했으면 반복 종료
			if (left >= right) {
				break;
			}
			// left와 right가 가리키는 원소 교환
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;   // 교환 후 왼쪽 포인터 증가
			right--;  // 교환 후 오른쪽 포인터 감소
		}
		// left 위치의 원소와 피벗(arr[high])을 교환하여 피벗을 올바른 위치에 배치
		int temp = arr[left];
		arr[left] = arr[high];
		arr[high] = temp;

		return left;  // 피벗이 자리 잡은 인덱스를 반환
	}

	public static void main(String[] args) {
		int[] arr = {42, 32, 24, 60, 15};
		System.out.println("정렬 전: " + java.util.Arrays.toString(arr));
		quickSort(arr, 0, arr.length - 1);
		System.out.println("정렬 후: " + java.util.Arrays.toString(arr));
	}
}
