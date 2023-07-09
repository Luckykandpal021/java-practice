import java.util.Scanner;

public class HackerRankQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        if (n >= -100 && n <= 100) {
            try {
                String stringValue = String.valueOf(n);
                System.out.println("Good job");
            } catch (Exception e) {
                System.out.println("Wrong Error");
            } finally {
                sc.close();
            }
        }

    }
}
