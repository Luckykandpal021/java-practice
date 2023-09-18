import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet hs = new HashSet<>();
        hs.add(100);
        hs.add(true);
        hs.add(40.2);
        hs.add("hs");
        hs.add(40.2);
        System.out.println(hs);
        LinkedHashSet hs1 = new LinkedHashSet<>();
        hs1.add(100);
        hs1.add(true);
        hs1.add(40.2);
        hs1.add("hs");
        hs1.add(40.2);
        System.out.println(hs1);

    }
}
