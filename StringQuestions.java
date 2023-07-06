// Output Format

import java.util.Scanner;

class StringQuestions {
    public static void main(String[] args) {
        int stringInputSize = 10;
        Scanner userInput = new Scanner(System.in);
        String stringInput = userInput.next();
        int intInput = userInput.nextInt();
        userInput.nextLine(); // Consume the newline character
        String stringInput1 = userInput.next();
        int intInput1 = userInput.nextInt();
        userInput.nextLine(); // Consume the newline character
        String stringInput2 = userInput.next();
        int intInput2 = userInput.nextInt();
        userInput.nextLine(); // Consume the newline character
        String whiteSpace = " ".repeat(10);
        int minIntLength = 0;
        int maxIntLength = 999;
        if (stringInput.length() <= stringInputSize || stringInput1.length() <= stringInputSize
                || stringInput2.length() <= stringInputSize
                || intInput >= minIntLength && intInput <= maxIntLength
                || intInput1 >= minIntLength && intInput1 <= maxIntLength
                || intInput2 >= minIntLength && intInput2 <= maxIntLength) {
            System.out.println("================================");
            System.out.printf("%-15s%03d%n", stringInput, intInput);
            System.out.printf("%-15s%03d%n", stringInput1, intInput1);
            System.out.printf("%-15s%03d%n", stringInput2, intInput2);
            System.out.println("================================");

        }
    }
}

// // Palindrome
// import java.util.Scanner;;

// class StringQuestions {
// public static void main(String[] args) {
// Scanner userInput = new Scanner(System.in);
// String stringValue = userInput.nextLine();
// String reverseString = "";
// for (int i = 0; i < stringValue.length(); i++) {
// reverseString += stringValue.charAt((stringValue.length() - 1) - i);

// }
// String result = (reverseString.equals(stringValue)) ? "Yes" : "No";
// System.out.println(result);
// userInput.close();
// }
// }

/*
 * Sample Input:-
 * 42
 * 3.1415
 * Welcome to HackerRank's Java tutorials!
 * 
 * Sample Output:-
 * String: Welcome to HackerRank's Java tutorials!
 * Double: 3.1415
 * Int: 42
 * 
 */
// import java.util.Scanner;

// class StringQuestions {
// public static void main(String[] args) {
// Scanner userInput = new Scanner(System.in);
// int intValue = userInput.nextInt();
// double doubleValue = userInput.nextDouble();
// userInput.nextLine();
// String stringValue = userInput.nextLine();
// System.out.println("String: " + stringValue);
// System.out.println("Double: " + doubleValue);
// System.out.println("Int: " + intValue);

// userInput.close();
// }
// }

// Sample input:-
// Helloworld
// 3 7
// Sample Output:- lowo

// import java.util.Scanner;

// class StringQuestions {
// public static void main(String[] args) {
// Scanner userInput = new Scanner(System.in);
// String stringValue = userInput.nextLine();
// int intValue1 = userInput.nextInt();
// int inputValue2 = userInput.nextInt();
// System.out.println(stringValue.substring(intValue1, inputValue2));
// userInput.close();

// }
// }
