import java.util.Arrays;

public class RichestWealth {
  public static void main(String[] args) {
    int[][] arr = new int[][]{{1, 2, 8}, {6, 2, 1}};

    System.out.println("Maximium amount " + Arrays.toString(solution(arr)));
  }

  static int[] solution(int[][] persons) {
    int max = Integer.MIN_VALUE;
    int index = 0;
    for (int[] person : persons) {
      int accountSum = 0;
      for (int bankAcc : person) {
        accountSum += bankAcc;
      }
      if (accountSum > max) {
        max = accountSum;
        index++;
      }
    }
    return new int[]{index-1, max};
  }

}
