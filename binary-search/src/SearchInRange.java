import java.util.Arrays;
import java.util.Scanner;
public class SearchInRange {
  public static void main(String[] args) {
    int[] arr = new int[]{5, 7, 9, 11, 15, 15, 18, 21};
    Scanner in = new Scanner(System.in);

    System.out.println("Enter target element ");
    int target = in.nextInt();

    System.out.println("Target element " + target + " range is " + Arrays.toString(solution(arr, target)));
  }

  static int[] solution(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
    int mid = 0;
    int startBound = -1;
    int endBound = -1;

    while (start <= end) {
      mid = (int)(start + end)/2;

      if (target == arr[mid]) {
        startBound = searchInLhs(arr, target, start, mid -1);
        endBound = searchInRhs(arr, target, mid + 1, end);
        return new int[]{startBound, endBound};
      } else if (target > arr[mid]) {
        start = mid + 1;
      } else {
        end = mid -1;
      }
    }
    return new int[]{-1, -1};
  }

  static int searchInLhs(int[] arr, int target, int start, int end) {
    int mid = 0;
    while (start <= end) {
      mid = (int)(start + end)/2;

      if (target == arr[mid]) {
        end = mid - 1;
      } else if (target > arr[mid]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return start;
  }

  static int searchInRhs(int[] arr, int target, int start, int end) {
    int mid = 0;

    while (start <= end) {
      mid = (int)(start + end)/2;

      if (target == arr[mid]) {
        start = mid + 1;
      } else if (target > arr[mid]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return end;
  }

  static int[] bruteSolution(int[] arr, int target) {
    int start = -1;
    int end = -1;

    for (int i = 0; i <= arr.length - 1; i++) {
      if (target == arr[i] && start == -1) {
        // first occurrence found
        start = i;
        end = i;
      } else if (target == arr[i]) {
        end = end + 1;
      }
    }

    return new int[]{start, end};
  }
}
