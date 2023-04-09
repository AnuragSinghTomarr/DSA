// FInd the given target in an array which contains elements in ascending order where the array length is infinite
public class InfiniteArray {
  public static void main(String[] args) {
    int[] arr = {1, 3, 4, 5, 7, 8, 12, 16, 24, 28, 31, 35, 36};
    int target = 37;

    System.out.println("Index of target element " + target + " is " + answer(arr, target));
  }

  static int answer(int[] arr, int target) {
    int start = 0;
    int end = 1;
    // here box size = (end - start) + 1 => (1 - 0) + 1 => 2
    try {
      while (target > arr[end]) {
        int temp = end;
        end = end + ((end - start) + 1) *2;
        start = temp;
      }
    } catch (Exception e) {
      end = arr.length - 1;
    }
    int ans = binarySearch(arr, target, start, end);
    return ans;
  }

  static int binarySearch(int[] arr, int target, int start, int end) {
    while (start <= end) {
      int mid = (start + end) / 2;

      if (target == arr[mid]) {
        return mid;
      } else if (target > arr[mid]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }
}
