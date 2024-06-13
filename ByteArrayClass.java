import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteArrayClass {
    public static void main(String[] args) {
        FileOutputStream fos = new FileOutputStream("./msg.txt");
        fos.write(259);
        fos.close();
        System.out.println("Done");

        FileInputStream fis = new FileInputStream("./msg.txt");
        System.out.println(fis.read());
    }
}
