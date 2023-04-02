public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] arr2 = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
    int target = 18;

    System.out.println("Element found at " + search1(arr2, target));
  }

  // return mid iff element found
  // return -1 iff element not found
  static int search(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
    int mid = 0;

    while (start <= end) {
//      mid = (int)(start + end)/2; // calculating midIndex - This can exceed the int range
      mid = (int)(start + (end - start)/2);

      if (target == arr[mid]) {
        return mid;
      } else if (target > arr[mid]) {
        start = mid + 1;
      } else {
        end = mid;
      }
    }
    return -1;
  }

  static int search1(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
    int mid = 0;

    while (start <= end) {
      mid = (int)(start + (end - start)/2);
      if (target == arr[mid]) {
        return mid;
      } else if (target > arr[mid]) {
        end = mid - 1;
      } else {
        start = mid;
      }
    }

    return -1;
  }
}