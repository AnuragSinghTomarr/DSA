// Find the first occurrence of the element in the mountain array
// arr = {1,2,3,4,5,4,3,1}  target = 3 => so here 3 occurs at 2 and 6 indexes and the first occurrence will be 2
public class MountainArraySearch {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 8, 5, 3, 1};
    int target = 11;

    int peakIndex = findPeakIndex(arr);

    if (peakIndex > -1) {
      int ans = binarySearch(arr, target, 0, peakIndex);
      if (ans == -1) {
        ans = binarySearch(arr, target, peakIndex, arr.length - 1);
      }
      System.out.println("First occurrence of " + target + " is " + ans);
    }
  }

  static int findPeakIndex(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
      int mid = (int)(start + (end - start)/2);

      if (arr[mid] < arr[mid + 1]) {
        // peak element will be RHS side
        start = mid + 1;
      } else {
        end = mid;
      }
    }
    // at the end start == end and at this point target will be start or end. Further we can check the target condition that it greater than its LHS and RHS element
    // this will cover the case where such target element does not exist. Example arr = {1,2,3,4,5}
    // here that target will not exist which will be greater than LSH and RHS.
    return start;
  }

  static int binarySearch(int[] arr, int target, int start, int end) {
    while (start <= end) {
      int mid = (int)(start + (end - start)/2);

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
