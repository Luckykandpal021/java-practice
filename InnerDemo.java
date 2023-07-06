// Method 1 without static Keyword
// class A {
//     void showA() {
//         System.out.println("SHOW");
//     }

//     class B {
//         void showB() {
//             System.out.println("SHOW B");
//         }
//     }
// }

// public class InnerDemo {
//     public static void main(String[] args) {
//         A obj = new A();
//         obj.showA();
//         A.B obj1 = obj.new B();
//         obj1.showB();
//     }
// }

// Method 2 with static Keyword
// class A {
//     void showA() {
//         System.out.println("SHOW");
//     }

//     static class B {
//         void showB() {
//             System.out.println("SHOW B");
//         }
//     }
// }

// public class InnerDemo {
//     public static void main(String[] args) {
//         A obj = new A();
//         obj.showA();
//         A.B obj1 = new A.B();
//         obj1.showB();
//     }
// }

// Method 3 Multiple nested Inner Classes
class A {
    int age;
    String name;

    void showA() {
        System.out.println("SHOW");
        this.age = 52;
        this.name = "Lucky";
    }

    class B {
        void showB() {
            System.out.println("SHOW B");
            System.out.println(A.this.age = 55);
        }

    }

    class C {
        void showC() {
            A.this.name = "dsf";
            System.out.println("SHOW C");
            System.out.println(A.this.name = "dsf");
        }
    }

    static class D {
        void showC() {
            System.out.println("SHOW D");
        }
    }

}

public class InnerDemo {
    public static void main(String[] args) {
        A obj = new A();
        obj.showA();
        A.B obj1 = obj.new B();
        obj1.showB();
        A.C obj2 = obj.new C();
        obj2.showC();
        A.D obj3 = new A.D();
        obj3.showC();
    }
}
