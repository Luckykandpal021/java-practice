interface Computer {
    void compileCode();

    default void config() {
    }

    static void abc() {

    }
}

class Laptop implements Computer {
    public void compileCode() {
        System.out.println("You Got 5 ERRORS");
    }

    public void abc() {
        System.out.print("null");
    }
}

class Desktop implements Computer {
    public void compileCode() {
        System.out.println("Error have been Resolved");
    }
}

class InterefaceQuestions {
    public static void main(String[] args) {
        Computer obj = new Laptop();
        Computer obj1 = new Desktop();
        obj.compileCode();
        obj1.compileCode();
        Computer.abc();
    }
}

// Question 1

// interface newInterface {
// int n = 5;

// void newFun();
// }

// interface newInterface1 {
// int m = 55;

// void funNew();
// }

// class A implements newInterface, newInterface1 {
// public void newFun() {
// System.out.println("NEW FUN BEGINS!");
// }

// public void funNew() {
// System.out.println("funNew Begins");
// }
// }

// public class InterefaceQuestions {
// public static void main(String[] args) {
// System.out.println(newInterface.n);
// A obj = new A();
// obj.newFun();
// obj.funNew();
// }
// }
