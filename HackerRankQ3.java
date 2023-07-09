import java.util.Scanner;

public class HackerRankQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int H = sc.nextInt();
        try {
            if (B > 0 && H > 0) {
                System.out.println(B * H);
            } else {
                throw new Exception("Breadth and height must be positive");

            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sc.close();
        }
    }

}
