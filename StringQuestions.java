
/*Sample Input:- 
42
3.1415
Welcome to HackerRank's Java tutorials!

Sample  Output:-
String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42

*/
// import java.util.Scanner;

// class StringQuestions {
//     public static void main(String[] args) {
//         Scanner userInput = new Scanner(System.in);
//         int intValue = userInput.nextInt();
//         double doubleValue = userInput.nextDouble();
//         userInput.nextLine();
//         String stringValue = userInput.nextLine();
//         System.out.println("String: " + stringValue);
//         System.out.println("Double: " + doubleValue);
//         System.out.println("Int: " + intValue);

//         userInput.close();
//     }
// }

// Sample input:-
// Helloworld
// 3 7
// Sample Output:- lowo

import java.util.Scanner;

class StringQuestions {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String stringValue = userInput.nextLine();
        int intValue1 = userInput.nextInt();
        int inputValue2 = userInput.nextInt();
        System.out.println(stringValue.substring(intValue1, inputValue2));
        userInput.close();

    }
}