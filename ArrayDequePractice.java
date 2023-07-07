// import java.util.ArrayDeque;

// // In Collection hirerichy ArrayDeque implement queue and deque interface
// because dequeue also extend queue interface
// public class ArrayDequePractice {
// public static void main(String[] args) {
// ArrayDeque<Object> ad1 = new ArrayDeque<>();
// ad1.addFirst(20);
// ad1.add(50);
// ad1.add("ad1");
// ad1.addLast(5555);
// ad1.add("dgsdgsg");
// System.out.println(ad1);
// }
// }

// Output:-
// [20, 50, ad1, 5555, dgsdgsg]

// import java.util.ArrayDeque;

// public class ArrayDequePractice {
// public static void main(String[] args) {
// ArrayDeque<Object> ad1 = new ArrayDeque<>();
// ad1.add(50);
// ad1.add("ad1");
// ad1.addFirst(20);
// ad1.add("dgsdgsg");
// ad1.addLast(5555);
// System.out.println(ad1);
// }
// }

// Output:- [20, 50, ad1, dgsdgsg, 5555]

// OFFER V/S ADD METHOD, IN OFFER METHOD DATA CAN BE REJECT AND APPROVE, WHEREAS
// IN ADD METHOD DATA WILL ALWAYS BE APPROVED

// import java.util.ArrayDeque;

// public class ArrayDequePractice {
// public static void main(String[] args) {
// ArrayDeque<Object> ad1 = new ArrayDeque<>();
// ad1.add(50);
// ad1.add("ad1");
// ad1.addFirst(20);
// ad1.add("dgsdgsg");
// ad1.addLast(5555);
// ad1.offer(55544545);
// ad1.offerFirst(123);
// ad1.offerLast(99999999);
// System.out.println(ad1);
// }
// }

// output:- [123, 20, 50, ad1, dgsdgsg, 5555, 55544545, 99999999]
