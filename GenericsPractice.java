import java.util.ArrayList;

public class GenericsPractice {
    public static void main(String[] args) {
        String arr[] = new String[10];
        arr[0] = "Lucky";
        // arr[1]=51; error befor compile because array follows type safety means which
        // type of data we are gonna work
        // ArrayList arr1 = new ArrayList();
        // arr1.add("Lucky");
        // arr1.add(50);
        // // Array List can take both type of data homogeneous and hetrogeneous

        // // String getData=arr1.get(0); error bcz it returns only object
        // String getData = (String) arr1.get(0); // type casting or downcasting by
        // String

        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("Lucky");
        // arr1.add(50); error bcz only String allowed
        // Array List can take both type of data homogeneous and hetrogeneous

        // String getData=arr1.get(0); error bcz it returns only object
        String getData = arr1.get(0); // no type casting required

    }
}
