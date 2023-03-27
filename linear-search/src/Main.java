import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    int[] arr = new int[5];
    int item;
    Scanner in = new Scanner(System.in);

    System.out.println("Enter 5 elements: ");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = in.nextInt();
    }
    System.out.println("Enter element to find: ");
    item = in.nextInt();

    System.out.println("Element is found at index " + linearSearch(arr, item));
  }

// Search the array for item. If found return the index otherwise return -1

  static int linearSearch(int[] arr, int item) {
    int index = -1;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == item) {
        index = i;
        break;
      }
    }
    return index;
  }
}