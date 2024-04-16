import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

class Square {
    int side;

    Square(int side) {
        this.side = side;
    }

    int area() {
        return side * side;
    }
}

public class conditional {
    public static void main(String[] args) {
        Square[] squares = new Square[5];

        int[][] a = new int[3][];

        a[0] = new int[5];
        a[1] = new int[3];
        a[2] = new int[4];


        // System.out.println("Enter input: ");
        // Scanner sc = new Scanner(System.in);

        // // switch statements

        // int a = sc.nextInt();

        // String key = sc.next();

        // int outcome = rfvrcrfxxfe3cffg(a) {
        // case 1: {
        // System.out.println("a is 1");
        // yield 1;
        // }
        // case 2 : {
        // System.out.println("a is 2");
        // yield 2;
        // }
        // case 3 : {
        // System.out.println("a is 3");
        // yield 3;
        // }
        // default : {
        // System.out.println("a is not 1, 2, or 3");
        // yield 0;
        // }
        // };
    }

    // switch (a) {
    // case 1:
    // System.out.println("a is 1");
    // break;
    // case 2:
    // System.out.println("a is 2");
    // break;
    // case 3:
    // System.out.println("a is 3");
    // break;
    // default:
    // System.out.println("a is not 1, 2, or 3");
    // }

    // different things in switch statements

    // switch(a) {
    // case 1:
    // System.out.println("a is 1");
    // break;
    // case 2:
    // System.out.println("a is 2");
    // break;
    // case 3:
    // System.out.println("a is 3");
    // break;
    // case 4:
    // case 5:
    // System.out.println("a is 4 or 5");
    // break;
    // default:
    // System.out.println("a is not 1, 2, 3, 4, or 5");
    // }

    // loop1:
    // for (int i = 0; i < 10; i++) {
    // System.out.println();
    // loop2:
    // for (int j = 0; j < 10; j++) {
    // System.out.print(i);
    // if(i == 7 && j == 3) {
    // break loop2;
    // }
    // }
    // }

    // while (true) {
    // int a = sc.nextInt();
    // int b = sc.nextInt();

    // if (a > b) {
    // System.out.println("a is greater than b");
    // } else if (a < b) {
    // System.out.println("a is less than b");
    // } else {
    // System.out.println("a is equal to b");
    // }
    // }

    // int[] arr = new int[5];

    // ArrayList<Integer> list = new ArrayList<>();

    // System.out.println("Enter 7 numbers: ");

    // for (int i = 0; i < 7; i++) {
    // list.add(sc.nextInt());
    // }

    // // sort
    // list.sort(null);

    // System.out.println(list);

    // for (int i = 0; i < 5; i++) {
    // arr[i] = sc.nextInt();
    // }

    // Arrays.sort(arr);

    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + ", ");
    // }

}