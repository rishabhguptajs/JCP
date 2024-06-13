import java.io.FileReader;
import java.io.FileWriter;

public class Q4 {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("encrypted_message.txt");
        FileWriter fw = new FileWriter("decrypted_message.txt");

        int i;
        while ((i = fr.read()) != -1) {
            i -= 5;
            System.out.print((char) i);

            fw.write(i);
        }

        fr.close();
        fw.close();

        System.out.println("\nFile copied successfully.");
    }
}
