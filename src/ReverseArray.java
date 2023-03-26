import java.util.*;
public class ReverseArray {
  public static void swap(int[] arr, int start, int end) {
    int temp;
    temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
  }
  public static void main(String[] args) {
    int[] arr = new int[5];
    int start = 0;
    int end = arr.length - 1;

    Scanner in = new Scanner(System.in);

    System.out.println("Enter 5 elements ");
    for (int i = 0; i < 5; i++) {
      arr[i] = in.nextInt();
    }

    while (start < end) {
      swap(arr, start, end);
      start++;
      end--;
    }

    System.out.println("Reversed Array " + Arrays.toString(arr));
  }
}
