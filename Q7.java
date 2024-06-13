import java.io.FileReader;

public class Q7 {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("countme.txt");

        // read the number of lines in the file
        int i;
        int count = 1;

        while ((i = fr.read()) != -1) {
            if (i == '\n') {
                count++;
            }
        }

        fr.close();

        System.out.println("Number of lines in the file: " + count);

    }
}
