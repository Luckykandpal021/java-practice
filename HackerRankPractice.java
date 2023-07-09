
// Find data type of an input and handle exception
import java.util.Scanner;

public class HackerRankPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfInputs = sc.nextInt();
        for (int i = 0; i < numberOfInputs; i++) {
            try {
                long x = sc.nextLong();
                if (x >= -(Math.pow(2, 7)) && x <= (Math.pow(2, 7) - 1)) {
                    System.out.println(x + " can be fitted in:\n* byte\n* short\n* int\n* long");

                } else if (x >= -(Math.pow(2, 15)) && x <= (Math.pow(2, 15) - 1)) {
                    System.out.println(x + " can be fitted in:\n* short\n* int\n* long");
                } else if (x >= -(Math.pow(2, 31)) && x <= (Math.pow(2, 31) - 1)) {
                    System.out.println(x + " can be fitted in:\n* int\n* long");
                } else if (x >= -(Math.pow(2, 63)) && x <= (Math.pow(2, 63) - 1)) {
                    System.out.println(x + " can be fitted in:\n* long");
                } else {
                    System.out.println(x + " can't be fitted anywhere.");
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");

            }
        }
        sc.close();

    }
}
