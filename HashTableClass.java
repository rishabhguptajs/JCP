import java.io.FileReader;
import java.io.FileWriter;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class HashTableClass {
    public static void main(String[] args) throws Exception {
        // Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

        // ht.put(1, "Sachin");
        // ht.put(1, "Kohli");
        // ht.put(1, "Rohit");
        // ht.put(1, "Bumrah");

        // System.out.println(ht);

        // for (int i : ht.keySet()) {
        //     System.out.println(ht.get(i));
        // }

        // Hashtable<Integer, String> table = new Hashtable<Integer, String>();

        // table.put(1, "Rishabh");
        // table.put(2, "Virat");
        // table.put(3, "Rohit");
        // table.put(4, "Rishabh");
        // table.put(5, "Rishabh");

        // for(int i : table.keySet()){
        //     System.out.println("Key: " + i + ", Value : " + table.get(i));
        // }

        Properties prop = new Properties();
        // prop.setProperty("Rishabh", "GG");
        // prop.setProperty("Pulkit", "KK");

        // prop.store(new FileWriter("credentials.txt"), "Save data");

        // prop.load(new FileReader("credentials.txt"));

        // Set s = prop.entrySet();

        // Iterator i = s.iterator();

        // while(i.hasNext()){
        //     System.out.println(i.next());
        // }

        Properties p = System.getProperties();


        for (int i = 0; i < 10; i++) {
            System.out.println(i*2);
        }

        // Set s = p.entrySet();
        // Iterator i = s.iterator();

        // while(i.hasNext()){
        //     System.out.println(i.next());
        // }
    }
}
