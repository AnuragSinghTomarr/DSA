import java.lang.Math;
public class EvenNumberDigits {
  public static void main(String[] args) {
    int[] arr = {12, 345, 2, 6, 1234};

//  Find how many elements contains even number of digits
    System.out.println("Elements containing even digits " + solution2(arr));
  }

  static int solution(int[] arr) {
    int counter = 0;

    for (int element : arr) {
      int localCounter = 0;
      while (element != 0) {
        element = element / 10;
        localCounter++;
      }

      if (localCounter % 2 == 0) {
        counter++;
      }
    }

    return counter;
  }

  static int solution2(int[] arr) {
    int counter = 0;
    for (int element : arr) {
      int noOfDigits = (int)Math.log10(element) + 1;
      if (noOfDigits % 2 == 0) {
        counter++;
      }
    }
    return counter;
  }
}
