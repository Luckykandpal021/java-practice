// public class ArrayProblem {
//     public static void main(String[] args) {
//         int[] arr1 = { 2, 5, 6, 8 };
//         System.out.println(arr1[0]);
//     }
// }

import java.util.ArrayList;
// The ArrayList class is a resizable array, which can be found in the java.util package.

public class ArrayProblem {
    public static void main(String[] args) {
        ArrayList<Object> arrList = new ArrayList();
        arrList.add(500);
        arrList.add("arrList");
        arrList.add(true);

        ArrayList<Object> arrayList = new ArrayList();
        arrayList.add("arrayList");
        arrayList.addAll(arrList);
        System.out.println(arrayList);

    }
}
