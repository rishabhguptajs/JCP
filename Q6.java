import java.io.FileReader;

public class Q6 {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("input.txt");

        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }

        fr.close();
    }
}
