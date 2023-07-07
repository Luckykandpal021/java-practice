// import java.util.ArrayList;

// class CollectionPractice {
//     public static void main(String[] args) {
//         ArrayList al1 = new ArrayList();
//         // GROWABLE
//         al1.add(20); // Store as an object
//         al1.add(50);
//         al1.add(100);
//         System.out.println(al1);
//     }

// }

// Output:- Note: CollectionPractice.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// [20, 50, 100]

// Reason:- due to not use of a raw ArrayList (without specifying the type
// parameter) and can be resolved by using generics

import java.util.ArrayList;

class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        // GROWABLE
        al1.add(20); // Store as an object
        al1.add(50);
        al1.add(100);
        System.out.println(al1);

        ArrayList<Object> al2 = new ArrayList<>();
        al2.add(1);
        al2.add(5.5);
        al2.add("al2");
        al2.add("a");
        al2.addAll(al1);
        al2.add(2, "OBJECT");
        System.out.println(al2);
    }

}
