import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;

public class SequenceISClass {
    public static void main(String[] args) throws IOException{
        FileOutputStream fos1 = new FileOutputStream("temp3.txt");
        FileOutputStream fos2 = new FileOutputStream("temp4.txt");

        fos1.write("Java".getBytes());
        fos2.write("Python".getBytes());
        fos1.close();
        fos2.close();

        FileInputStream fis1 = new FileInputStream("temp3.txt");
        FileInputStream fis2 = new FileInputStream("temp4.txt");
        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
        int i = 0;

        while((i = sis.read()) != -1){
            System.out.print((char)i);
        }

        sis.close();
    }
}

// filterInputStream and filterOutputStream in tomorrow's class

// filterInputStream is defined in java.io package. It is an abstract class that extends InputStream class. It provides the default implementation of all methods of InputStream class. It is used to provide additional functionalities to the input stream. It is the superclass of all classes that filter input streams. 

// // filterOutputStream is defined in java.io package. It is an abstract class that extends OutputStream class. It provides the default implementation of all methods of OutputStream class. It is used to provide additional functionalities to the output stream. It is the superclass of all classes that filter output streams.

// class MyFilterSteam extends FilterInputStream{
//     public MyFilterSteam(OutputStream in){
//         super(in);
//     }

//     @Override
//     public void write(int b) throws IOException{
//         if(b%2 == 0) {
//             super.write(b);
//         }
//     }
// }

// let there's a file, and important data in it including username, password. there's a term cryptography, which is used to encrypt the data. We need to apply that cryptography to the file.
// if small letter, add 4 to the ASCII value
// two methods, one for encryption and one for decryption

class EncryptDecrypt{
    public void encrypt(String fileName) throws IOException{
        FileInputStream fis = new FileInputStream(fileName);
        
    }
}