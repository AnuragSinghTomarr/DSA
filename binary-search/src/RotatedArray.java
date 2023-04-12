public class RotatedArray {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    System.out.println("Pivot Element is " + findPivot(arr));
  }

  static int findPivot(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
      int mid = (int)(start + (end - start)/2);

      if (mid < end && arr[mid] > arr[mid + 1]) {
        return mid;
      }
      if (arr[start] > arr[mid]) {
        // pivot lies in LHS
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }
}
