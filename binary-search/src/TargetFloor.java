import java.util.Scanner;
public class TargetFloor {
  public static void main(String[] args) {
    int[] arr = new int[]{2, 4, 8, 12, 16, 18, 21, 26};

    Scanner in = new Scanner(System.in);
    System.out.println("Enter target element: ");
    int target = in.nextInt();

    System.out.println("Floor element: " + optimisedSolution(arr, target));
  }

  static int optimisedSolution(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
    int mid = 0;

    while (start <= end) {
      mid = (int)(start + (end - start)/2);

      if (target > arr[mid]) {
        start = mid + 1;
      } else if (target < arr[mid]) {
        end = mid - 1;
      } else {
        return arr[mid];
      }
    }

    return arr[end];
  }
}
