// interface Car {
//     void drive();
// }

// class WagonR implements Car {
//     public void drive() {
//         System.out.println("Driving...");
//     }
// }

// public class AnonymousInnerClass {
//     public static void main(String[] args) {
//         WagonR wr = new WagonR();
//         wr.drive();
//     }
// }

// interface Car {
//     void drive();
// }

// // can't create object of interface directly because it not containes implement
// // of method

// public class AnonymousInnerClass {
//     public static void main(String[] args) {
//         Car wr = new Car() { // another method for creating object this class is known as Anonymous class
//                              // this class only can use one time but for use
//             // multiple times we have to use implements using creating new class like above
//             // code
//             public void drive() {
//                 System.out.println("Driving..");
//             }
//         };
//         wr.drive();
//     }
// }

//doing with lambda expression

// interface Car {
//     void drive();
// }

// // can't create object of interface directly because it not containes implement
// // of method

// public class AnonymousInnerClass {
//     public static void main(String[] args) {
//         Car wr = () -> {
//             System.out.println("Driving..");

//         };
//         wr.drive();
//     }
// }

interface Car {
    void drive(int a, int b);
}

// can't create object of interface directly because it not containes implement
// of method

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Car wr = (a, b) -> {
            System.out.println("Driving.." + a + b);

        };
        wr.drive(55, 65);
    }
}

// lambda expr. works only on functional interface only method inside of
// interface works

// No Parameter Syntax:-
// ()->{
// //Body of no Parameter lambda
// }

// One Parameter Syntax
// p1->{
// //Body of single parameter lambda
// }

// Two Parameter Syntax
// (p1,p2)->
// {
// //Body of multiple parameter lambda
// }