import java.util.Scanner;

class StringQuestions {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int intValue = userInput.nextInt();
        double doubleValue = userInput.nextDouble();
        userInput.nextLine(); // Consume the newline character

        String stringValue = userInput.nextLine();

        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + intValue);

        userInput.close();
    }
}
