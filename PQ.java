import java.util.PriorityQueue;

class Hobby {
    String name;
    int rating;

    public Hobby(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String toString() {
        return "Name: " + name + ", Rating: " + rating;
    }
}

class HobbyComparator implements Comparator<Hobby> {
    public int compare(Hobby h1, Hobby h2) {
        return h1.rating - h2.rating;
    }
}

public class PQ {
    public static void main(String[] args) {
        PriorityQueue<Hobby> pq2 = new PriorityQueue<Hobby>(new HobbyComparator());
        pq2.add(new Hobby("Reading", 10));
        pq2.add(new Hobby("Writing", 9));
        pq2.add(new Hobby("Coding", 8));
        pq2.add(new Hobby("Singing", 7));

        System.out.println("Using default comparator:");
        

        for (Hobby h : pq2) {
            System.out.println(h);
        }
    }
}
