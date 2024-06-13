// We can have inputs in Java using File, Keyboard, and Network
// We can have outputs in form of file, on console, or onto the network.

// System.out - black color
// System.err - Red color

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOops {
    public static void main(String[] args) {
        // FileOutputStream fos = new FileOutputStream("msg.txt");
        // String msg = "Hello world";
        // byte[] message = msg.getBytes();
        // fos.write(message);

        try {
            FileInputStream fis = new FileInputStream("msg.txt");
            int k = 0;
            System.out.println("Your file says: ");
            while((k=fis.read()) != -1){
                System.out.print((char)k);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


