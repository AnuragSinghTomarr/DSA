import java.util.Scanner;
public class TargetCeling {
  public static void main(String[] args) {
    int[] arr = new int[]{2, 3, 5, 9, 14, 16, 18};
    int target = 0;

    Scanner in = new Scanner(System.in);

    System.out.println("Enter target element: ");
    target = in.nextInt();

    System.out.println("Celling element: " + optimisedSolution(arr, target));
  }

  static int bruteForceSolution(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= target) {
        return arr[i];
      }
    }
    return Integer.MAX_VALUE;
  }

  static int optimisedSolution(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
    int mid = 0;

    while (start <= end) {
      mid = (int)(start + (end - start)/2);

      if (target == arr[mid]) {
        return arr[mid+1];
      }
      if (target > arr[mid]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return start <= arr.length ? arr[start] : Integer.MAX_VALUE;
  }
}
