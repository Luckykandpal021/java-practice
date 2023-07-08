// Syntax Error
// public class ExceptionHandling {
//     public static void main(String[] args) {
//         system.out.println();
//     }
// }

// //Logical Error:- we want to add number but by mistake we subtract it 
// public class ExceptionHandling {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 10;
//         int result = a - b;
//         System.out.println(result);
//     }
// }

// Runtime Error:- when on compiler, compiler not found any types of syntax error or logical error then on Runtime it founds an Exception is known as a RunTime Error
// public class ExceptionHandling {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 0;
//         int result = a / b;
//         System.out.println(result);
//     }
// }

//try-catch for normal expression or normal code
// public class ExceptionHandling {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 0;
//         int result = 0;
//         try {
//             result = a / b;
//             // if any Exception Found then try block returns Exception Object
//         } catch (Exception e) {
//             System.out.println("Something went wrong....");
//         }
//         System.out.println(result);
//         System.out.println("Bye");
//     }
// }

// Without try-catch 
// public class ExceptionHandling {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 0;
//         int result = 0;

//         result = a / b;
//         // if any Exception Found then try block returns Exception Object

//         System.out.println(result);
//         System.out.println("Bye");
//     }
// }

// public class ExceptionHandling {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 0;
//         int result = 0;
//         try {
//             result = a / b;
//             System.out.println("Try Block Executed");
//         } catch (Exception e) {
//             System.out.println("Something went wrong...." + e);
//         }
//         System.out.println(result);
//         System.out.println("Bye");
//     }
// }

// public class ExceptionHandling {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 0;
//         int result = 0;
//         try {
//             result = a / b;
//             System.out.println("Try Block Executed");
//         } catch (ArithmeticException e) {
//             System.out.println("Something went wrong...." + e);
//         }
//         System.out.println(result);
//         System.out.println("Bye");
//     }
// }

// public class ExceptionHandling {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 0;
//         int result = 0;
//         int newArr[] = { 5, 25, 878 };
//         String abc = null;
//         try {
//             result = a / abc.length();
//             System.out.println(result);
//             System.out.println(newArr[8]);
//             System.out.println("Try Block Executed");
//         } catch (ArithmeticException e) {
//             System.out.println("Arithmetic Error Occurs" + e);
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Stay in Limit." + e);
//         }

//         System.out.println(result);
//         System.out.println("Bye");
//     }
// }

// public class ExceptionHandling {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 0;
//         int result = 0;
//         int newArr[] = { 5, 25, 878 };
//         String abc = null;
//         try {
//             result = a / abc.length();
//             System.out.println(result);
//             System.out.println(newArr[8]);
//             System.out.println("Try Block Executed");
//         } catch (ArithmeticException e) {
//             System.out.println("Arithmetic Error Occurs" + e);
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Stay in Limit." + e);
//         } catch (Exception e) {
//             System.out.println("Error Occured Exception" + e);
//         }

//         System.out.println(result);
//         System.out.println("Bye");
//     }
// }

// import java.util.InputMismatchException;
// import java.util.Scanner;

// public class ExceptionHandling {
//     public static void main(String[] args) {
//         Scanner userInput = new Scanner(System.in);
//         int num = 0;
//         try {
//             num = userInput.nextInt();

//         } catch (InputMismatchException e) {
//             System.out.println("Something Went Wrong" + e);
//         } finally {
//             userInput.close();

//         }
//         System.out.println(num);
//     }
// }

// import java.util.InputMismatchException;
// import java.util.Scanner;

// public class ExceptionHandling {
//     public static void main(String[] args) {
//         Scanner userInput = new Scanner(System.in);
//         int num = 0;
//         try {
//             num = userInput.nextInt();

//         } finally {
//             userInput.close();
//             System.out.println("Resources in Closed");
//         }
//         System.out.println(num);
//     }
// }

// try with resource
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        int num = 0;
        try (Scanner userInput = new Scanner(System.in);) {
            num = userInput.nextInt();

        }
        System.out.println(num);
    }
}
