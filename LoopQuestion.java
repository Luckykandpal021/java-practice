
// Question for a = a + (int) Math.pow(2, j) * b;
import java.util.Scanner;

class LoopQuestion {
    public static void main(String[] argh) {
        Scanner userInput = new Scanner(System.in);
        int t = userInput.nextInt();

        for (int i = 0; i < t; i++) {
            int a = userInput.nextInt();
            int b = userInput.nextInt();
            int n = userInput.nextInt();

            for (int j = 0; j < n; j++) {
                a = a + (int) Math.pow(2, j) * b;
                System.out.print(a + " ");
            }
            System.out.println("");
        }
        userInput.close();

    }
}

// // Multiplication by Input

// import java.util.Scanner;
// public class LoopQuestion {
// public static void main(String[] args) {
// Scanner userInput = new Scanner(System.in);
// System.out.print("Enter Your Multiplication Number:- ");
// int n = userInput.nextInt();
// for (int i = 1; i <= 10; i++) {
// System.out.println(n + " x " + i + " = " + n * i);
// }
// userInput.close(); // Close the Scanner object

// }
// }
