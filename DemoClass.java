import java.io.*;

public class DemoClass{
    public static void main(String[] args) {
        // FileWriter fw = new FileWriter("data.txt");
        // String msg = "Java is a programming lang";
        // fw.write(msg);
        // fw.close();

        // System.out.println("Data written!");
        FileReader fr = new FileReader("data.txt");
        int t;

        // do {
            
        // } while (t != -1);

        FileReader fr = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr);
        
        String line = br.readLine();
        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
        fr.close();
    }
}
