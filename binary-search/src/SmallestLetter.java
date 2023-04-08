import java.util.Scanner;
public class SmallestLetter {
  public static void main(String[] args) {
    char[] arr = new char[]{'b', 'd', 'g', 'h', 'm', 'q', 's', 'z'};

    Scanner in = new Scanner(System.in);
    System.out.println("Enter target character ");
    String target = in.next();

    int ans = solution(arr, target);
    System.out.println("Smallest Element greater than target " + (ans != -1 ? arr[ans] : "not found"));
  }

  static int solution(char[] arr, String str) {
    char target = str.charAt(0);
    int start = 0;
    int end = arr.length - 1;
    int mid = 0;

    if (target < arr[0]) {
      return -1;
    }

    while (start <= end) {
      mid = (int)(start + end)/2;

      if (target > arr[mid]) {
        start = mid + 1;
      } else if (target <= arr[mid]) {
        end = mid - 1;
      }
    }

    return end;
  }
}
