import java.util.*;
public class MultiDimensional {
  public static void static2DArray() {
    int[][] arr = {
      {1, 2, 3},
      {4, 5, 6}
    };

    // transverse this array

    // Nested for loop approach
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        System.out.print(arr[row][col] + " ");
      }
      System.out.println();
    }

    // for of loop approach
    for (int[] row : arr) {
      System.out.println(Arrays.toString(row));
    }
  }

  public static void dynamic2DArrayCreation() {
    Scanner in = new Scanner(System.in);

    int[][] arr = new int[3][2];

    for (int row = 0; row < arr.length; row++) {
      System.out.println("Enter elements for row" + (int)(row + 1));
      for (int col = 0; col < arr[row].length; col++) {
        arr[row][col] = in.nextInt();
      }
    }

    for (int[] row : arr) {
      System.out.println(Arrays.toString(row));
    }
  }
  public static void main(String[] args) {
//    static2DArray();
    dynamic2DArrayCreation();
  }
}
