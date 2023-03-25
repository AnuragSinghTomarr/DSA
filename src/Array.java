import java.util.*;
public class Array {
    public static void primitiveArrayInput() {
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer elements ");
        for(int i=0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void nonPrimitiveArrayInput() {
        String[] str = new String[5];
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 5 words ");
        for (int i=0; i < 5; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));
    }
    public static void main(String[] args) {
        // primitiveArrayInput();
        nonPrimitiveArrayInput();
    }
}
