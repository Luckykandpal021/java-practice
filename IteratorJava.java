import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorJava {
    public static void main(String[] args) {
        ArrayList ar1 = new ArrayList<>();
        ar1.add(10);
        ar1.add(20);
        ar1.add(30);
        ar1.add(100);
        System.out.println(ar1.size());
        // for (int i = 0; i < ar1.size(); i++) {
        // System.out.println(ar1.get(i));
        // }
        // for (Object o : ar1) {
        // System.out.println(o);
        // }
        // Iterator itr = ar1.iterator();
        // while (itr.hasNext()) {
        // // Integer i = (Integer) itr.next();
        // // System.out.println(i);
        // System.out.println(itr.next());
        // }
        ListIterator listr = ar1.listIterator(ar1.size());
        while (listr.hasPrevious()) {
            System.out.println(listr.previous());
        }
    }
}
