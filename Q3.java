import java.io.FileReader;
import java.io.FileWriter;

public class Q3 {
    public static void main(String[] args) throws Exception {
        String sourcePath = "source.txt";
        String destPath = "encrypted_message.txt";

        FileReader fr = new FileReader(sourcePath);
        FileWriter fw = new FileWriter(destPath);
        
        // encrypt the data by adding 5 to each character
        int i;
        while ((i = fr.read()) != -1) {
            i += 5;
            System.out.print((char) i);
            
            fw.write(i);
        }
        fr.close();
        fw.close();

        System.out.println("\nFile copied successfully.");
    }
}
