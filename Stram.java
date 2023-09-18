import java.util.ArrayList;

public class Stram {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> arr1 = new ArrayList<>();

        arr.add("one");
        arr.add("TWO");
        arr.add("Three");
        arr.add("Four");
        arr.add("Five");
        arr.add("Six");
        arr.add("Seven");

        System.out.println(arr);

        for (int i = arr.size() - 1; i >= 0; i--) {
            arr1.add(arr.get(i));
        }
        System.out.println(arr1);
    }

}
