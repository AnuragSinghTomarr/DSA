import java.util.Scanner;
public class BasicPrograms {
    static void occurrences() {
        Scanner input = new Scanner(System.in);
        long n;
        int d;
        int count = 0;

        System.out.print("Enter a number: ");
        n = input.nextLong();

        System.out.print("Enter a digit to find its occurrence: ");
        d = input.nextInt();

        while (n != 0) {
            long rem = n % 10;
            if (rem == d) {
                count += 1;
            }
            n = n / 10;
        }

        System.out.println(d + " occurred " + count + " times");
    }

    static void reverse() {
        Scanner input = new Scanner(System.in);

        int n;
        int revNum = 0;

        System.out.print("Enter a number: ");
        n = input.nextInt();

        while (n != 0) {
            int rem = n % 10;
            revNum = (revNum * 10) + rem;
            n = n / 10;
        }

        System.out.println(revNum);
    }
    public static void main(String[] args) {
//        occurrences();
        reverse();
    }
}
