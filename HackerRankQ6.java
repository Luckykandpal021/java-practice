import java.text.NumberFormat;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class HackerRankQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        Formatter formateIn = new Formatter();
        formateIn.format("%.2f", input);
        System.out.println(formateIn);
        NumberFormat currencyFormaterUs = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat currencyFormateChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat currencyFormateFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String usFormate = currencyFormaterUs.format(input);
        String chinFormate = currencyFormateChina.format(input);
        String franceFormate = currencyFormateFrance.format(input);
        System.out.println(usFormate + chinFormate + franceFormate);
        formateIn.close();
        sc.close();
        // Scanner sc = new Scanner(System.in);
        // double input = sc.nextDouble();
        // NumberFormat nf1 = NumberFormat.getInstance(Locale.US);
        // NumberFormat nf2 = NumberFormat.getInstance(Locale.CHINA);
        // NumberFormat nf3 = NumberFormat.getInstance(Locale.FRANCE);
        // System.out.println("US: $" + nf1.format(input) + "\nChina: \uFFE5" + nf2 +
        // "\nFrance: " + nf3 + " \u20AC");
        // sc.close();
    }
}