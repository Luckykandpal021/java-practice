import java.util.ArrayList;

class Student1 {
    private String name;
    private int id;
}

class Employee1 {
    private String name;
    private int id;
}

public class GenericsPractice2 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();
        Employee1 e1 = new Employee1();
        ArrayList<Student1> arr1 = new ArrayList<>();
        arr1.add(s1);
        arr1.add(s2);
        // arr1.add(e1); error bcz arr1 only taks Student1 type object
    }
}