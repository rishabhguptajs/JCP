import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferStreamClass {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("msg.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            String msg = "Hello world";
            byte[] message = msg.getBytes();
            bos.write(message);
            bos.flush();
            bos.close();
            fos.close();
        } catch (Exception e) {
        }
    }
}
