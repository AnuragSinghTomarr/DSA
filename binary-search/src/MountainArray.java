public class MountainArray {
  public static void main(String[] args) {
    int[] arr = {1, 3, 4, 6, 7, 8, 10, 17, 25, 33, 42};

    System.out.println("peak element is " + optimisedSolution(arr));
  }

  static int solution(int[] arr) {
    int target = 0;

    for (int i = 1; i <= arr.length - 2; i++) {
      if (arr[i] > arr[i - 1] && arr[i] > arr[i+1]) {
        target = arr[i];
      }
    }

    return target;
  }

  static int optimisedSolution(int[] arr) {
    int mid = 0;
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
      mid = (int)(start + end)/2;

      if (arr[mid] < arr[mid + 1]) {
        start = mid + 1;
      } else if (arr[mid] < arr[mid - 1]) {
        end = mid - 1;
      } else {
        return arr[mid];
      }
    }
    return -1;
  }
}
