import java.util.Scanner;

public class HackerRankQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (sc.hasNext()) {
            System.out.println(i + " " + sc.nextLine());
            i++;
        }
        sc.close();
    }
}
