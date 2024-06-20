import java.util.HashMap;
import java.util.Set;

// class Hobby{
//     String name;
//     int rating;

//     public Hobby(String name, int rating) {
//         this.name = name;
//         this.rating = rating;
//     }

//     public String toString() {
//         return "Name: " + name + ", Rating: " + rating;
//     }
// }

public class MapInterface {
    public static void main(String[] args) {
        // HashMap<Integer, Hobby> hm = new HashMap<Integer, Hobby>();

        // hm.put(1, new Hobby("Coding", 10));
        // hm.put(2, new Hobby("Dancing", 9));
        // hm.put(3, new Hobby("Singing", 9));
        // hm.put(4, new Hobby("Writing", 1000000));
        // hm.put(5, new Hobby("Dancing", 0));

        // for (int i : hm.keySet()) {
        //     System.out.println(hm.get(i));
        // }

        // Set<Integer> keys =

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[]{1, 2, 2, 4, 5, 1, 2, 5, 7, 8};

        for(int i : arr){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);  
            }
        }

        // second largest
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i : map.keySet()){
            if(map.get(i) > max){
                secondMax = max;
                max = map.get(i);
            } else if(map.get(i) > secondMax && map.get(i) != max){
                secondMax = map.get(i);
            }
        }

        System.out.println("Second largest: " + secondMax);
    }
}
