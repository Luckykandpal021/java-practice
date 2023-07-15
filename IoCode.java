import java.io.*;

class IoCode {
    public static void main(String[] args) throws IOException {
        File dir = new File("PWJAVA");
        System.out.println(dir.isDirectory());
        dir.mkdir();
        File file = new File(dir, "pwSkill.txt");
        System.out.println(file.isFile());
        file.createNewFile();
        String allFiles[] = dir.list();
        int count = 0;
        for (String name : allFiles) {
            count++;
            System.out.println(name);
        }
        System.out.println("Number of Files are :-" + count);
        File fs = new File("C:");
        String allFile[] = fs.list();
        for (String i : allFile) {
            System.out.println(i);
        }
        FileWriter fw = new FileWriter(file);
        fw.write("PW\n");
        fw.write(124 + "\n");
        char ch[] = { 'a', 'b', 'c', 'd' };
        fw.write(ch);
        fw.write("\n");
        fw.close();
    }
}

// class Student {
// private String name;
// private int age;
// private String city;

// public Student(String name, int age, String city) {
// this.name = name;
// this.age = age;
// this.city = city;
// }

// }

// public class IoCode {
// public static void main(String[] args) {
// Student std1 = new Student("Virat", 28, "Delhi");
// System.out.println(std1);
// }
// }
// Output:- Will Print address in memory Student@3fee733d

// class Student {
// private String name;
// private int age;
// private String city;

// public Student(String name, int age, String city) {
// this.name = name;
// this.age = age;
// this.city = city;
// }

// public String toString() {
// return "Name :" + name + " | Age :" + age + " |City :" + city;
// }
// }

// public class IoCode {
// public static void main(String[] args) {
// Student std1 = new Student("Virat", 28, "Delhi");
// System.out.println(std1);
// System.out.println(std1.toString());
// }
// }
// // Output:-
// Name :Virat | Age :28 |City :Delhi
// Name :Virat | Age :28 |City :Delhi
// Output:- Will Print address in memory Student@3fee733d
