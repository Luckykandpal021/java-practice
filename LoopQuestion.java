import java.util.Scanner;

// Multiplication by Input
public class LoopQuestion {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter Your Multiplication Number:- ");
        int n = userInput.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
        userInput.close(); // Close the Scanner object

    }
}
