import java.io.*;

public class IoRead {
    public static void main(String[] args) throws Exception {
        File fs = new File("PWJAVA");
        File file = new File(fs, "pwSkill.txt");
        FileReader fw = new FileReader(file);
        int i = fw.read();
        System.out.println((char) i); // FOR PRINTING ONE CHARACTER AT A TIME ONLY
        while (i != -1)// Internally jb tk data khtm nahi ho jata||mtlb file mein data ab naa raha
        {
            System.out.println((char) i);
            i = fw.read();
        }
        fw.close();
    }
}
