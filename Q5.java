import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Q5 {
    public static void main(String[] args) throws Exception{
        FileInputStream fi = new FileInputStream("image.png");
        FileOutputStream  fo = new FileOutputStream("copy_image.png");

        int i;
        while ((i = fi.read()) != -1) {
            System.out.print((char) i);

            fo.write(i);
        }

        fi.close();
        fo.close();

        System.out.println("\nFile copied successfully.");
    }
}
